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

	
}
