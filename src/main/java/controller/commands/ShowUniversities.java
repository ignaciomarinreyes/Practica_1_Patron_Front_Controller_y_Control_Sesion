
package controller.commands;

import business.Degree;
import business.Subject;
import business.University;
import data.Data;
import java.util.List;

public class ShowUniversities extends FrontCommand{
    
    @Override
    public void process() {
        request.setAttribute("universities", Data.getUniversities());
        forward("/Universities.jsp");
    }
}
