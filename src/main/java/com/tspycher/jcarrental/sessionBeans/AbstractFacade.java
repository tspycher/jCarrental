package com.tspycher.jcarrental.sessionBeans;

import java.lang.reflect.ParameterizedType;

import javax.ejb.EJB;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import com.tspycher.jcarrental.entity.AbstractEntity;
import com.tspycher.jcarrental.facility.LoggerFactoryLocal;

@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)//(value = TransactionAttributeType.REQUIRES_NEW)
public abstract class AbstractFacade<E extends AbstractEntity>{

	@PersistenceContext
	private EntityManager em;

	@PersistenceUnit
	private EntityManagerFactory emf;

	@EJB
	private LoggerFactoryLocal logger;
	
	public E find(Object id) {
		return (E) getEm().find(getEntityClass(), id);
	}
	
	public void create(E entity) {
		this.logger.info("Created new Entity");
		getEm().persist(entity);
		this.logger.getLogger().info(String.format("Using Entity Manager with id %03d for %s", System.identityHashCode(getEm()), entity.getClass().toString()));
		//getEm().flush();
		//this.logger.debug(String.format("Created new %s with id %d", entity.getClass().toString(), entity.getId().toString() ));
	}

	public void edit(E entity) {
		getEm().merge(entity);
	}

	public void remove(E entity) {
		getEm().remove(getEm().merge(entity));
	}

	@SuppressWarnings("unchecked")
	protected Class<E> getEntityClass() {
		return (Class<E>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}

	public EntityManager getEm() {
		//if (em == null) {
		//	em = emf.createEntityManager();
		//}
		return em;
		//return emf.createEntityManager();
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
}
