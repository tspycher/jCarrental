package com.tspycher.jcarrental.sessionBeans;

import javax.ejb.EJB;
import javax.ejb.Stateful;

import com.tspycher.jcarrental.entity.Car;
import com.tspycher.jcarrental.entity.Price;
import com.tspycher.jcarrental.facades.CarFacadeRemote;
import com.tspycher.jcarrental.facades.PriceFacadeRemote;
import com.tspycher.jcarrental.facility.LoggerFactoryLocal;

/**
 * Session Bean implementation class Core
 */
@Stateful
public class Core implements CoreRemote {

	@EJB
	private LoggerFactoryLocal logger;
	
	@EJB
	private CarFacadeRemote car;
	
	@EJB
	private PriceFacadeRemote price;
	
    /**
     * Default constructor. 
     */
    public Core() {
        // TODO Auto-generated constructor stub
    }

	public void demo() {
		logger.info("Buhuuuuuuu");
		
		// Create basic Price
		Price p = new Price();
		price.create(p);
		
		
		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.setPrice(p);
		c2.setPrice(p);
		
		car.create(c1);
		car.create(c2);
		// Create some cars and prices
	}

}
