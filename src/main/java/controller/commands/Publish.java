
package controller.commands;

import business.Post;
import business.User;
import com.sun.org.apache.bcel.internal.generic.DALOAD;
import data.dao.SubjectDAO;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Publish extends FrontCommand{

    @Override
    public void process() {
        SubjectDAO subjectDAO = new SubjectDAO(request);
        List<Post> posts = (List<Post>) request.getSession().getAttribute("posts");
        posts.add(new Post(request.getParameter("title"), (User) request.getSession().getAttribute("user"), LocalDate.now(), request.getParameter("content"), null, subjectDAO.findById(Integer.valueOf(request.getParameter("subject")))));
        request.getSession().setAttribute("posts", posts);
        
        request.setAttribute("postsMYUser", ((User) request.getSession().getAttribute("user")).getPosts());       
        forward("/ShowMyPosts.jsp");
    }
    
}
