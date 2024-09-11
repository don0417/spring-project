package com.project.team3.interceptor;



import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//System.out.println("LoginInterceptor.preHandler()");
		// session에서 userId가 있는지 확인 -> 로그인 했는지 체크
		HttpSession session = request.getSession();
		String userId = (String)session.getAttribute("userId");
		
		if(userId == null || userId.length() == 0) {
			response.sendRedirect("login_form.do");
			return false;
		}
		
		return true;
	}

}
