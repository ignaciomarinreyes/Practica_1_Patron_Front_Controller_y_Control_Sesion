<html>
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="template.css"/>
        <title>UniversityBook</title> 
    </head>
    <body>
        <%@ include file="Header.html"%>    
        <div id="divlogged">
            <form action='Login' method='POST'>
                <div style="padding: 10px;">
                    <span>Nombre: </span>
                    <input type='text' name='nickname' value='ignacio'> 
                </div>  
                <div style="padding: 10px;">
                    <span>Contrase�a: </span>
                    <input type='text' name='password' value='1234'> 
                </div>  
                <input style="padding: 10px;" value='Iniciar Sesi�n' type='submit'>
            </form>
        </div>   
    </body>   
</html>



