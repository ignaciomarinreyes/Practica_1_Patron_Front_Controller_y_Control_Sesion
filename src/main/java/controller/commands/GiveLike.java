package controller.commands;

import business.Post;
import business.User;
import data.Data;
import data.dao.PostDAO;
import javax.swing.plaf.metal.MetalInternalFrameUI;

public class GiveLike extends FrontCommand {

    @Override
    public void process() {
        int idPost = Integer.valueOf(request.getParameter("idPost"));
        Post post = PostDAO.findById(idPost);
        post.addLike((User) request.getSession().getAttribute("user"));
        forward("/Like.jsp");
    }
}
