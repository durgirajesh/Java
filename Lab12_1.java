<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="add">
<h1 style="color:blue">Durgi Rajesh</h1>
<br>
<br>
<br>

<select name="player">
<option value="facebook">facebook</option>
<option value="instagram">instagram</option>

</select>
<br>
<hr>
<input type="Submit" value="Submit">

</form>
</body>
</html>


package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ser1 extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		String choice=req.getParameter("player");
		PrintWriter out=res.getWriter();
		if(choice.equals("facebook"))
		{
			res.sendRedirect("https://www.facebook.com/");
		}
		else
		{
			res.sendRedirect("https://www.instagram.com/");
		}
		out.close();

	}
}

<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd" id="WebApp_ID" version="4.0">
  <display-name>demoserv</display-name>
  <welcome-file-list>
    <welcome-file>index.html</welcome-file>
    <welcome-file>index.htm</welcome-file>
    <welcome-file>index.jsp</welcome-file>
    <welcome-file>default.html</welcome-file>
    <welcome-file>default.htm</welcome-file>
    <welcome-file>default.jsp</welcome-file>
  </welcome-file-list>
  
  <servlet>
  <servlet-name>abc</servlet-name>
  <servlet-class>com.telusko.ser1</servlet-class>
  </servlet>
  
  <servlet-mapping>
  <servlet-name>abc</servlet-name>
  <url-pattern>/add</url-pattern>
  </servlet-mapping>
</web-app>

