<%@page import="java.io.IOException"%>
<%@page import="data.Data"%>
<%@page import="business.User"%>
<%
        String nickname = request.getParameter("nickname");
        String password = request.getParameter("password");
        User user = Data.loadMyUser(nickname, password);
        try {
            if(nickname.equals("ignacio") && password.equals("1234")){
                session.setAttribute("user", user);            
                getServletContext().getRequestDispatcher("/MainFrame.jsp").forward(request, response);            
            } else {          
                getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);            
            }
        } catch (ServletException ex) {
                ex.printStackTrace();
        } catch (IOException ex) {
                ex.printStackTrace();
        } 
%>
