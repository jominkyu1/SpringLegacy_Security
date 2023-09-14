package net.daum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/sample/*") // Controller 자체 매핑주소 등록
public class SampleController {

	@GetMapping("/all") //로그인하지 않은 사용자도 접근 가능
	public void doAll() {
		log.info("/sample/all 모든 사용자 접근");
		
		//뷰페이지 파일명 all
	}
	
	@GetMapping("/member")
	public void doMember() {
		log.info("/sample/member 로그인 한 사용자만 접근");
	}
	
	@GetMapping("/admin")
	public void doAdmin() {
		log.info("/sample/admin 관리자만 접근");
	}
}
