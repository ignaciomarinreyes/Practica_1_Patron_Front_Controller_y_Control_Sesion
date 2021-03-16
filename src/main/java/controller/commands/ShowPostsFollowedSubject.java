
package controller.commands;

public class ShowPostsFollowedSubject extends FrontCommand{

    @Override
    public void process() {
        forward("/MainFrame.jsp");
    }
    
}
