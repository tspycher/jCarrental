package com.tspycher.jcarrental.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-06-11T14:23:44.553+0200")
@StaticMetamodel(Rental.class)
public class Rental_ extends AbstractEntity_ {
	public static volatile SingularAttribute<Rental, Integer> id;
	public static volatile SingularAttribute<Rental, Date> startDate;
	public static volatile SingularAttribute<Rental, Date> endDate;
	public static volatile SingularAttribute<Rental, User> user;
	public static volatile SingularAttribute<Rental, Car> car;
}
