<%--
  Created by IntelliJ IDEA.
  User: angcyo
  Date: 16-02-21-021
  Time: 23:47 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录失败</title>
</head>
<body>
<div style="; text-align: center">
    <div style="display: inline-block;">
        <h6>登录失败</h6>
        <h5>用户名:<%=request.getParameter("name") %>
        </h5>
        <h5>密&nbsp;码:<%=request.getParameter("pass") %>
        </h5>
        <a href="/login/login.jsp">返回重新登录</a>
    </div>
</div>
</body>
</html>
