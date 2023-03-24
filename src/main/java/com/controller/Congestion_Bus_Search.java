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

@WebServlet("/congestionBusSearch")
public class Congestion_Bus_Search extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 버스 정보 search
				// gson 불러주자
				Gson gson = new Gson();
				// DAO
				Bus_InfoDAO dao = new Bus_InfoDAO();
				// DAO에 넣어주기
				List<Bus_InfoDTO> list = dao.congestionBusSearch();

				// list에 값이 있다면?
				if (list != null) {
					// response에 담아주기
					String result = gson.toJson(list);
					response.setContentType("application/json;charset=utf-8");
					// result : 안드로이드에서 받아오는 정보가 있는 닉네임
					response.getWriter().print(result);
				}
	}

}
