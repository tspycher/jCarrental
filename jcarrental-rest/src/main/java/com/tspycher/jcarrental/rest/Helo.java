package com.tspycher.jcarrental.rest;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.tspycher.jcarrental.business.TestClassLocal;

@Path("helo")
public class Helo {
	
	 @EJB
	 private TestClassLocal x;
	 
	 @GET
	 public String getMovies() {
	
		 return this.x.blubb();
	 }
}