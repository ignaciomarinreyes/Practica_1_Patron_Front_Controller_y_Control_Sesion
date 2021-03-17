
package controller.commands;

import business.Degree;
import business.Subject;
import business.University;
import java.util.List;

public class ShowUniversities extends FrontCommand{
    
    @Override
    public void process() {
        request.setAttribute("universities", (List<University>)request.getSession().getAttribute("universities"));
        forward("/Universities.jsp");
    }
}
