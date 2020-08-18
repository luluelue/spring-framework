package org.springframework.controller;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author lulu
 */
public class LogCostFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("过滤器被初始化");
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		long start = System.currentTimeMillis();
		filterChain.doFilter(servletRequest, servletResponse);
		System.out.println("Execute cost=" + (System.currentTimeMillis() - start));
	}

	@Override
	public void destroy() {

	}
}
