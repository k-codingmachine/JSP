package com.saeyan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.saeyan.dto.userVO;
import com.saeyan.util.DBManager;

public class userDAO {
    private static userDAO instance = new userDAO();

    private userDAO() {}

    public static userDAO getInstance() {
        return instance;
    }

    // 등록
    public int insertUser(userVO vo) {
        int result = -1;

        String sql = "insert into member_tbl_02 values(?,?,?,?,?,?,?)";

        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = DBManager.getConnection();
            pstmt = conn.prepareStatement(sql);

            
            pstmt.setInt(1, vo.getCustno());
            pstmt.setString(2, vo.getCustname());
            pstmt.setString(3, vo.getPhone());
            pstmt.setString(4, vo.getAddress());
            pstmt.setString(5, vo.getJoindate());
            pstmt.setString(6, vo.getGrade());
            pstmt.setString(7, vo.getCity());

            result = pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBManager.close(conn, pstmt);
        }
        return result;
    }

    public List<userVO> getUserList() {
        List<userVO> list = new ArrayList<>();
        String sql = "select * from member_tbl_02 order by custno desc";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DBManager.getConnection();
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                userVO vo = new userVO();
                vo.setCustno(rs.getInt("custno"));
                vo.setCustname(rs.getString("custname"));
                vo.setPhone(rs.getString("phone"));
                vo.setAddress(rs.getString("address"));
                vo.setJoindate(rs.getString("joindate"));
                vo.setGrade(rs.getString("grade"));
                vo.setCity(rs.getString("city"));

                list.add(vo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBManager.close(conn, pstmt, rs);
        }
        return list;
    }
    
//	/* next value 가져오기 */
//	sql = "SELECT custno from member_tbl_02 where rownum <= 1 order by custno desc";
//	ResultSet res = conn.prepareStatement(sql).executeQuery();
//	int custno = 10001;
//	if (res.next()) custno = res.getInt(1)+1;
    
}
