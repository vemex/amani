package anmani.webchat.platform.core;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.DispatcherServlet;

public class UTF8DispatcherServlet extends DispatcherServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String encoding;

	public void init(ServletConfig config) throws ServletException {
		encoding = config.getInitParameter("encoding");
		super.init(config); 
	}

	protected void doService(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		response.setCharacterEncoding(encoding);
		request.setCharacterEncoding(encoding);
		super.doService(request, response);
	}
}
