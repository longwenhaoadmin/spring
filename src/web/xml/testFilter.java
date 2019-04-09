package web.xml;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class testFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("初始化filter");
		System.out.println(filterConfig.getServletContext().getInitParameter("myparam"));//输出context-param
		System.out.println(filterConfig.getInitParameter("testfilter"));//输出init-param
		System.out.println(filterConfig.getFilterName());//输出web.xml中定义的名字
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("调用filter");
		chain.doFilter(request, response);
	}

	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("销毁filter");
	}

}
