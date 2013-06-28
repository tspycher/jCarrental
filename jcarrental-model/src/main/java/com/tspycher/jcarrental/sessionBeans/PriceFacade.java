package com.tspycher.jcarrental.sessionBeans;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.ejb.TransactionAttributeType;
import com.tspycher.jcarrental.entity.Price;
import com.tspycher.jcarrental.facades.PriceFacadeLocal;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.REQUIRES_NEW)
public class PriceFacade extends AbstractFacade<Price> implements PriceFacadeLocal {

	public List<Price> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Price findWithNoId(Price price) {
		// TODO Auto-generated method stub
		return null;
	}



}
