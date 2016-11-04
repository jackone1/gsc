package com.yy.gposc.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	
	@RequestMapping(value="/")
//	@ResponseBody
	public String doIndex() {
		System.out.println("doIndex");
		return "index";
	}
}
