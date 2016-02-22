<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: ANGCYO-XPS$
  Date: 15-12-26-026
  Time: 13:25 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" errorPage="error.jsp"   %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>$Title$</title>
    <link rel="shortcut icon" href="favicon.ico">
</head>
<body>
$END1111$ index 2015-12-27 14:43:48

<%=request.getRealPath("index.jsp")%>
<%=request.getPathInfo()%>

<%!
    String a = "Rsen";
%>

<%
    String s = "angcyo";

    int a = 100/0;
%>

<%
    System.out.println("Hello Jsp");
    System.out.println(request.getRequestURL());

    SimpleDateFormat dateFormat = new SimpleDateFormat();
    String date = dateFormat.format(new Date());
%>
<%=date %>

<form action="/ServletDemo" method="post">
    <p style="font-size: x-large;color: crimson"> 用户名: <input style="border: none" type="text" name="name" value="中文测试">
    </p>
    <p> 用户密码:<input style="background-color: brown" type="password" name="word" value="password"></p>
    <p style="background-color: coral"> 提交:<input type="submit" value="submit" name="提交"></p>
</form>
</body>
</html>
