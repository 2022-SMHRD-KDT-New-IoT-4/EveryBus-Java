<%@page import="com.google.gson.Gson"%>
<%@page import="com.model.Bus_InfoDTO"%>
<%@page import="com.model.Bus_InfoDAO"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<% 

	Bus_InfoDAO bus_infoDAO = Bus_InfoDAO.getInstance();
	Gson gson = new Gson();

	// 한글 인코딩
	request.setCharacterEncoding("UTF-8");
	String line_id = request.getParameter("LineID");
	String line_name = request.getParameter("LineName");
	String dir_up_name = request.getParameter("dir_up_name");
	String dir_down_name = request.getParameter("dir_down_name");
	String line_kind = request.getParameter("line_kind");

	System.out.println(line_name);
	
	Bus_InfoDTO dto = new Bus_InfoDTO(line_id, line_name, dir_up_name, dir_down_name, line_kind);
	Bus_InfoDTO returns = bus_infoDAO.select(dto);

	System.out.println(returns);
	String jsonTest = gson.toJson(returns);
	response.setContentType("application/json;charset=utf-8");
	response.getWriter().print(jsonTest);
	
	// 안드로이드 전송
	out.println(returns);
%>