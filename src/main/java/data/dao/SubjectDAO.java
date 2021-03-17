
package data.dao;

import business.Subject;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SubjectDAO {
    
    private HttpSession session;

    public SubjectDAO(HttpServletRequest request) {
        this.session = request.getSession();
    }
    
     public Subject findById(int id){
        for(Subject subject : (ArrayList<Subject>) session.getAttribute("subjects")){
            if(subject.getId() == id){
                return subject;
            }
        }
        return null;
    }
    
}
