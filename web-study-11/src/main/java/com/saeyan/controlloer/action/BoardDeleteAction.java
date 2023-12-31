package com.saeyan.controlloer.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.BoardDAO;

public class BoardDeleteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, Exception {
		String num = request.getParameter("num");
		
		BoardDAO bDao = BoardDAO.getInstance();
		int result = bDao.boardDelete(Integer.parseInt(num));
		
		if(result == 1) {
			new BoardListAction().execute(request, response);
		}
	}

}
