package springmvcexample;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("This is pre-Handler");
		String name=request.getParameter("user");
		if(name.startsWith("v")) {
			System.out.println("Sorry Boss! Users whose name starts with 'V' are not allowed.");
			response.setContentType("text/html");
			response.getWriter().println("<h1>Sorry Boss! Users whose name starts with 'V' are not allowed.</h1>");
			return false;
		}
		return true ;
	}
	
	

}
