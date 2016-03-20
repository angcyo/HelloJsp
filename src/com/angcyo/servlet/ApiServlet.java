package com.angcyo.servlet;

import com.angcyo.utils.ResponseUtil;
import com.angcyo.utils.TextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Map;

/**
 * Created by angcyo on 16-03-20-020.
 */
@WebServlet(name = "ApiServlet")
public class ApiServlet extends HttpServlet {
    final static PrintStream p = System.out;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        printRequestInfo(request);

        ResponseUtil.write(response, "doPost " + TextUtils.getDataTime());
    }

    private void printRequestInfo(HttpServletRequest request) throws IOException, ServletException {
        p.println("getContextPath-->" + request.getContextPath());
        p.println("getContentLength-->" + request.getContentLength());
        p.println("getContentType-->" + request.getContentType());

        p.println("getMethod-->" + request.getMethod());
        p.println("getAuthType-->" + request.getAuthType());
        p.println("getServletPath-->" + request.getServletPath());

        p.println("getPathInfo-->" + request.getPathInfo());
        p.println("getRequestURI-->" + request.getRequestURI());
        p.println("getRequestedSessionId-->" + request.getRequestedSessionId());
        p.println("getRemoteUser-->" + request.getRemoteUser());
        p.println("getRequestURL-->" + request.getRequestURL().toString());
        p.println("getLocalName-->" + request.getLocalName());
        p.println("getRemoteAddr-->" + request.getRemoteAddr());
        p.println("getServerName-->" + request.getServerName());
        p.println("getRemoteHost-->" + request.getRemoteHost());
        p.println("getServerPort-->" + request.getServerPort());
        p.println("getScheme-->" + request.getScheme());
        p.println("getLocalAddr-->" + request.getLocalAddr());

        Enumeration<String> headerNames = request.getHeaderNames();

        p.println("contextPath-->" + "-");

        Collection<Part> parts = request.getParts();
        for (Part part : parts) {
            p.println("getParts-->" + part.getName());
        }

        Map<String, String[]> parameterMap = request.getParameterMap();
        for (Map.Entry<String, String[]> map : parameterMap.entrySet()) {
            p.println("getParameterMap-->" + "key->" + map.getKey() + " value->" + map.getValue());
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
