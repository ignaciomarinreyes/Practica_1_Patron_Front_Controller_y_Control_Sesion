
package controller.commands;

import business.Degree;
import business.Subject;
import business.University;
import data.Data;
import java.util.List;

public class SearchSubject extends FrontCommand{
    
    @Override
    public void process() {
        request.setAttribute("universities", Data.getUniversities());
        request.setAttribute("degrees", Data.getDegrees());
        request.setAttribute("subjects", Data.getSubjects());
        forward("/SearchSubject.jsp");
    }
}
