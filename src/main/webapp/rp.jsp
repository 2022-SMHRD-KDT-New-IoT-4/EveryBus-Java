<%@page import="org.apache.ibatis.reflection.SystemMetaObject"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%



	String v1 = request.getParameter("123");
	String v2 = request.getParameter("1234");
	

    out.print(v1);
    System.out.println(v1);
    System.out.println(v2);


%>