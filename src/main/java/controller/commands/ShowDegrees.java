package controller.commands;

import business.Degree;
import business.University;
import data.Data;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.XsltProcessor;

public class ShowDegrees extends FrontCommand {

    @Override
    public void process() {
        PrintWriter out = null;
        try {
            List<Degree> degrees = Data.getDegrees();
            XsltProcessor processor = new XsltProcessor("degree.xsl");
            out = response.getWriter();
            out.println(head());
            for (Degree degree : degrees) {
                out.println(processor.getTransformation(util.ConverterObjetToXml.toXmlDegree(Degree.class, degree)));
            }
            out.println(footer());
        } catch (IOException ex) {
            Logger.getLogger(ShowDegrees.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            out.close();
        }
    }

    private String head() {
        return "<html>"
                + "<head>"
                + "   <meta http-equiv='Content-Type' content='text/html; charset=UTF-8'> "
                + "  <link rel='stylesheet' type='text/css' href='template.css'/> "
                + "</head> "
                + "<body> "
                + " <header id=\"title\"><a style=\"color: black; text-decoration: none;\" href=\"MainFrame.jsp\">UniversityBook</a></header>"
                + " <div id='centerSpace'>";
    }

    private String footer() {
        return "</div>"
                + "</body> "
                + "</html>";
    }

}
