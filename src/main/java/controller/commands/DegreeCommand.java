package controller.commands;

import business.Degree;
import business.University;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.XsltProcessor;

public class DegreeCommand extends FrontCommand {

    @Override
    public void process() {
        PrintWriter out = null;
        try {
            List<Degree> degrees = (List<Degree>) request.getSession().getAttribute("degrees");
            XsltProcessor processor = new XsltProcessor("degree.xsl", "second.xsl");
            util.ConverterObjetToXml.toXmlDocument(Degree.class, degrees.get(0));
            processor.getTransformation(); // Se crea un archivo .xml con la segunda tranformación del objeto degree en la carpeta del proyecto
            out = response.getWriter();
            out.println(head());
            out.println(processor.readFile()); // se lee el archivo .xml que se creó anteriormente
            out.println(footer());
        } catch (IOException ex) {
            Logger.getLogger(DegreeCommand.class.getName()).log(Level.SEVERE, null, ex);
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