package com.tspycher.jcarrental.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-06-06T15:17:59.705+0200")
@StaticMetamodel(Price.class)
public class Price_ extends AbstractEntity_ {
	public static volatile SingularAttribute<Price, Integer> id;
	public static volatile SingularAttribute<Price, Integer> weekday;
	public static volatile SingularAttribute<Price, Integer> saturday;
	public static volatile SingularAttribute<Price, Integer> sunday;
	public static volatile SingularAttribute<Price, Integer> weekend;
	public static volatile SingularAttribute<Price, Integer> week;
	public static volatile SetAttribute<Price, Car> cars;
}
