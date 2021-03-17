<%@page import="business.User"%>
<div id="menu">
    <form action='FrontController' method='GET' style='float: left; margin-left: 10px;'>                 
        <input type='hidden' name='command' value='SearchSubject'>          
        <input value='Buscar' type='submit'>
    </form>
    <form action='FrontController' method='GET' style='float: right; margin-right: 10px;'>
        <input type='hidden' name='command' value='Logout'>      
        <input value='Cerrar Sesión' type='submit'>
    </form> 
    <form action='FrontController' style='float: right; margin-right: 10px;'> 
        <input type='hidden' name='command' value='Configuracion'>   
        <input value='Configuración' type='submit'>
    </form>   
    <form action='FrontController' style='float: right; margin-right: 10px;'>
        <input type='hidden' name='command' value='ShowMyPosts'>        
        <input value='Perfil' type='submit'>
    </form>
    <form action='FrontController' style='float: right; margin-right: 10px;'>
        <input type='hidden' name='command' value='ShowPostsFollowedSubject'>        
        <input value='Inicio' type='submit'>
    </form> 
    <div style='float: right; margin-right: 10px; padding-top: 5px; background-color: white; font-size: 15pt;'><%= ((User) request.getSession().getAttribute("user")).getName()%></div>
</div>