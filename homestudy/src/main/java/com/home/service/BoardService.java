package com.home.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.model.BoardDAO;
import com.home.model.BoardDTO;

@Service
public class BoardService {

	@Autowired private BoardDAO dao;

	public List<BoardDTO> selectList() {
		return dao.selectList();
	}

	public void insert(BoardDTO dto) {
		dao.insert(dto);
	}
	
}
