package com.servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import org.apache.log4j.PropertyConfigurator;

/**
 * Servlet implementation class InitLog4j
 */
@WebServlet("/InitLog4j")
public class InitLog4j extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	public void init()
	 {
	     String prefix =  getServletContext().getRealPath("/");
	     String file = getInitParameter("log4j-init-file");
	   
	     // if the log4j-init-file context parameter is not set, then no point in trying
	     if(file != null){
	      PropertyConfigurator.configure(prefix+file);
	      System.out.println("Log4J Logging started: " + prefix+file);
	     }
	     else{
	      System.out.println("Log4J Is not configured for your Application: " + prefix + file);
	     }     
	 }

	

}
