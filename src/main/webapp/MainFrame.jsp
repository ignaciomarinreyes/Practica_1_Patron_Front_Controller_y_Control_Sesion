<%@page import="data.Data"%>
<%@page import="business.Comment"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.util.ArrayList"%>
<%@page import="business.Post"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="template.css"/>
    </head>
    <body>
        <%
            if (request.getSession().getAttribute("user") == null)
                response.sendRedirect("index.jsp");
        %>
        <%@ include file="Header.html"%>    
        <%@ include file="Menu.jsp"%>    
        <div id="centerSpace">
             <%
                ArrayList<Post> posts = Data.loadPostsFollowedSubject();
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
