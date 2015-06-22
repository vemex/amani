package anmani.webchat.platform.core;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
 
/**
 * 身份验证拦截器
 * 
 * @author VV 
 *
 */
public class AuthcationActionInterceptor extends HandlerInterceptorAdapter {
	private static final String[] IGNORE_URI = {"/login.jsp", "/Login","backui/","frontui/"};
	 
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        boolean flag = false;  
        String url = request.getRequestURL().toString();
        System.out.println(">>>: " + url);
        for (String s : IGNORE_URI) {
            if (url.contains(s)) {
                flag = true;
                break;
            }
        }
        if (!flag) { 
        	flag=true;
        	response.getWriter().print("Not login");
        }
        return flag;
    }
 
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    	
        super.postHandle(request, response, handler, modelAndView);
        
    }
}
