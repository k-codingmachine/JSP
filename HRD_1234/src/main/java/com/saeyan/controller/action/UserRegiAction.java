package com.saeyan.controller.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.userDAO;
import com.saeyan.dto.userVO;

public class UserRegiAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, Exception {
		
		userVO vo = new userVO();
		
		vo.setCustno(Integer.parseInt(request.getParameter("custno")));
		vo.setCustname(request.getParameter("custname"));
		vo.setPhone(request.getParameter("phone"));
		vo.setAddress(request.getParameter("address"));
		vo.setJoindate(request.getParameter("joindate"));
		vo.setGrade(request.getParameter("grade"));
		vo.setCity(request.getParameter("city"));
		
		userDAO uDao = userDAO.getInstance();
		int result = uDao.insertUser(vo);
		
		if(result ==1) {
			response.sendRedirect("RegiServlet?command=user_List");
		}
		
	}

}
