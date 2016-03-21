package com.angcyo.servlet;

import com.angcyo.utils.ResponseUtil;
import com.angcyo.utils.TextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Enumeration;
import java.util.Map;

/**
 * Created by angcyo on 16-03-20-020.
 */
@WebServlet(name = "ApiServlet")
public class ApiServlet extends HttpServlet {
    final static PrintStream p = System.out;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        printRequestInfo(request);

        String parameter = "no";
        if (isGet(request)) {
            parameter = parseGetParamJson(request);

            p.println("GET->" + parameter);

        } else if (isPost(request)) {
            parameter = parsePostParamJson(request);

            p.println("POST->" + parameter);
        }

        if (TextUtils.isEmpty(parameter)) {
            parameter = "no";
        }

        String src =
                "{" +
                        "\"rid\":12," +
                        "\"name_char\":\"马化腾\"," +
                        "\"name_varchar\":\"埃里巴巴\"," +
                        "\"param\":" + parameter + "," +
                        "\"name_float\":0," +
                        "\"name_int\":0," +
                        "\"name_tinyint\":0," +
                        "\"name_time\":1478833860000" +
                        "}";

        ResponseUtil.write(response, src);
    }

    private void printRequestInfo(HttpServletRequest request) throws IOException, ServletException {
        p.println("getContextPath-->" + request.getContextPath());

        p.println("getAuthType-->" + request.getAuthType());
        p.println("getServletPath-->" + request.getServletPath());

        p.println("getPathInfo-->" + request.getPathInfo());
        p.println("getRequestURI-->" + request.getRequestURI());
        p.println("getRequestedSessionId-->" + request.getRequestedSessionId());
        p.println("getRemoteUser-->" + request.getRemoteUser());
        p.println("getLocalName-->" + request.getLocalName());
        p.println("getRemoteAddr-->" + request.getRemoteAddr());
        p.println("getServerName-->" + request.getServerName());
        p.println("getRemoteHost-->" + request.getRemoteHost());
        p.println("getServerPort-->" + request.getServerPort());
        p.println("getLocalAddr-->" + request.getLocalAddr());

        Enumeration<String> headerNames = request.getHeaderNames();

        while (headerNames.hasMoreElements()) {//以此取出头信息
            String headerName = headerNames.nextElement();
            String headerValue = request.getHeader(headerName);//取出头信息内容

            p.println("getHeaderNames-->" + "header->" + headerName + " value->" + headerValue);
        }

//        p.println("contextPath-->" + "-");

//        Collection<Part> parts = request.getParts();
//        for (Part part : parts) {
//            p.println("getParts-->" + part.getName());
//        }


        p.println("------------------------------------------------------------------------------");
        p.println("getRequestURL-->" + request.getRequestURL().toString());
        p.println("getContentLength-->" + request.getContentLength());
        p.println("getMethod-->" + request.getMethod());
        p.println("getScheme-->" + request.getScheme());
        p.println("getContentType-->" + request.getContentType());
        if (isGet(request)) {
            Map<String, String[]> parameterMap = request.getParameterMap();
            for (Map.Entry<String, String[]> map : parameterMap.entrySet()) {
                p.print("GET-getParameterMap-->" + "key->" + map.getKey() + " value->");
                for (String v : map.getValue()) {
                    p.print(v + " ");
                }
                p.println();
            }
        } else if (isPost(request)) {
            BufferedReader reader = request.getReader();
            StringBuilder builder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }

            p.println("POST-getParameterMap-->" + builder.toString());
        }

    }

    protected String parseGetParam(HttpServletRequest request) {
        StringBuilder builder = new StringBuilder();

        Map<String, String[]> parameterMap = request.getParameterMap();
        for (Map.Entry<String, String[]> map : parameterMap.entrySet()) {

        }

        return builder.toString();
    }

    protected String parsePostParam(HttpServletRequest request) {
        StringBuilder builder = new StringBuilder();

        return builder.toString();
    }

    /**
     * 获取URL中的所有参数信息
     */
    protected String parseGetParamJson(HttpServletRequest request) {
        StringBuilder builder = new StringBuilder("{");
        Map<String, String[]> parameterMap = request.getParameterMap();
        for (Map.Entry<String, String[]> map : parameterMap.entrySet()) {
            builder.append("\"").append(map.getKey()).append("\"")
                    .append(":")
                    .append("\"").append(map.getValue()[0]).append("\"")
                    .append(",");
        }

        int length = builder.length();
        if (length > 1) {
            builder.deleteCharAt(length - 1);
        }

        builder.append("}");
        return builder.toString();
    }

    /**
     * 获取body内,所有的参数信息
     */
    protected String parsePostParamJson(HttpServletRequest request) {
        StringBuilder builder = new StringBuilder();
        try {
            BufferedReader reader = request.getReader();
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
        } catch (Exception e) {

        }

        return builder.toString();
    }

    protected boolean isGet(HttpServletRequest request) {
        return request.getMethod().equalsIgnoreCase("GET");
    }

    protected boolean isPost(HttpServletRequest request) {
        return request.getMethod().equalsIgnoreCase("POST");
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
