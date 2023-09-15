package net.daum.controller;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class CommonController {

	@GetMapping("/accessError") //403 접근금지 에러가 발생했을 때 호출
	public String accessError(Model model) {
		
		log.info("Access Denied");
		model.addAttribute("msg", "403 Access Denied");
		return "accessError";
	}
	
	@GetMapping("/customLogin")
	public void customLogin(String error, String logout, Model model, HttpServletRequest request) {
		Enumeration<String> parameters = request.getParameterNames();
		
		while(parameters.hasMoreElements()) {
			String str = parameters.nextElement();
			System.out.println("PARAMETER ::: " + str + " : " + request.getParameter(str));
		}
		
		if(error != null) {
			model.addAttribute("error", "Login Error Check Your Account");
		}
		
		if(logout != null) {
			model.addAttribute("logout", "Logout!!");
		}
	}
	
	//Get방식 로그아웃처리 
	@GetMapping("/customLogout")
	public void logoutGet() {
	}
	
	//Post방식 로그아웃처리
	@PostMapping("/customLogout")
	public void logoutPost() {
	}
}