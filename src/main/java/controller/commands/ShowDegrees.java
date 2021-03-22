
package controller.commands;

import business.Degree;
import business.Subject;
import business.University;
import data.Data;
import java.util.List;

public class ShowDegrees extends FrontCommand{
    
    @Override
    public void process() {
        request.setAttribute("degrees", Data.getDegrees());
        forward("/Degrees.jsp");
    }
}
