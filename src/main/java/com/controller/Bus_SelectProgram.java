package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.model.Bus_InfoDAO;
import com.model.Bus_InfoDTO;

public class Bus_SelectProgram implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 버스 select
		Gson gson = new Gson();
		// 안드로이드에서 받은 값 가져오기
		String LineName = request.getParameter("LineName");

		Bus_InfoDTO dto = new Bus_InfoDTO();
		dto.setLine_name(LineName);

		Bus_InfoDAO dao = new Bus_InfoDAO();
		Bus_InfoDTO result = dao.select(dto);

	
			
		System.out.println(result);
		String jsonTest = gson.toJson(result);
		response.setContentType("application/json;charset=utf-8");
		response.getWriter().print(jsonTest);
			
			// 안드로이드 전송
			//out.println(returns);
			
	return null;
	
 }
}
