package com.angcyo.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by angcyo on 15-12-26-026.
 */
@WebServlet(name = "ServletDemo", value = {"/ServletDemo"})
public class ServletDemo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("参数:  name :-->" + request.getParameter("name"));

        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().write("用户名:" + request.getParameter("name") + " - 用户密码: -- " + request.getParameter("word"));
        response.setStatus(HttpServletResponse.SC_OK);

//        System.out.println(name + "---" + name2);

//        request.getRequestDispatcher("http://www.baidu.com").forward(request, response);
//        response.sendRedirect("http://www.baidu.com");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("ServletDemo doGet ");

//        request.getRequestDispatcher("index2.jsp").include(request, response);
//        request.getRequestDispatcher("index2.jsp").forward(request, response);
    }
}
