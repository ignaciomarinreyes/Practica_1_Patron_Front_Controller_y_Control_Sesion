
package controller.commands;

import data.Data;

public class Login extends FrontCommand{

    @Override
    public void process() {
        Data.loadDefaultData();
        request.getSession().setAttribute("address", Data.getAddress());
        request.getSession().setAttribute("comments", Data.getComments());
        request.getSession().setAttribute("degrees", Data.getDegrees());
        request.getSession().setAttribute("posts", Data.getPosts());
        request.getSession().setAttribute("subjects", Data.getSubjects());
        request.getSession().setAttribute("universities", Data.getUniversities());
        request.getSession().setAttribute("users", Data.getUsers());       
        forward("/Login.jsp");
    }
    
}
