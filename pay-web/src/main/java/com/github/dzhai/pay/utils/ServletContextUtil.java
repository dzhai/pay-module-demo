package com.github.dzhai.pay.utils;

import javax.servlet.ServletContext;
import org.springframework.web.context.ServletContextAware;

/**
 * web 容器 ServletContext
 * Title:ServletContextUtil
 * @Description:
 * @Create_by:zhaicl
 * @Create_date:2016年4月12日
 * @Last_Edit_By:
 * @Edit_Description:
 * @version:maxtp.framelib 1.0
 */
public class ServletContextUtil implements ServletContextAware {
	
	private static ServletContext servletContext;
	
	@Override
	public void setServletContext(ServletContext servletContext) {
		//全局信息
	}

	/**
	 * 获得servletContext
	 * 
	 * @Create_by:zhaicl
	 * @Create_date:2016年4月12日
	 * @return
	 * @Last_Edit_By:
	 * @Edit_Description:
	 * @Create_Version:maxtp.framelib 1.0
	 */
	public static ServletContext getServletContext() {
		return servletContext;
	}
	
	
	/**
	 * 设置属性
	 * 
	 * @Create_by:zhaicl
	 * @Create_date:2016年4月12日
	 * @param name
	 * @param object
	 * @Last_Edit_By:
	 * @Edit_Description:
	 * @Create_Version:maxtp.framelib 1.0
	 */
	public static void setAttribute(String name,Object object){
		servletContext.setAttribute(name, object);
	}
	
	/**
	 * 获得属性
	 * 
	 * @Create_by:zhaicl
	 * @Create_date:2016年4月12日
	 * @param name
	 * @return
	 * @Last_Edit_By:
	 * @Edit_Description:
	 * @Create_Version:maxtp.framelib 1.0
	 */
	public static Object getAttribute(String name){
		return servletContext.getAttribute(name);
	}
}