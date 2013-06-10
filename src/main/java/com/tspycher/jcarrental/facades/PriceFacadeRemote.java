package com.tspycher.jcarrental.facades;

import java.util.List;

import javax.ejb.Remote;
import javax.validation.Valid;
import com.tspycher.jcarrental.entity.Price;

@Remote
public interface PriceFacadeRemote {	
	
	/**
	 * Use this method to persist a new Price object within the database If the
	 * Price already exits, this one will not be persisted
	 * 
	 * @param Price
	 *            : the Price object with its parameters
	 * @return the Price object with its primary key
	 */
	@Valid
	void create(Price Price);

	/**
	 * Use this method to edit the Price object. Use the find method afterwards
	 * in order to validate the changes
	 * 
	 * @param Price
	 *            : the Price object with its primary key
	 */
	void edit(Price Price);

	/**
	 * Use this method to remove the Price object from the database.
	 * 
	 * @param Price
	 *            : the Price object with its primary key
	 */
	void remove(Price Price);

	/**
	 * Use this method to find an Price thanks to its primary key
	 * 
	 * @param id
	 *            : the primary key of the find method
	 * @return the corresponding Price object or null if no Price is found
	 */
	Price find(Object id);

	/**
	 * Use this method to retrieve all Price registered within the database
	 * 
	 * @return if no result found, the returned list is empty, otherwise this
	 *         method return a list with Price object(s)
	 */
	List<Price> findAll();

	/**
	 * Use this method to find an Price in order to retrieve the primary key
	 * 
	 * @param Price
	 *            : the Price object with the description,tag and version
	 *            parameter
	 * @return the unique Price object or null if no result found
	 */
	Price findWithNoId(Price Price);
}
