<%--
  Created by IntelliJ IDEA.
  User: rajeg
  Date: 11-08-2022
  Time: 01:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=us-ascii">
    <title>Login Success Page</title>
</head>
<body>
<h3> Hi <%=request.getAttribute("user")%>,Login Successful.</h3>
<a href="login.html">Login Page</a>
</body>
</html>
