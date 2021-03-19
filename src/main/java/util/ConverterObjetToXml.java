
package util;

import business.Degree;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


public class ConverterObjetToXml {
    
    public static void toXmlDocument(Class object, Object element){
        try {
            JAXBContext jc = JAXBContext.newInstance(object);
            Marshaller marshaller = jc.createMarshaller();
            marshaller.marshal(element, new File("/Users/ignacio/GoogleDrive/Ingenieria_informatica/4_2/Arquitectura_sofware/Entregas_del_proyecto/Practica_1_Patron_Front_Controller_y_Control_Sesion/UniversityBook/src/main/java/xml/degree.xml"));
        } catch (JAXBException ex) {
            Logger.getLogger(ConverterObjetToXml.class.getName()).log(Level.SEVERE, null, ex);
        }
    }       
    
}
