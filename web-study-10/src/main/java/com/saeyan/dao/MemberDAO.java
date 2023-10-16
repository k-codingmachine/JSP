package com.saeyan.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.saeyan.dto.MemberVO;

// 싱글톤 패턴 -- MemberDAO 하나만 생성하겠다.
public class MemberDAO {

	private static MemberDAO instance = new MemberDAO(); // 내가 하나의 생성자만 만든다.
	
	private MemberDAO() {} // 외부에서 생성자 생성 불가
		
	public static MemberDAO getInstance() { // 이 메소드 외부에서 호출x -> instance메소드는 객체생성후 호출 가능
		return new MemberDAO();
	}
	
	public Connection getConnection() throws SQLException {
		Connection conn = null; // 안에있던 지역변수를 밖으로 꺼내준다.
		try {
			Context initContext = new InitialContext();
			Context envContext  = (Context)initContext.lookup("java:/comp/env");
			DataSource ds;
			ds = (DataSource)envContext.lookup("jdbc/myoracle");
			conn = ds.getConnection();
		} catch (NamingException e) {
			e.printStackTrace();
		}
		return conn;
	} 
	int userCheck(String userid, String pwd) {
		return 0;
	}
	
	public MemberVO getMember(String userid) {
		MemberVO vo = null;
		return vo;
	}
	
	// 중복체크
	public int confirmId(String userid) {
		return 0;
	}
	
	public int insertMember(MemberVO vo) {
		return 0;
	}
	public int updateMember(MemberVO vo) {
		return 0;
	}
}
