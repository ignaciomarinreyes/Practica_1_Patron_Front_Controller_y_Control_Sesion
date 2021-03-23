package controller.commands;

import business.Post;
import business.User;
import data.dao.PostDAO;

public class GiveLike extends FrontCommand {

    @Override
    public void process() {
        int idPost = Integer.valueOf(request.getParameter("idPost"));
        Post post = PostDAO.findById(idPost);
        post.addLike((User) request.getSession().getAttribute("user"));
        forward("/Like.jsp");
    }
}
