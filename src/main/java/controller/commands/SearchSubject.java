
package controller.commands;

import business.Degree;
import business.Subject;
import business.University;
import java.util.List;

public class SearchSubject extends FrontCommand{
    
    @Override
    public void process() {
        request.setAttribute("universities", (List<University>)request.getSession().getAttribute("universities"));
        request.setAttribute("degrees", (List<Degree>)request.getSession().getAttribute("degrees"));
        request.setAttribute("subjects", (List<Subject>)request.getSession().getAttribute("subjects"));
        forward("/SearchSubject.jsp");
    }
}
