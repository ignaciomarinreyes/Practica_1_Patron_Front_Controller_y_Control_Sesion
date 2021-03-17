
package controller.commands;

import business.Degree;
import business.Subject;
import business.University;
import java.util.List;

public class ShowDegrees extends FrontCommand{
    
    @Override
    public void process() {
        request.setAttribute("degrees", (List<University>)request.getSession().getAttribute("degrees"));
        forward("/Degrees.jsp");
    }
}
