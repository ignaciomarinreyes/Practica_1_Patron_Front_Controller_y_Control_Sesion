<%@page import="business.Subject"%>
<%@page import="business.Degree"%>
<%@page import="business.University"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="template.css"/>
        <title>Search Subject</title>
    </head>
    <body>
        <%
           if(request.getSession().getAttribute("user") == null) response.sendRedirect("index.jsp");
        %>
        <%@ include file="Header.html"%>    
        <%@ include file="Menu.jsp"%>    
        <div id="centerSpace">
            <form class='formSearch' action='FrontController' method='GET'>  
                <select name="universities">
                    <%
                        for(University university: (List<University>)session.getAttribute("universities")) out.println("<option value='" + university.getId() + "'>" + university.getName() + "</option>");
                    %>
                </select><br>
                <select name="degrees">
                    <%
                        for(Degree degree :(List<Degree>)session.getAttribute("degrees")) out.println("<option value='" + degree.getId() + "'>" + degree.getName() + "</option>");
                    %>                                   
                </select><br>
                <select name="subjects">
                    <%
                        for(Subject subject :(List<Subject>)session.getAttribute("subjects")) out.println("<option value='" + subject.getId() + "'>" + subject.getName() + "</option>");
                    %> 
                </select><br>     
                <input type='hidden' name='command' value='ShowPostsSubject'>          
                <input value='Buscar' type='submit'>
            </form>
        </div>
    </body>
</html>
