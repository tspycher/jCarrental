package com.tspycher.jcarrental.sessionBeans;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import com.tspycher.jcarrental.entity.AbstractEntity;
import com.tspycher.jcarrental.facility.LoggerFactory;

@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public abstract class AbstractFacade<E extends AbstractEntity>{

	//@PersistenceContext
	@PersistenceContext
	private EntityManager em;

	/*@PersistenceUnit
	private EntityManagerFactory emf;
*/
	private LoggerFactory logger;
	
	public EntityTransaction getEntityTransation() {
		return em.getTransaction();
		//return null;
	}
	
	public E find(Object id) {
		return (E) getEm().find(getEntityClass(), id);
	}
	
	public void create(List<E> list) {
		for (E entity : list) {
			this.create(entity);
		}
	}
	
	public void create(E entity) {
		this.logger.info("Created new Entity");
		/*this.logger.getLogger().info(String.format("%03d",System.identityHashCode(em.getTransaction())));
		this.logger.getLogger().info(String.format("%03d",System.identityHashCode(em.getTransaction())));
*/
		//this.logger.getLogger().info(em.toString());
		//this.logger.getLogger().info(String.format("BEFORE Using Entity Manager with id %03d for %s %s", System.identityHashCode(getEm()), entity.getClass().toString(), entity.toString()));
		getEm().persist(entity);
		//this.logger.getLogger().info(String.format("AFTER Using Entity Manager with id %03d for %s %s", System.identityHashCode(getEm()), entity.getClass().toString(), entity.toString()));
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
		/*if (em == null) {
			em = emf.createEntityManager();
		}
		*/
		return em;
		//return emf.createEntityManager();
	}

	/*public void setEm(EntityManager em) {
		this.em = em;
	}*/
	
}
