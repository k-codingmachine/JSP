package com.saeyan.controller.action;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.userDAO;
import com.saeyan.dto.userVO;

public class UserListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, Exception {
		String url = "./list.jsp";
		
		userDAO uDao = userDAO.getInstance();
		List<userVO> userlist = uDao.getUserList();
		
		request.setAttribute("userlist", userlist);
		RequestDispatcher dis = request.getRequestDispatcher(url);
		dis.forward(request, response);
	}

}
