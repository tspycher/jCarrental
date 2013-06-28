package com.tspycher.jcarrental.facades;

import java.util.List;

import javax.ejb.Local;
import javax.persistence.EntityTransaction;
import javax.validation.Valid;
import com.tspycher.jcarrental.entity.User;

@Local
public interface UserFacadeLocal {
	public EntityTransaction getEntityTransation();
	/**
	 * Use this method to persist a new User object within the database If the
	 * User already exits, this one will not be persisted
	 * 
	 * @param User
	 *            : the User object with its parameters
	 * @return the User object with its primary key
	 */
	@Valid
	public void create(User user);

	public void create(List<User> list);

	/**
	 * Use this method to edit the User object. Use the find method afterwards
	 * in order to validate the changes
	 * 
	 * @param User
	 *            : the User object with its primary key
	 */
	void edit(User user);

	/**
	 * Use this method to remove the User object from the database.
	 * 
	 * @param User
	 *            : the User object with its primary key
	 */
	void remove(User user);

	/**
	 * Use this method to find an User thanks to its primary key
	 * 
	 * @param id
	 *            : the primary key of the find method
	 * @return the corresponding User object or null if no User is found
	 */
	User find(Object id);

	/**
	 * Use this method to retrieve all User registered within the database
	 * 
	 * @return if no result found, the returned list is empty, otherwise this
	 *         method return a list with User object(s)
	 */
	List<User> findAll();

	/**
	 * Use this method to find an User in order to retrieve the primary key
	 * 
	 * @param User
	 *            : the User object with the description,tag and version
	 *            parameter
	 * @return the unique User object or null if no result found
	 */
	User findWithNoId(User user);
}
