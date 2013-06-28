package com.tspycher.jcarrental.entity;

import com.tspycher.jcarrental.entity.AbstractEntity;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity
@Table(name="users")
public class User extends AbstractEntity implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column
	private String prename;

	@Column
	private String lastname;

	@Column
	private String email;
	
	
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
	 * @return the prename
	 */
	public String getPrename() {
		return prename;
	}

	/**
	 * @param prename the prename to set
	 */
	public void setPrename(String prename) {
		this.prename = prename;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
}
