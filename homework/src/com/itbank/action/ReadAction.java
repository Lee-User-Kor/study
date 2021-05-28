package com.itbank.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itbank.board.BoardDAO;
import com.itbank.board.BoardDTO;

public class ReadAction implements CommandAction {
	
	private BoardDAO dao = BoardDAO.getInstance();
	
	@Override
	public String doGet(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		
		BoardDTO dto = dao.selectOne(request.getParameter("idx"));
		
		request.setAttribute("dto", dto);
		
		return "read";
	}
	
}
