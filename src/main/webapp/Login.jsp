<%@page import="data.dao.UserDAO"%>
<%@page import="java.io.IOException"%>
<%@page import="data.Data"%>
<%@page import="business.User"%>
<%
        UserDAO userDAO = new UserDAO(request);
        User user = userDAO.findByNickname_And_Password(request.getParameter("nickname"),request.getParameter("password"));
        try {
            if(user != null){
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
