package com.tspycher.jcarrental.sessionBeans;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.ejb.TransactionAttributeType;
import com.tspycher.jcarrental.entity.Car;
import com.tspycher.jcarrental.facades.CarFacadeRemote;

@Stateless
@Remote(CarFacadeRemote.class)
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.REQUIRES_NEW)
public class CarFacade extends AbstractFacade<Car> implements CarFacadeRemote {
	
	public List<Car> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Car findWithNoId(Car Car) {
		// TODO Auto-generated method stub
		return null;
	}



}
