package com.angcyo.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by angcyo on 15-12-26-026.
 */
@WebFilter(filterName = "Filter2")
public class Filter2 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, resp);
        System.out.println("Filter2 : doFilter ");

    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("Filter2 : init");

    }

}
