package com.tspycher.jcarrental.entity;

import com.tspycher.jcarrental.entity.AbstractEntity;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;
/**
 * Entity implementation class for Entity: Prices
 *
 */
@Entity
@Table(name="prices")
public class Price extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	public Price() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column
	private Integer weekday;
	
	@Column
	private Integer saturday;
	
	@Column
	private Integer sunday;
	
	@Column
	private Integer weekend;
	
	@Column
	private Integer week;
	
	@OneToMany(cascade = CascadeType.ALL)
    private Set<Car> cars;
	
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
	 * @return the weekday
	 */
	public Integer getWeekday() {
		return weekday;
	}

	/**
	 * @param weekday the weekday to set
	 */
	public void setWeekday(Integer weekday) {
		this.weekday = weekday;
	}

	/**
	 * @return the saturday
	 */
	public Integer getSaturday() {
		return saturday;
	}

	/**
	 * @param saturday the saturday to set
	 */
	public void setSaturday(Integer saturday) {
		this.saturday = saturday;
	}

	/**
	 * @return the sunday
	 */
	public Integer getSunday() {
		return sunday;
	}

	/**
	 * @param sunday the sunday to set
	 */
	public void setSunday(Integer sunday) {
		this.sunday = sunday;
	}

	/**
	 * @return the weekend
	 */
	public Integer getWeekend() {
		return weekend;
	}

	/**
	 * @param weekend the weekend to set
	 */
	public void setWeekend(Integer weekend) {
		this.weekend = weekend;
	}

	/**
	 * @return the week
	 */
	public Integer getWeek() {
		return week;
	}

	/**
	 * @param week the week to set
	 */
	public void setWeek(Integer week) {
		this.week = week;
	}
	
   
}
