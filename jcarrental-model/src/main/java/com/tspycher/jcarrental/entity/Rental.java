package com.tspycher.jcarrental.entity;

import com.tspycher.jcarrental.entity.AbstractEntity;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Rental
 *
 */
@Entity
@Table(name="rentals")

public class Rental extends AbstractEntity implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Rental() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

    @Column(name="startdate")
    @Temporal(TemporalType.DATE)
	private Date startDate;
    
    @Column(name="enddate")
    @Temporal(TemporalType.DATE)
	private Date endDate;
    
	//@ManyToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name="user_id")
	private User user;
	
	//@ManyToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name="car_id")
	private Car car;
	
	
	/**
	 * @return the id
	 */
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
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the user_id
	 */
	public User getUser_id() {
		return user;
	}

	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(User user) {
		this.user = user;
	}

	/**
	 * @return the car_id
	 */
	public Car getCar_id() {
		return car;
	}

	/**
	 * @param car_id the car_id to set
	 */
	public void setCar_id(Car car) {
		this.car = car;
	}
   
}
