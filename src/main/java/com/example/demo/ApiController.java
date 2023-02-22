package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller

public class ApiController {
	
	@GetMapping("/")
	public String getMyFav(HttpServletRequest req) {
		String color=req.getParameter("color");
		HttpSession session = req.getSession();
		session.setAttribute("displayColor",color);
		return "NewFile.jsp";
	}
}