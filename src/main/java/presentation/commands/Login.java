
package presentation.commands;

public class Login extends FrontCommand{

    @Override
    public void process() {
        forward("/Login.jsp");
    }
    
}
