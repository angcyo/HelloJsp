<%--
  Created by IntelliJ IDEA.
  User: angcyo
  Date: 16-02-21-021
  Time: 23:10 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<%
    System.out.println("Hello Jsp Pager");
    System.out.println(request.getContextPath());
%>
<style type="text/css">
    * {
        padding: 10px;
        margin: 10px;
    }
</style>

<%--Servlet 登录测试--%>
<div style="; text-align: center">
    <h1>Servlet 登录测试</h1>
    <form action="<%=request.getContextPath() %>/loginServlet" method="post">
        name<input type="text" name="name"/><br/>
        userPass<input type="password" name="pass"/><br/>
        <input type="submit" value="登录"/>
        <input type="reset" value="重置"/>
    </form>
</div>


<%--Struts2 登录测试--%>
<div style="; text-align: center">
    <h1>Struts2 登录测试</h1>
    <form action="<%=request.getContextPath() %>/login/login.rsen" method="post">
        name<input type="text" name="name"/><br/>
        userPass<input type="password" name="pass"/><br/>
        <input type="submit" value="登录"/>
        <input type="reset" value="重置"/>
    </form>
</div>

<%--Struts2 mode 登录测试--%>
<div style="; text-align: center">
    <h1>Struts2 mode 登录测试</h1>
    <form action="<%=request.getContextPath() %>/login/modeLogin.rsen" method="post">
        name<input type="text" name="name"/><br/>
        userPass<input type="password" name="pass"/><br/>
        <input type="submit" value="登录"/>
        <input type="reset" value="重置"/>
    </form>
</div>

</body>
</html>
