<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="template.css"/>
        <title>Publish</title>
    </head>
    <body>
        <%
            if (request.getSession().getAttribute("user") == null)
                response.sendRedirect("index.jsp");               
        %>
        <%@ include file="Header.html"%>    
        <%@ include file="Menu.jsp"%>    
        <div id="centerSpace">
            <form action='FrontController' method='GET'>
                <ul>
                    <li>
                        <label for="title">Título: </label>
                        <input type="text" id="title" name="title">
                    </li>
                    <li>
                        <label for="content">Mensaje:</label>
                        <input type="text" id="content" name="content">
                    </li>                  
                </ul>
                <button type="submit">Publicar</button>
                <input type='hidden' id='subjects' name='subject' value='<%= request.getParameter("subject") %>'>   
                <input type='hidden' name='command' value='Publish'>  
            </form>
        </div>
    </body>
</html>
