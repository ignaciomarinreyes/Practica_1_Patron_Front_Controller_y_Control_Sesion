package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
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

    public void getTransformation() {
        firstTransformation();
        secondTransformation();
    }

    private void firstTransformation() {
        OutputStream htmlFile = null;
        try {
            TransformerFactory tFactory = TransformerFactory.newInstance();
            Source xslDoc = new StreamSource("/Users/ignacio/GoogleDrive/Ingenieria_informatica/4_2/Arquitectura_sofware/Entregas_del_proyecto/Practica_1_Patron_Front_Controller_y_Control_Sesion/UniversityBook/src/main/java/xsl/degree.xsl");
            Source xmlDoc = new StreamSource("/Users/ignacio/GoogleDrive/Ingenieria_informatica/4_2/Arquitectura_sofware/Entregas_del_proyecto/Practica_1_Patron_Front_Controller_y_Control_Sesion/UniversityBook/src/main/java/xml/degree.xml");
            String outputFileName = "/Users/ignacio/GoogleDrive/Ingenieria_informatica/4_2/Arquitectura_sofware/Entregas_del_proyecto/Practica_1_Patron_Front_Controller_y_Control_Sesion/UniversityBook/src/main/java/xml/degree_1.xml";
            htmlFile = new FileOutputStream(outputFileName);
            Transformer trasform = tFactory.newTransformer(xslDoc);
            trasform.transform(xmlDoc, new StreamResult(htmlFile));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(XsltProcessor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(XsltProcessor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(XsltProcessor.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                htmlFile.close();
            } catch (IOException ex) {
                Logger.getLogger(XsltProcessor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void secondTransformation() {
        OutputStream htmlFile = null;
        try {
            TransformerFactory tFactory = TransformerFactory.newInstance();
            //Source xslDoc = new StreamSource("/Users/ignacio/GoogleDrive/Ingenieria_informatica/4_2/Arquitectura_sofware/Entregas_del_proyecto/Practica_1_Patron_Front_Controller_y_Control_Sesion/UniversityBook/src/main/java/xsl/second_1.xsl");
            Source xslDoc = new StreamSource("/Users/ignacio/GoogleDrive/Ingenieria_informatica/4_2/Arquitectura_sofware/Entregas_del_proyecto/Practica_1_Patron_Front_Controller_y_Control_Sesion/UniversityBook/src/main/java/xsl/second_2.xsl");
            Source xmlDoc = new StreamSource("/Users/ignacio/GoogleDrive/Ingenieria_informatica/4_2/Arquitectura_sofware/Entregas_del_proyecto/Practica_1_Patron_Front_Controller_y_Control_Sesion/UniversityBook/src/main/java/xml/degree_1.xml");
            String outputFileName = "/Users/ignacio/GoogleDrive/Ingenieria_informatica/4_2/Arquitectura_sofware/Entregas_del_proyecto/Practica_1_Patron_Front_Controller_y_Control_Sesion/UniversityBook/src/main/java/xml/degree_2.xml";
            htmlFile = new FileOutputStream(outputFileName);
            Transformer trasform = tFactory.newTransformer(xslDoc);
            trasform.transform(xmlDoc, new StreamResult(htmlFile));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(XsltProcessor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(XsltProcessor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(XsltProcessor.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                htmlFile.close();
            } catch (IOException ex) {
                Logger.getLogger(XsltProcessor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public String readFile() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        String result = "";
        try {
            archivo = new File("/Users/ignacio/GoogleDrive/Ingenieria_informatica/4_2/Arquitectura_sofware/Entregas_del_proyecto/Practica_1_Patron_Front_Controller_y_Control_Sesion/UniversityBook/src/main/java/xml/degree_2.xml");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                result += linea;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {       
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }
}
