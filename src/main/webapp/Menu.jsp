<%@page import="business.User"%>
<div id="menu">
    <form action='FrontController' method='GET' style='float: left; margin-left: 10px;'>                 
        <input type='hidden' name='command' value='SearchSubject'>          
        <input value='Buscar' type='submit'>
    </form>
    <form action='LogOut' method='GET' style='float: right; margin-right: 10px;'>                          
        <input value='Cerrar Sesión' type='submit'>
    </form> 
    <form style='float: right; margin-right: 10px;'>                          
        <input value='Configuración' type='submit'>
    </form>   
    <form style='float: right; margin-right: 10px;'>                         
        <input value='Perfil' type='submit'>
    </form> 
    <div style='float: right; margin-right: 10px; padding-top: 5px; background-color: white; font-size: 15pt;'><%= ((User) request.getSession().getAttribute("user")).getName()%></div>
</div>