package com.tspycher.jcarrental.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("helo")
public class Helo {
	 @GET
	 public String getMovies() {
	
		 return "Blubb";
	 }
}