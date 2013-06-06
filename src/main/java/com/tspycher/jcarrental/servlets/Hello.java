package com.tspycher.jcarrental.servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.tspycher.jcarrental.annotation.LogHTTP;
import com.tspycher.jcarrental.facades.CarFacadeRemote;
import com.tspycher.jcarrental.facility.LoggerFactoryLocal;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB
	private CarFacadeRemote car;
	
	@EJB
	private LoggerFactoryLocal loggerFactory;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @LogHTTP
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//this.car.create(new Car());
		response.getWriter().write("Blubb");
		this.loggerFactory.demo();
		this.loggerFactory.getLogger().info("Blubb");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
