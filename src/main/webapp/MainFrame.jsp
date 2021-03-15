<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="template.css"/>
    </head>
    <body>
        <%
            if (request.getSession().getAttribute("user") == null)
                response.sendRedirect("Login.jsp");
        %>
        <%@ include file="Header.html"%>    
        <%@ include file="Menu.jsp"%>    
        <div id="centerSpace">
            <div class="post">
                Prueba
            </div>
        </div>
        <%@ include file="Footer.html"%> 
    </body>
</html>
