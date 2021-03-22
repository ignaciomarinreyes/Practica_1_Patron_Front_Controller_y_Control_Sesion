
package data.dao;

import business.Subject;
import data.Data;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SubjectDAO {
    
     public static Subject findById(int id){
        for(Subject subject : Data.getSubjects() ){
            if(subject.getId() == id){
                return subject;
            }
        }
        return null;
    }
    
}
