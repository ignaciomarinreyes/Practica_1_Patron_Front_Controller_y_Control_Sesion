package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XsltProcessor {

    private String pathXmlEntityModel;
    private String pathXslSecond;

    public XsltProcessor(String pathXmlEntityModel, String pathXslSecond) {
        this.pathXmlEntityModel = pathXmlEntityModel;
        this.pathXslSecond = pathXslSecond;
    }

    public String getTransformation(String xmlEntity) {
        System.out.println(xmlEntity);
        return secondTransformation(firstTransformation(xmlEntity));
    }

    private String firstTransformation(String xmlEntity) {
        String strResult = null;
        try {
            TransformerFactory tFactory = TransformerFactory.newInstance();
            StreamSource source = new StreamSource(new StringReader(xmlEntity));
            Source xslDoc = new StreamSource("/Users/ignacio/GoogleDrive/Ingenieria_informatica/4_2/Arquitectura_sofware/Entregas_del_proyecto/Practica_1_Patron_Front_Controller_y_Control_Sesion/UniversityBook/src/main/webapp/xsl/degree.xsl");
            StringWriter writer = new StringWriter();
            StreamResult result = new StreamResult(writer);
            Transformer trasform = tFactory.newTransformer(xslDoc);
            trasform.transform(source, result);
            strResult = writer.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return strResult;
    }

    private String secondTransformation(String formatFirstTransformation) {
       String strResult = null;
        try {
            TransformerFactory tFactory = TransformerFactory.newInstance();
            StreamSource source = new StreamSource(new StringReader(formatFirstTransformation));
            Source xslDoc = new StreamSource("/Users/ignacio/GoogleDrive/Ingenieria_informatica/4_2/Arquitectura_sofware/Entregas_del_proyecto/Practica_1_Patron_Front_Controller_y_Control_Sesion/UniversityBook/src/main/webapp/xsl/actual/second_actual.xsl");
            StringWriter writer = new StringWriter();
            StreamResult result = new StreamResult(writer);
            Transformer trasform = tFactory.newTransformer(xslDoc);
            trasform.transform(source, result);
            strResult = writer.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return strResult;
    }
}
