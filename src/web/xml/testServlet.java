package web.xml;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class testServlet extends HttpServlet {
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		super.init(arg0);
		// TODO Auto-generated method stub
		System.out.println("初始化servlet");
		System.out.println(getServletContext().getInitParameter("myparam"));
		System.out.println(getServletConfig().getInitParameter("test"));
		System.out.println(getInitParameter("test"));
	}
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("调用servlet");
		System.out.println(getServletContext().getInitParameter("myparam"));
		System.out.println(getServletConfig().getInitParameter("test"));
		System.out.println(getInitParameter("test"));
	}

}
