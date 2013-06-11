package com.tspycher.jcarrental.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Car
 *
 */
@Entity
@Table(name="cars")
public class Car extends AbstractEntity implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Car() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column
	private String vendor;
	
	@Column
	private String model;
	
	@Column
	private Integer hp;
	
	@Column
	private Integer places;
	
	@Column
	private Integer month;
	
	@Column
	private Integer year;

	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="price_id")
	private Price price;
	
	/**
	 * @return the price
	 */
	public Price getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(Price price) {
		this.price = price;
	}

	/**
	 * @return the id
	 */
	//@Override
	public Integer getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the vendor
	 */
	public String getVendor() {
		return vendor;
	}

	/**
	 * @param vendor the vendor to set
	 */
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the hp
	 */
	public Integer getHp() {
		return hp;
	}

	/**
	 * @param hp the hp to set
	 */
	public void setHp(Integer hp) {
		this.hp = hp;
	}

	/**
	 * @return the places
	 */
	public Integer getPlaces() {
		return places;
	}

	/**
	 * @param places the places to set
	 */
	public void setPlaces(Integer places) {
		this.places = places;
	}

	/**
	 * @return the month
	 */
	public Integer getMonth() {
		return month;
	}

	/**
	 * @param month the month to set
	 */
	public void setMonth(Integer month) {
		this.month = month;
	}
	
	/**
	 * @return the year
	 */
	public Integer getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(Integer year) {
		this.year = year;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [id=" + id + ", vendor=" + vendor + ", model=" + model
				+ ", hp=" + hp + ", places=" + places + ", month=" + month
				+ ", year=" + year + ", price=" + price + "]";
	}
	
	
}
