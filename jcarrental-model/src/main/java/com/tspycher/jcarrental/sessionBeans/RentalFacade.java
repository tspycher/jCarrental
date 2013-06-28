package com.tspycher.jcarrental.sessionBeans;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.ejb.TransactionAttributeType;
import com.tspycher.jcarrental.entity.Rental;
import com.tspycher.jcarrental.facades.RentalFacadeLocal;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.REQUIRES_NEW)
public class RentalFacade extends AbstractFacade<Rental> implements RentalFacadeLocal {
	
	public List<Rental> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Rental findWithNoId(Rental rental) {
		// TODO Auto-generated method stub
		return null;
	}



}
