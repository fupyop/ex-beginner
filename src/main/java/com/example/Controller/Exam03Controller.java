package com.example.Controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {
	@Autowired
	private ServletContext application;
	
	@RequestMapping("")
	public String input() {
		return "exam03";
	}
	
	@RequestMapping("/input")
	public String input(Integer item1, Integer item2,Integer item3) {
		int totalPrice = item1 + item2 + item3;
		application.setAttribute("totalPrice", totalPrice);
		application.setAttribute("totalPriceIncludedTax", (int)(totalPrice*1.1));
		return "exam03-result";
		
	}
	
	
}
