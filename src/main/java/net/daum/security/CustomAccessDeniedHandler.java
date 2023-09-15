package net.daum.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomAccessDeniedHandler implements AccessDeniedHandler{
	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException, ServletException {
		//403 접근금지 에러가 발생했을 때 다양한 처리를 하려면 AccessDeniedHandler 인터페이스를 상속받아서 처리한다
		//스프링 레거시의경우 빈 아이디를 등록하여 이 클래스를 호출할 수 있게 설정해줘야함
		log.warn("Access Denied Handler");
		log.warn("Redirect .....");
		
		response.sendRedirect("/accessError");
	}
}