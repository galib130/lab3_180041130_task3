<%--
  Created by IntelliJ IDEA.
  User: galib
  Date: 2/25/22
  Time: 7:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Logout</title>
</head>
<body>
<%
    session.invalidate();
    request.getRequestDispatcher("login.jsp").include(request,response);
%>
</body>
</html>
