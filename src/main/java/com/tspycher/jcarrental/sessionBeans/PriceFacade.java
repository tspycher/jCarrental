package com.tspycher.jcarrental.sessionBeans;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.ejb.TransactionAttributeType;
import com.tspycher.jcarrental.entity.Price;
import com.tspycher.jcarrental.facades.PriceFacadeRemote;

@Stateless
@Remote(PriceFacadeRemote.class)
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.REQUIRES_NEW)
public class PriceFacade extends AbstractFacade<Price> implements PriceFacadeRemote {

	public List<Price> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Price findWithNoId(Price price) {
		// TODO Auto-generated method stub
		return null;
	}



}
