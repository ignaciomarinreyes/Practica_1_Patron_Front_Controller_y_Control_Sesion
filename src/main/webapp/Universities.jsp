<%@page import="java.util.List"%>
<%@page import="business.University"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="template.css"/>
        <title>Search Subject</title>
    </head>
    <body>
        <%@ include file="Header.jsp"%>    
        <%@ include file="MenuAdmin.jsp"%>
        <div id="centerSpace">
            <ul>
                <%
                    for(University university: (List<University>) request.getAttribute("universities")) {
                            out.println("<li>"+ university.getName() +"</li>");
                            out.println("<ul><li>" + university.getAddress() + "</li></ul>");                    
                    }
                %>              
            </ul>
        </div>
    </body>
</html>
