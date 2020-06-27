package com.dynamicWR;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetDateTime extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Date d = new Date();
		String currentTime = d.toString();
		
		String response="<html>"+
		"<title> Static Web resource </title>"+
		"<body>"+
		"<h1> Current Time & date </br>"+
		"<font color=\"green\"> "+currentTime+" </font>"+
		"</h1>"+
		"</body>"+
	"</html>";
		resp.setHeader("refresh", "5");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println(response);
	}
	
}
