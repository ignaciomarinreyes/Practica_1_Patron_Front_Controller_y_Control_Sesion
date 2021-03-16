package business;

import java.util.Set;

public class Subject {
    private static int idSubject = 0;
    private int id;
    private String name;
    private int course;
    private User teacher;
    private Set<User> students;

    public Subject(String name, int course, User teacher, Set<User> students) {
        this.id = idSubject++;
        this.name = name;
        this.course = course;
        this.teacher = teacher;
        this.students = students;
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

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public User getTeacher() {
        return teacher;
    }

    public void setTeacher(User teacher) {
        this.teacher = teacher;
    }

    public Set<User> getStudents() {
        return students;
    }

    public void setStudents(Set<User> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Subject{" + "id=" + id + ", name=" + name + ", course=" + course + ", teacher=" + teacher + '}';
    }

}
