
package presentation.commands;

public class SearchSubject extends FrontCommand{
    
    @Override
    public void process() {
        forward("/SearchSubject.jsp");
    }
}
