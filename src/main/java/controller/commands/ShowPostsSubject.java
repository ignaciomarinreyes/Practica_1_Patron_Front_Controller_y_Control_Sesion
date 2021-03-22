
package controller.commands;

import business.Post;
import data.dao.PostDAO;
import java.util.List;

public class ShowPostsSubject extends FrontCommand{

    @Override
    public void process() {
        request.setAttribute("PostBySubject", PostDAO.findPostBySubject(Integer.parseInt(request.getParameter("universities")), Integer.parseInt(request.getParameter("degrees")), Integer.parseInt(request.getParameter("subjects"))));
        forward("/ShowPostsSubject.jsp");
    }
    
}
