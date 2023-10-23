package com.saeyan.controlloer.action;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.BoardDAO;
import com.saeyan.dto.BoardVO;

public class BoardViewFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, Exception {
		
		String url ="/board/boardView.jsp";
		String num = request.getParameter("num");
		
		System.out.println("num : " +request.getParameter("num"));
		
		BoardDAO bDao =BoardDAO.getInstance();
		
		bDao.updateReadCount(Integer.parseInt(num));
		
		BoardVO vo = bDao.selectOneByNum(Integer.parseInt(num));
		
		request.setAttribute("board", vo);
		
		RequestDispatcher dis = request.getRequestDispatcher(url);
		dis.forward(request, response);
	}

}
