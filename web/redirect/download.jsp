<%@ page import="java.io.FileInputStream" %>
<%@ page import="java.net.URLEncoder" %><%--
  Created by IntelliJ IDEA.
  User: angcyo
  Date: 2016-02-24 08:56
  Time: 08:56 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件下载</title>
</head>
<body>
<div style="text-align: center">
    <p>已开始文件下载...</p>
</div>

<script language="javascript">
    //     window.open("http://mirrors.hust.edu.cn/apache/tomcat/tomcat-9/v9.0.0.M3/bin/apache-tomcat-9.0.0.M3.exe");
    location.href = "http://mirrors.hust.edu.cn/apache/tomcat/tomcat-9/v9.0.0.M3/bin/apache-tomcat-9.0.0.M3.exe";
</script>


<%--<object--%>
<%--classid="clsid:8AD9C840-044E-11D1-B3E9-00805F499D93"--%>
<%--codebase="/jre-6u13-windows-i586-p-s.exe"--%>
<%--WIDTH="100%" HEIGHT="100%">--%>
<%--<param name="type" value="application/x-java-applet;version=1.5">--%>
<%--</object>--%>


<%--<%--%>
    <%--//        response.sendRedirect("http://mirrors.hust.edu.cn/apache/tomcat/tomcat-9/v9.0.0.M3/bin/apache-tomcat-9.0.0.M3.exe");--%>
<%--//        response.sendRedirect("ftp://F:/Camera360.apk");--%>
    <%--String file = "F:/Camera360.apk";--%>
    <%--ServletOutputStream outputStream = null;--%>
    <%--FileInputStream fileInputStream = null;--%>
    <%--try {--%>
        <%--response.setContentType("application/octet-stream");//设置为下载application/x-download--%>
        <%--String filedownload = file;//即将下载的文件的相对路径--%>
        <%--String filedisplay = "文件下载测试";//下载文件时显示的文件保存名称--%>
        <%--String filenamedisplay = URLEncoder.encode(filedisplay, "UTF-8");--%>
<%--//        response.addHeader("Content-Disposition", "attachment;filename=" + filedisplay);--%>
        <%--response.setHeader("Cache-Control", "no-cache");--%>
        <%--response.setHeader("Content-Location", file);--%>
        <%--response.setDateHeader("Expires", 0);--%>
        <%--response.addHeader("Content-Disposition", "attachment;filename=" + filenamedisplay);--%>
<%--//        RequestDispatcher dis = application.getRequestDispatcher(file);--%>
<%--//        if (dis != null) {--%>
<%--//            dis.forward(request, response);--%>
<%--//        }--%>
<%--//        response.flushBuffer();--%>

        <%--outputStream = response.getOutputStream();--%>
        <%--fileInputStream = new FileInputStream(file);--%>
        <%--byte[] buffer = new byte[1024];--%>
        <%--int len = -1;--%>
        <%--while ((len = fileInputStream.read(buffer)) != -1) {--%>
            <%--outputStream.write(buffer, 0, len);--%>
        <%--}--%>
        <%--outputStream.flush();--%>

    <%--} catch (Exception e) {--%>
        <%--e.printStackTrace();--%>
    <%--} finally {--%>
        <%--outputStream.close();--%>
        <%--fileInputStream.close();--%>
    <%--}--%>
<%--%>--%>
</body>
</html>
