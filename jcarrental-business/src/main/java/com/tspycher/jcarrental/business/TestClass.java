package com.tspycher.jcarrental.business;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class TestClass
 */
@Stateless
public class TestClass implements TestClassLocal {

    /**
     * Default constructor. 
     */
    public TestClass() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String blubb() {
		// TODO Auto-generated method stub
		return "Test 2... 3... 4...";
	}
    
    

}
