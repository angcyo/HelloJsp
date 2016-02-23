package com.angcyo.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by angcyo on 2016-02-23 00:15.
 */
@WebFilter(filterName = "EncodingFilter")
public class EncodingFilter implements Filter {
    private String encoding;

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //ISO-8859-1
        if (encoding != null) {
            req.setCharacterEncoding(encoding);
            resp.setCharacterEncoding(encoding);
        }

        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        encoding = config.getInitParameter("encode");
    }

}
