<%@ page import="java.net.URLEncoder" %>
<%--
  Created by IntelliJ IDEA.
  User: angcyo
  Date: 2016-02-24 09:20
  Time: 09:20 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>...</title>
</head>
<body>
<%
    //        response.sendRedirect("http://mirrors.hust.edu.cn/apache/tomcat/tomcat-9/v9.0.0.M3/bin/apache-tomcat-9.0.0.M3.exe");
    //        response.sendRedirect("ftp://F:/Camera360.apk");
    String file = "F:/Camera360.apk";
    try {
        response.setContentType("application/x-download");//设置为下载application/x-download
        String filedownload = file;//即将下载的文件的相对路径
        String filedisplay = "文件下载测试";//下载文件时显示的文件保存名称
        String filenamedisplay = URLEncoder.encode(filedisplay, "UTF-8");
//        response.addHeader("Content-Disposition", "attachment;filename=" + filedisplay);
        response.setHeader("Cache-Control", "no-cache");
        response.setHeader("Content-Location", file);
        response.setDateHeader("Expires", 0);
        response.addHeader("Content-Disposition", "attachment;filename=" + filenamedisplay);
        RequestDispatcher dis = application.getRequestDispatcher(file);
        if (dis != null) {
            dis.forward(request, response);
        }
        response.flushBuffer();
    } catch (Exception e) {
        e.printStackTrace();
    } finally {

    }
%>
</body>
</html>
