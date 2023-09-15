package net.daum.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

//로그인 성공시 처리되는 클래스
public class CustomLoginSuccessHandler implements AuthenticationSuccessHandler{

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, 
			HttpServletResponse response, Authentication auth) throws IOException, ServletException {
		System.out.println("--로그인 성공--");
		
		List<String> roleNames = new ArrayList<>(); //권한저장 컬렉션
		auth.getAuthorities().forEach(
					a -> { String name = a.getAuthority();
						   roleNames.add(name); }
				);
		
		System.out.println("권한목록:: " + roleNames);
		
		if(roleNames.contains("ROLE_ADMIN")) {
			response.sendRedirect("/sample/admin");
			return;
		} else if(roleNames.contains("ROLE_MEMBER")) {
			response.sendRedirect("/sample/member");
			return;
		} else {
			response.sendRedirect("/");
		}
	}
}
