package com.tspycher.jcarrental.facades;

import java.util.List;

import javax.ejb.Local;
import javax.persistence.EntityTransaction;
import javax.validation.Valid;
import com.tspycher.jcarrental.entity.Rental;

@Local
public interface RentalFacadeLocal {
	public EntityTransaction getEntityTransation();
	/**
	 * Use this method to persist a new Rental object within the database If the
	 * Rental already exits, this one will not be persisted
	 * 
	 * @param Rental
	 *            : the Rental object with its parameters
	 * @return the Rental object with its primary key
	 */
	@Valid
	public void create(Rental rental);

	public void create(List<Rental> list);

	/**
	 * Use this method to edit the Rental object. Use the find method afterwards
	 * in order to validate the changes
	 * 
	 * @param Rental
	 *            : the Rental object with its primary key
	 */
	void edit(Rental rental);

	/**
	 * Use this method to remove the Rental object from the database.
	 * 
	 * @param Rental
	 *            : the Rental object with its primary key
	 */
	void remove(Rental rental);

	/**
	 * Use this method to find an Rental thanks to its primary key
	 * 
	 * @param id
	 *            : the primary key of the find method
	 * @return the corresponding Rental object or null if no Rental is found
	 */
	Rental find(Object id);

	/**
	 * Use this method to retrieve all Rental registered within the database
	 * 
	 * @return if no result found, the returned list is empty, otherwise this
	 *         method return a list with Rental object(s)
	 */
	List<Rental> findAll();

	/**
	 * Use this method to find an Rental in order to retrieve the primary key
	 * 
	 * @param Rental
	 *            : the Rental object with the description,tag and version
	 *            parameter
	 * @return the unique Rental object or null if no result found
	 */
	Rental findWithNoId(Rental rental);
}
