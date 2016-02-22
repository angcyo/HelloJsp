package com.angcyo.servlet;

import com.angcyo.utils.TextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by angcyo on 16-02-21-021.
 */
@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");

//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter writer = response.getWriter();
//        writer.println("name:" + name);
//        writer.println("<br/>");
//        writer.println("pass:" + pass);
//        writer.close();

//        /*地址重定向, 并不会传递参数过去*/
//        if (TextUtils.isEmpty(name) || TextUtils.isEmpty(pass)) {
//            response.sendRedirect(request.getContextPath() + "/login/failed.jsp");
//        }else if (name.contains("angcyo") && pass.contains("angcyo")) {
//            response.sendRedirect(request.getContextPath() + "/login/success.jsp");
//        } else {
//            response.sendRedirect(request.getContextPath() + "/login/failed.jsp");
//        }

        /*所以采用转发,可以保证参数传递*/
        if (TextUtils.isEmpty(name) || TextUtils.isEmpty(pass)) {
            request.getRequestDispatcher(request.getContextPath() + "/login/failed.jsp").forward(request, response);
        }else if (name.contains("angcyo") && pass.contains("angcyo")) {
            request.getRequestDispatcher(request.getContextPath() + "/login/success.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher(request.getContextPath() + "/login/failed.jsp").forward(request, response);
        }

//        response.setStatus(HttpServletResponse.SC_OK);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
