
package controller.commands;

import business.Post;
import business.User;
import com.sun.org.apache.bcel.internal.generic.DALOAD;
import data.Data;
import data.dao.PostDAO;
import data.dao.SubjectDAO;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Publish extends FrontCommand{

    @Override
    public void process() {
        Data.add(new Post(request.getParameter("title"), (User) request.getSession().getAttribute("user"), LocalDate.now(), request.getParameter("content"), null, SubjectDAO.findById(Integer.valueOf(request.getParameter("subject")))));
        request.setAttribute("postsMYUser", PostDAO.findPostByUser((User) request.getSession().getAttribute("user")));       
        forward("/ShowMyPosts.jsp");
    }
    
}
