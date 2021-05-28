package com.itbank.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itbank.board.BoardDAO;
import com.itbank.board.BoardDTO;

public class WriteAction implements CommandAction {
	
	private BoardDAO dao = BoardDAO.getInstance();

	@Override
	public String doGet(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		return "write";
	}

	@Override
	public String doPost(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		BoardDTO dto = new BoardDTO();
		
		dto.setTitle(request.getParameter("title"));
		dto.setWriter(request.getParameter("writer"));
		dto.setContent(request.getParameter("content"));
		dto.setIpaddr("123123");
		
		
		dao.insert(dto);
		
		return "redirect:/";
	}
	
	
}
