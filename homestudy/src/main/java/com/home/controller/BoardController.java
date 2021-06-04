package com.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.home.model.BoardDTO;
import com.home.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired private BoardService bs;
	
	@GetMapping("/write")
	public void write() {}
	
	@PostMapping("/write")
	public String write(BoardDTO dto) {
		
		bs.insert(dto);
		
		return "redirect:/";
	}
}
