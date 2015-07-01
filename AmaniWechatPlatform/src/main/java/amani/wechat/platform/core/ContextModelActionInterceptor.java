package amani.wechat.platform.core;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class ContextModelActionInterceptor extends HandlerInterceptorAdapter {
	@Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		if(modelAndView!=null){
			String path = request.getContextPath()+ "/";
			String hostPath = request.getScheme() + "://"
					+ request.getServerName() + ":" + request.getServerPort()
					+ path;  
			modelAndView.addObject("ROOT_PATH", path);
			modelAndView.addObject("HOST_PATH", hostPath);
		}
        super.postHandle(request, response, handler, modelAndView);
        
    }
}
