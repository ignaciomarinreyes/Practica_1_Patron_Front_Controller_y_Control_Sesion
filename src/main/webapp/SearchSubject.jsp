
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Subject</title>
    </head>
    <body>
        <%
           if(request.getSession().getAttribute("user") == null) response.sendRedirect("Login.jsp");
        %>
        <h1>Search Subject</h1>
        <form action='FrontController' method='GET'>  
            <select name="universities">
                <option value="ULPGC">ULPGC</option>
                <option value="ULL">ULL</option>
            </select>
            <select name="degrees">
                <option value="Grado en Ingeniería Informática">Grado en Ingeniería Informática</option>
            </select>
            <select name="subjects">
                <option value="Arquitectura del Software">Arquitectura del Software"</option>
                <option value="Gestión del Software 2">Gestión del Software 2</option>
            </select>       
            <input type='hidden' name='command' value='ShowPostFollowedSubjects'>          
            <input value='Buscar' type='submit'>
        </form>   
    </body>
</html>
