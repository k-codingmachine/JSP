package com.saeyan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.saeyan.dto.userVO;
import com.saeyan.util.DBManager;

public class userDAO {
	private static userDAO instance = new userDAO();
	
	private userDAO() {}
	
	public static userDAO getInstance() {
		return instance;
	}
	
//	등록
	public int insertUser(userVO vo) {
		int result =-1;
		
		String sql = "insert into member_tbl_02 values(?,?,?,?,?,?,?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getCustname());
			pstmt.setString(2, vo.getPhone());
			pstmt.setString(3, vo.getAddress());
			pstmt.setString(4, vo.getJoindate());
			pstmt.setString(5, vo.getGrade());
			pstmt.setString(6, vo.getCity());
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		return result;
	}
	
}
