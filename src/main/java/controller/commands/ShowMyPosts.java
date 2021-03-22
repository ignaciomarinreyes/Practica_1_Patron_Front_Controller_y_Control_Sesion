
package controller.commands;

import business.User;
import data.dao.PostDAO;

public class ShowMyPosts extends FrontCommand{

    @Override
    public void process() {
        request.setAttribute("postsMYUser", PostDAO.findPostByUser((User) request.getSession().getAttribute("user")));       
        forward("/ShowMyPosts.jsp");
    }
    
}
