
package presentation.commands;

public class Logout extends FrontCommand{

    @Override
    public void process() {
        forward("/Logout.jsp");
    }
    
}
