package business;

import java.util.List;

public class Degree {
    private static int idDegree = 0;
    private int id;
    private String name;
    private List<University> university;

    public Degree(String name, List<University> university) {
        this.id = idDegree++;
        this.name = name;
        this.university = university;
    }

    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<University> getUniversity() {
        return university;
    }

    public void setUniversity(List<University> university) {
        this.university = university;
    }
    
    
}
