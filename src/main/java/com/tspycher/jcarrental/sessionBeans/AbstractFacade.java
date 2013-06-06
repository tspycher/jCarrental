package com.tspycher.jcarrental.sessionBeans;

import java.lang.reflect.ParameterizedType;

import javax.ejb.EJB;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.tspycher.jcarrental.entity.AbstractEntity;
import com.tspycher.jcarrental.facility.LoggerFactoryLocal;

@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.REQUIRES_NEW)
public abstract class AbstractFacade<E extends AbstractEntity>{

	@PersistenceContext
	private EntityManager em;

	@EJB
	private LoggerFactoryLocal logger;
	
	public E find(Object id) {
		return (E) getEm().find(getEntityClass(), id);
	}

	public void create(E entity) {
		this.logger.debug("Created new Entity");
		getEm().persist(entity);
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
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
	
}
