package com.itbank.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itbank.board.BoardDAO;
import com.itbank.board.BoardDTO;

public class HomeAction implements CommandAction {

	private BoardDAO dao = BoardDAO.getInstance();
	
	@Override
	public String doGet(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		List<BoardDTO> list = dao.selectList();
		
		request.setAttribute("list", list);
		
		return "home";
	}

	@Override
	public String doPost(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		return null;
	}
	
}
