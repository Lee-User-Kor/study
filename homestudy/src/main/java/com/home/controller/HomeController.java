package com.home.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.home.model.BoardDTO;
import com.home.service.BoardService;

@Controller
public class HomeController {
	
	@Autowired private BoardService bs;
	
	@GetMapping("/")
	public ModelAndView home() {
		
		List<BoardDTO> list = bs.selectList();
		
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("list", list);
		return mav;
	}
	
}
