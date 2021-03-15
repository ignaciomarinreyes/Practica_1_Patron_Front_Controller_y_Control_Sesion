<%-- 
    Document   : ShowPostFollowedSubjects
    Created on : 14 mar. 2021, 17:59:41
    Author     : ignacio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ShowPostFollowedSubjects</title>
    </head>
    <body>
        <%
           if(request.getSession().getAttribute("user") == null) response.sendRedirect("Login.jsp");
        %>
        <h1>ShowPostFollowedSubjects</h1>
    </body>
</html>
