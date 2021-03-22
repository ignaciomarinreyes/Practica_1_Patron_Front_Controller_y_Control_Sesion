
package controller.commands;

import business.Post;
import business.User;
import data.dao.PostDAO;
import java.util.List;

public class ShowPostsFollowedSubject extends FrontCommand{

    @Override
    public void process() {
        request.setAttribute("PostsFollowedSubjectsByUser", PostDAO.findAllPostsFollowedSubjectsByUser((User) request.getSession().getAttribute("user")));  
        forward("/MainFrame.jsp");
    }
    
}
