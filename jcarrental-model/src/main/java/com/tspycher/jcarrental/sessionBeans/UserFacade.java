package com.tspycher.jcarrental.sessionBeans;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.ejb.TransactionAttributeType;
import com.tspycher.jcarrental.entity.User;
import com.tspycher.jcarrental.facades.UserFacadeLocal;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(value = TransactionAttributeType.REQUIRES_NEW)
public class UserFacade extends AbstractFacade<User> implements UserFacadeLocal {
	
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public User findWithNoId(User user) {
		// TODO Auto-generated method stub
		return null;
	}



}
