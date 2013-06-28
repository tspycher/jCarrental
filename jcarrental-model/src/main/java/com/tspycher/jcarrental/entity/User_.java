package com.tspycher.jcarrental.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-06-11T14:25:01.039+0200")
@StaticMetamodel(User.class)
public class User_ extends AbstractEntity_ {
	public static volatile SingularAttribute<User, Integer> id;
	public static volatile SingularAttribute<User, String> prename;
	public static volatile SingularAttribute<User, String> lastname;
	public static volatile SingularAttribute<User, String> email;
}
