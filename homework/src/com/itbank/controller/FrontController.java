package com.itbank.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itbank.action.CommandAction;

public class FrontController extends HttpServlet {
	
	private final String prefix = "/WEB-INF/views/";
	private final String suffix = ".jsp";
	
	private Map<String, CommandAction> map = new HashMap<String, CommandAction>();
	
	@Override
	public void init() throws ServletException {
		String configFile = getInitParameter("configFile");
		System.out.println(configFile);
		
		Properties pro = new Properties();
		FileInputStream fis = null;
		
		
		try {
			String configFilePath = getServletContext().getRealPath(configFile);
			fis = new FileInputStream(configFilePath);
			pro.load(fis);;
		} catch (IOException e) {
			throw new ServletException(e);
		} finally {
			if(fis != null) try { fis.close(); } catch (Exception e1) {}
		}
		System.out.println("pro : " + pro);
		
		Iterator<Object> it = pro.keySet().iterator();
		
		while(it.hasNext()) {
			String command = (String) it.next();
			String handlerClassName = pro.getProperty(command);								
			
			try {
				Class<?> handlerClass = Class.forName(handlerClassName);					
				CommandAction handlerInstance = (CommandAction) handlerClass.newInstance();	
				map.put(command, handlerInstance);
				
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				throw new ServletException(e);
			}
		}
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");								
		response.setCharacterEncoding("UTF-8");								
		
		String command = request.getRequestURI();						
		
		if(command.indexOf(request.getContextPath()) == 0) {				
			command = command.substring(request.getContextPath().length());	
		}
		System.out.println("URI : " + request.getRequestURI());
		System.out.println("command : " + command);
		
		String viewPage = null;
		CommandAction action = map.get(command);						
		
		if(action == null) {
			request.getRequestDispatcher(prefix + "error" + suffix).forward(request, response);
			return;
		}
		
		try {
			switch(request.getMethod()) {
			case "GET": viewPage = action.doGet(request, response); break;
			case "POST": viewPage = action.doPost(request, response); break;
			default:	response.sendRedirect(request.getContextPath());
			}
		} catch (Throwable e) {
			throw new ServletException(e);
		}

		if(viewPage.indexOf("redirect:") == 0) {								
			String location = request.getContextPath() + viewPage.split(":")[1];
			response.sendRedirect(location);
		} else {
			viewPage = prefix + viewPage + suffix;								
			RequestDispatcher rd = request.getRequestDispatcher(viewPage);		
			System.out.println("forward to : " + viewPage);						
			rd.forward(request, response);										
		}
	}
}
