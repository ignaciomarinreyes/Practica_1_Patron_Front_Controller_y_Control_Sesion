
package controller.commands;

import business.User;
import data.Data;
import data.dao.UserDAO;
import java.io.IOException;
import javax.servlet.ServletException;

public class Login extends FrontCommand{

    @Override
    public void process() {
        loadData();
        login();
    }

    private void login() {
        UserDAO userDAO = new UserDAO(request);
        User user = userDAO.findByNickname_And_Password(request.getParameter("nickname"),request.getParameter("password"));
        if(user != null){
            request.getSession().setAttribute("user", user);
            forward("/MainFrame.jsp");
        } else {
            forward("/index.jsp");
        } 
    }   

    private void loadData() {
        Data.loadDefaultData();
        request.getSession().setAttribute("address", Data.getAddress());
        request.getSession().setAttribute("comments", Data.getComments());
        request.getSession().setAttribute("degrees", Data.getDegrees());
        request.getSession().setAttribute("posts", Data.getPosts());
        request.getSession().setAttribute("subjects", Data.getSubjects());
        request.getSession().setAttribute("universities", Data.getUniversities());
        request.getSession().setAttribute("users", Data.getUsers());   
    }
}
