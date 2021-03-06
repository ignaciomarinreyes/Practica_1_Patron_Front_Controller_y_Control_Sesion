package controller.commands;

import business.User;
import data.Data;
import data.dao.PostDAO;
import data.dao.UserDAO;

public class Login extends FrontCommand {

    static{
        loadData();
    }
    
    @Override
    public void process() {       
        login();
    }

    private void login() {
        User user = UserDAO.findByNickname_And_Password(request.getParameter("nickname"), request.getParameter("password"));
        if (user != null) {
            request.getSession().setAttribute("user", user);
            request.setAttribute("PostsFollowedSubjectsByUser", PostDAO.findAllPostsFollowedSubjectsByUser((User) request.getSession().getAttribute("user")));
            forward("/MainFrame.jsp");
        } else {
            forward("/index.jsp");
        }
    }

    private static void loadData() {
        Data.loadDefaultData();
    }
}
