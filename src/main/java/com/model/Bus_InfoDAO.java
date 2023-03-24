package com.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.db.SqlSessionManager;

public class Bus_InfoDAO {

	// 안드에서 받아올 때 필요한 것!
	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	private static Bus_InfoDAO instance = new Bus_InfoDAO();

	public static Bus_InfoDAO getInstance() {
		return instance;
	}

	// 버스 정보 리스트
	public Bus_InfoDTO routeBusInfo(Bus_InfoDTO dto) {
		Bus_InfoDTO result = null;
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		try {
			result = sqlSession.selectOne("com.model.Bus_InfoDAO.routeBusInfo", dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return result;
	}

	public List<Bus_InfoDTO> search() {
		List<Bus_InfoDTO> list = null;
		SqlSession sqlSession = sqlSessionFactory.openSession(true);

		try {
			list = sqlSession.selectList("com.model.Bus_InfoDAO.busSearch");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}

		return list;

	}

	public Bus_InfoDTO busInfo(Bus_InfoDTO dto) {
		Bus_InfoDTO result = null;
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		try {
			result = sqlSession.selectOne("com.model.Bus_InfoDAO.busInfo", dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return result;
	}

}
