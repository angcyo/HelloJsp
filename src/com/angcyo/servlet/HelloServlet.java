package com.angcyo.servlet;


import com.angcyo.jdbc.RJdbc;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 * Created by angcyo on 16-02-21-021.
 */
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();
//        writer.print("<H1>");
//        writer.print("hello servlet 你好");
//        writer.print("</H1>");

        try {
            RJdbc.init("192.168.1.11:3306", "lulc_db_test1", "angcyo", "angcyo").query("select * from name_table_test1", new RJdbc.JsonStringResult() {
                @Override
                public void onJsonStringResult(String jsonString) {
                    writer.print(jsonString);
                }
            }).close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        writer.close();
//        resp.setStatus(HttpServletResponse.SC_OK);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res);
        PrintWriter writer = res.getWriter();
        writer.println("hello servlet");
        writer.close();
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }
}
