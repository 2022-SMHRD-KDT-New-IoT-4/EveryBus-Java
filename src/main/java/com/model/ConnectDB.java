package com.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.db.SqlSessionManager;

public class ConnectDB {
	private SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
    private static ConnectDB instance = new ConnectDB();

    public static ConnectDB getInstance() {
        return instance;
    }
    public ConnectDB() {  }

   

    String sql = "";
    String sql2 = "";
    String returns = "a";

    public String connectionDB(String id, String pwd) {
    	
    	SqlSession sqlSession = sqlSessionFactory.openSession(true);
        try {
           
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
          sqlSession.close();
        }
        return returns;
    }
}