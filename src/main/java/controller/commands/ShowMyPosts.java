
package controller.commands;

import business.User;

public class ShowMyPosts extends FrontCommand{

    @Override
    public void process() {
        request.setAttribute("postsMYUser", ((User) request.getSession().getAttribute("user")).getPosts());       
        forward("/ShowMyPosts.jsp");
    }
    
}
