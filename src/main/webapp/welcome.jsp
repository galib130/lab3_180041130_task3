<%--
  Created by IntelliJ IDEA.
  User: galib
  Date: 2/24/22
  Time: 8:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<h1>Welcome</h1>
<%=request.getParameter("username")%><br>
<h1>Session ID</h1>
<%=request.getRequestedSessionId()%> <br>

<a href="logout.jsp">Logout</a>
</body>
</html>
