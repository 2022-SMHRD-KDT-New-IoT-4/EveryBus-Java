package com.model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.db.SqlSessionManager;

public class Bus_InfoDAO {
	
	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
    private static Bus_InfoDAO instance = new Bus_InfoDAO();

    public static Bus_InfoDAO getInstance() {
        return instance;
    }
    
 // 버스 정보 리스트
    public Bus_InfoDTO connectionDB(Bus_InfoDTO dto) {
    	Bus_InfoDTO result = null;
    	SqlSession sqlSession = sqlSessionFactory.openSession(true);
        try {
        	result = sqlSession.selectOne("com.model.Bus_InfoDAO.select", dto);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
          sqlSession.close();
        }
        return result;
    }
}
	
