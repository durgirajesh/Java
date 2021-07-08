<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="calcul">

<h1 style="color:blue">Durgi Rajesh</h1>
<h1 style="color:blue">Calculator</h1>
<br>
Enter 1st <input type="text" name="num1"><br>
Enter 2nd <input type="text" name="num2"><br>

<select name="select">
<option value="+">Addtion</option>
<option value="-">Sub</option>
<option value="*">Mul</option>
<option value="/">Divison</option>

</select>
<br>
<hr>
<input type="Submit" value="Submit">

</form>
</body>
</html>
Web.xml
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
  <servlet-class>com.telusko.ser3</servlet-class>
  </servlet>
  
  <servlet-mapping>
  <servlet-name>abc</servlet-name>
  <url-pattern>/calcul</url-pattern>
  </servlet-mapping>
</web-app>
Ser3.java
package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ser3 extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		String choice=req.getParameter("select");
		
		int k=0;
		
		if(choice.equals("+"))
		{
			k=i+j;
			
		}
		else if(choice.equals("-"))
		{
			k=i-j;
		}
		else if(choice.equals("*"))
		{
			k=i*j;
		}
		else
		{
			k=i/j;
		}
		
		out.println("Result "+k);
	}

}
