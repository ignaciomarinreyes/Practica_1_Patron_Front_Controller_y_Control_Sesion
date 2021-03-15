<%@page import="java.time.LocalDate"%>
<%@page import="business.Comment"%>
<%@page import="business.Post"%>
<%@page import="data.Data"%>
<%@ page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="template.css"/>
        <title>ShowPostFollowedSubjects</title>
    </head>
    <body>
        <%
            if (request.getSession().getAttribute("user") == null)
                response.sendRedirect("Login.jsp");
        %>
        <%@ include file="Header.html"%>    
        <%@ include file="Menu.jsp"%>
        <div id="centerSpace">
            <%
                ArrayList<Post> posts = new ArrayList<Post>();
                System.out.println(request.getParameter("subjects"));
                if(request.getParameter("subjects").equalsIgnoreCase("Arquitectura del Sofware")){
                    posts = data.Data.loadPostsArquitecturaSofware((User) session.getAttribute("user"));      
                } else if(request.getParameter("subjects").equalsIgnoreCase("Gestion del Sofware")){
                   posts = data.Data.loadPostsGestionSofware((User) session.getAttribute("user"));  
                } 
                for (Post post : posts) {
                    out.println("<div class='post'><h1>" + post.getTitle() + "</h1>"
                            + "<div class='tuser'><span>" + post.getUser().getName() + "</span><span> " + post.getDate() + "</span></div>"
                            + "<p>" + post.getContent() + "</p>"
                            + "<div class='picture'><img src='" + post.getPathImage() + "' width='40%' height='40%'></div>");
                    if (post.getLinks().size() > 0) {
                        out.println("<div class='link'>");
                        for (String link : post.getLinks()) {
                            out.println("<a href='" + link + "'>Enlace</a>");
                        }
                        out.println("</div>");
                    }
                    if(post.getFiles().size() > 0) {
                        out.println("<div class='file'>");
                        for (String file : post.getFiles()) {
                            out.println("<a href='" + file + "'>Fichero</a>");
                        }
                        out.println("</div>");
                    }
                    if(post.getComments().size() > 0) {
                        out.println("<div>");
                        for (Comment comment : post.getComments()) {
                            out.println("<div class='tcomment'><span>" + comment.getUser().getName() + "</span><span> " + comment.getDate() + "</span></div>"
                                    + "<div class='comment'>" + comment.getContent() + "</div>");
                        }
                        out.println("</div>");
                    }
                    out.println("</div>");
                    out.println("<p class='like'>Me gusta: " + post.getNumberLikes() + "</p>");
                }             
            %>
        </div>
        <%@ include file="Footer.html"%> 
    </body>
</html>
