package com.tspycher.jcarrental.facility;

import javax.ejb.Singleton;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

/**
 * Session Bean implementation class Logger
 */
@Singleton
@TransactionManagement(TransactionManagementType.BEAN)
public class LoggerFactory implements LoggerFactoryLocal {
	
	//private static final Logger l = Logger.getLogger("Testlogger");
	private transient Logger l;

    public LoggerFactory() {
    	this("DemoLogger");
    }
    
    public LoggerFactory(String loggerName) {
    	l = Logger.getLogger(loggerName);
    	this.config();
    }
    
    public void demo() {
    	this.info("Info");
    	this.warn("Warn");
    	this.debug("Debug");
    	this.error("Error");
    	this.fatal("Fatal");
    }
    
    private Appender buildAppender() {
    	return this.buildAppender(null);
    }
    
    private Appender buildAppender(String logfile) {
    	logfile = (logfile == null) ? "/tmp/mylog.log" : logfile;

    	FileAppender fa = new FileAppender();
    	fa.setName("FileLogger");
    	fa.setFile(logfile);
    	fa.setLayout(new PatternLayout("%d %-5p [%c{1}] %m%n"));
    	fa.setThreshold(Level.DEBUG);
    	fa.setAppend(true);
    	fa.activateOptions();
    	return fa;
    }
    
    private void config() {
    	Logger.getRootLogger().removeAllAppenders();
    	ConsoleAppender console = new ConsoleAppender(); //create appender
    	
    	console.setLayout(new PatternLayout("%d [%p|%c|%C{1}] %m%n")); 
    	console.setThreshold(Level.FATAL);
    	console.activateOptions();
    	Logger.getRootLogger().addAppender(console);
    	
    	Logger.getRootLogger().addAppender(this.buildAppender());
    }
	public Logger getLogger() {
		return this.l;
		
	}
	public void info(String s) {
		l.info(s);
	}

	public void debug(String s) {
		l.debug(s);
	}

	public void warn(String s) {
		l.warn(s);
	}

	public void error(String s) {
		l.error(s);
	}

	public void fatal(String s) {
		l.fatal(s);
	}
}
