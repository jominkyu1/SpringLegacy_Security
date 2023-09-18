package net.daum.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

//@Slf4j
@Controller
@RequestMapping("/sample/*") // Controller 자체 매핑주소 등록
public class SampleController {
	
	//@Slf4j
	Logger log = LoggerFactory.getLogger(SampleController.class);

	@GetMapping("/all") //로그인하지 않은 사용자도 접근 가능
	public void doAll() {
		System.out.println("ALL 접근:: /sample/all");
		//뷰페이지 파일명 all
	}
	
	@GetMapping("/member")
	public void doMember() {
		System.out.println("MEMBER 접근:: /sample/member");
	}
	
	@GetMapping("/admin")
	public void doAdmin() {
		System.out.println("ADMIN 접근:: /sample/admin");
	}
}
