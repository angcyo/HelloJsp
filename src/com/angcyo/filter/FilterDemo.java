package com.angcyo.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by angcyo on 15-12-26-026.
 */
public class FilterDemo implements Filter {
    public static final PrintStream Out = System.out;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Out.println("FilterDemo --------------init");

    }


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        httpServletRequest.setCharacterEncoding("utf-8");
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }

    @Override
    public void destroy() {
        Out.println("FilterDemo --------------destroy");
    }
}
