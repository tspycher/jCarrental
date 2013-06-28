package com.tspycher.jcarrental.facades;

import java.util.List;

import javax.ejb.Local;
import javax.persistence.EntityTransaction;
import javax.validation.Valid;
import com.tspycher.jcarrental.entity.Car;

//@Remote
@Local
public interface CarFacadeLocal {
	public EntityTransaction getEntityTransation();
	/**
	 * Use this method to persist a new Car object within the database If the
	 * Car already exits, this one will not be persisted
	 * 
	 * @param Car
	 *            : the Car object with its parameters
	 * @return the Car object with its primary key
	 */
	@Valid
	void create(Car Car);

	public void create(List<Car> list);

	/**
	 * Use this method to edit the Car object. Use the find method afterwards
	 * in order to validate the changes
	 * 
	 * @param Car
	 *            : the Car object with its primary key
	 */
	void edit(Car Car);

	/**
	 * Use this method to remove the Car object from the database.
	 * 
	 * @param Car
	 *            : the Car object with its primary key
	 */
	void remove(Car Car);

	/**
	 * Use this method to find an Car thanks to its primary key
	 * 
	 * @param id
	 *            : the primary key of the find method
	 * @return the corresponding Car object or null if no Car is found
	 */
	Car find(Object id);

	/**
	 * Use this method to retrieve all Car registered within the database
	 * 
	 * @return if no result found, the returned list is empty, otherwise this
	 *         method return a list with Car object(s)
	 */
	List<Car> findAll();

	/**
	 * Use this method to find an Car in order to retrieve the primary key
	 * 
	 * @param Car
	 *            : the Car object with the description,tag and version
	 *            parameter
	 * @return the unique Car object or null if no result found
	 */
	Car findWithNoId(Car Car);
}
