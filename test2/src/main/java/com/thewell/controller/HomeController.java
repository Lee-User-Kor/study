package com.thewell.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.thewell.model.MemberDTO;
import com.thewell.service.HomeService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private HomeService homeService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		
		MemberDTO mDTO1 = homeService.test();
		
		model.addAttribute("mDTO1", mDTO1);
		
		MemberDTO mDTO2 = homeService.test2();
		model.addAttribute("mDTO2", mDTO2);
		
		return "home";
	}
	
}
