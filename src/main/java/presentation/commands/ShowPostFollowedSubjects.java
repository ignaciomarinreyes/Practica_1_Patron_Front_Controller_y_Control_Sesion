
package presentation.commands;

public class ShowPostFollowedSubjects extends FrontCommand{

    @Override
    public void process() {
        forward("/ShowPostFollowedSubjects.jsp");
    }
    
}
