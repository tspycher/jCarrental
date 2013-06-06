package com.tspycher.jcarrental.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-06-06T20:11:46.066+0200")
@StaticMetamodel(Car.class)
public class Car_ extends AbstractEntity_ {
	public static volatile SingularAttribute<Car, Integer> id;
	public static volatile SingularAttribute<Car, String> vendor;
	public static volatile SingularAttribute<Car, String> model;
	public static volatile SingularAttribute<Car, Integer> hp;
	public static volatile SingularAttribute<Car, Integer> places;
	public static volatile SingularAttribute<Car, Integer> month;
	public static volatile SingularAttribute<Car, Integer> year;
	public static volatile SingularAttribute<Car, Price> price;
}
