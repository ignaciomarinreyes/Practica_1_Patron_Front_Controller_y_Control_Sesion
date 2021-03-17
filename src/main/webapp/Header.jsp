<%
    if (request.getSession().getAttribute("user") == null) {
        response.sendRedirect("index.jsp");
    } 
%>
<header id="title"><a style="color: black; text-decoration: none;" href="MainFrame.jsp">UniversityBook</a></header> 

