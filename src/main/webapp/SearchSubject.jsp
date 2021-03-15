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
           if(request.getSession().getAttribute("user") == null) response.sendRedirect("Login.jsp");
        %>
        <%@ include file="Header.html"%>    
        <%@ include file="Menu.jsp"%>    
        <div id="centerSpace">
            <form class='formSearch' action='FrontController' method='GET'>  
                <select name="universities">
                    <option value="ULPGC">ULPGC</option>
                    <option value="ULL">ULL</option>
                </select><br>
                <select name="degrees">
                    <option value="Grado en Ingeniería Informática">Grado en Ingeniería Informática</option>
                </select><br>
                <select name="subjects">
                    <option value="Arquitectura del Sofware">Arquitectura del Software</option>
                    <option value="Gestion del Sofware">Gestión del Sofware</option>
                </select><br>     
                <input type='hidden' name='command' value='ShowPostFollowedSubjects'>          
                <input value='Buscar' type='submit'>
            </form>
        </div>
    </body>
</html>
