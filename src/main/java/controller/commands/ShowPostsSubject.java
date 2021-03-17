
package controller.commands;

import business.Post;
import data.dao.PostDAO;
import java.util.List;

public class ShowPostsSubject extends FrontCommand{

    @Override
    public void process() {
        PostDAO postDAO = new PostDAO(request);
        request.setAttribute("PostBySubject", postDAO.findPostBySubject(Integer.parseInt(request.getParameter("universities")), Integer.parseInt(request.getParameter("degrees")), Integer.parseInt(request.getParameter("subjects"))));
        forward("/ShowPostsSubject.jsp");
    }
    
}
