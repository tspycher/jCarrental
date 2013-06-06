package com.tspycher.jcarrental.facility;

import javax.ejb.Local;

import org.apache.log4j.Logger;

@Local
public interface LoggerFactoryLocal {
	public void demo();
	public void info(String s);
	public void debug(String s);
	public void warn(String s);
	public void error(String s);
	public void fatal(String s);
	public Logger getLogger();
}
