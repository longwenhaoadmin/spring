package web.xml;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class testListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("监听器运行");
		System.out.println("ServletContext创建");
		
	}

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("ServletContext销毁");
		System.out.println("监听器销毁");
		
	}

}
