<%@page import="business.University"%>
<%@page import="business.Degree"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="template.css"/>
        <title>Degrees</title>
    </head>
    <body>
        <%@ include file="Header.jsp"%>    
        <%@ include file="MenuAdmin.jsp"%>
        <div id="centerSpace">
            <ul>
                <%
                    for(Degree degree: (List<Degree>) request.getAttribute("degrees")) {
                            out.println("<li>"+ degree.getName() +"</li>");  
                            for(University university: degree.getUniversity())
                                out.println("<ul><li>" + university.getName() + "</li></ul>");
                    }
                %>              
            </ul>
        </div>
    </body>
</html>
