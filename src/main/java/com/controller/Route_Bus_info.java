package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.model.Bus_InfoDAO;
import com.model.Bus_InfoDTO;

@WebServlet("/Route_Bus_info")
public class Route_Bus_info extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// gson 불러주자
		Gson gson = new Gson();

		// 안드로이드에서 입력한 값 받아오기
		String line_name = request.getParameter("LineName");
		Bus_InfoDAO dao = Bus_InfoDAO.getInstance();

		System.out.println(line_name);

		Bus_InfoDTO dto = new Bus_InfoDTO();
		dto.setLine_name(line_name);

		Bus_InfoDTO result = dao.routeBusInfo(dto);

		System.out.println(result);
		// jsonTest
		String jsonTest = gson.toJson(result);
		response.setContentType("application/json;charset=utf-8");
		response.getWriter().print(jsonTest);

	}

}
