
package presentation.commands;

public class ShowMyPosts extends FrontCommand{

    @Override
    public void process() {
        forward("/ShowMyPosts.jsp");
    }
    
}
