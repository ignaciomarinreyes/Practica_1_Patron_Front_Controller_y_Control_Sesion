
package controller.commands;

public class ShowPostsSubject extends FrontCommand{

    @Override
    public void process() {
        forward("/ShowPostsSubject.jsp");
    }
    
}
