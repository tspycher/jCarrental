package com.tspycher.jcarrental.sessionBeans;

import java.util.ArrayList;

import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import com.tspycher.jcarrental.entity.Car;
import com.tspycher.jcarrental.entity.Price;
import com.tspycher.jcarrental.facades.CarFacadeRemote;
import com.tspycher.jcarrental.facades.PriceFacadeRemote;
import com.tspycher.jcarrental.facility.LoggerFactoryLocal;

/**
 * Session Bean implementation class Core
 */
//@Stateful
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class Core implements CoreRemote {

	@EJB
	private LoggerFactoryLocal logger;
	
	@EJB
	private CarFacadeRemote car;
	
	@EJB
	private PriceFacadeRemote price;
	
	@PersistenceContext
	private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public Core() {
        // TODO Auto-generated constructor stub
    }
	public void demo() {
		// Create basic Price
		Price p = new Price();
		//price.create(p);
		//em.persist(p);
		
		Car c1 = new Car();
		Car c2 = new Car();

		c1.setPrice(p);
		c2.setPrice(p);
		
		this.logger.getLogger().info(em.toString());
		this.logger.getLogger().info(String.format("CORE BEFORE Using Entity Manager with id %03d for %s", System.identityHashCode(c1), c1.toString()));
		this.logger.getLogger().info(String.format("CORE BEFORE Using Entity Manager with id %03d for %s", System.identityHashCode(c2), c2.toString()));
		//EntityTransaction t = car.getEntityTransation();
		//t.begin();
		//car.create(c1);
		//car.create(c2);
		ArrayList<Car> a = new ArrayList<Car>();
		a.add(c1);
		a.add(c2);
		car.create(a);
		
		//t.commit();
		
		//em.persist(c1);
		//em.persist(c2);
		this.logger.getLogger().info(String.format("CORE AFTER Using Entity Manager with id %03d for %s", System.identityHashCode(c1), c1.toString()));
		this.logger.getLogger().info(String.format("CORE AFTER Using Entity Manager with id %03d for %s", System.identityHashCode(c2), c2.toString()));
		// Create some cars and prices
	}

}
