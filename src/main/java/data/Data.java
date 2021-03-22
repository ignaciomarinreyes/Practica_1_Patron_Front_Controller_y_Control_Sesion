package data;

import business.Address;
import business.Comment;
import business.Degree;
import business.Post;
import business.Rol;
import business.Subject;
import business.University;
import business.User;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Data {

    private static List<User> users;
    private static List<Address> address;
    private static List<University> universities;
    private static List<Degree> degrees;
    private static List<Subject> subjects;
    private static List<Comment> comments;
    private static List<Post> posts;
    
    public static void loadDefaultData(){
        address = loadAllAddress();
        universities = loadAllUniversities();
        degrees = loadAllDegrees();      
        users = loadAllUser();     
        subjects = loadAllSubjects();
        comments = loadAllComments();
        posts = loadAllPost();
    }
    
    private static List<Address> loadAllAddress() {
        ArrayList<Address> address = new ArrayList<Address>();
        Address ignacioAddress = new Address("Polizón", "24", "35118", "Agüimes", "Canarias");
        Address luisAddress = new Address("Colon", "25", "35119", "Arinaga", "Canarias");
        Address ulpcAddress = new Address("Un misterio", "25", "35119", "Tafira", "Canarias");
        Address ullAddress = new Address("Un misterio", "25", "35119", "La laguna", "Canarias");
        address.add(ignacioAddress);
        address.add(luisAddress);
        address.add(ulpcAddress);
        address.add(ullAddress);
        return address;
    }
    
    private static List<University> loadAllUniversities() {
        ArrayList<University> universities = new ArrayList<University>();
        University ulpgc = new University("ULPGC", address.get(2));
        University ull = new University("ULL", address.get(3));
        universities.add(ulpgc);
        universities.add(ull);
        return universities;
    }
    
    private static List<Degree> loadAllDegrees() {
        ArrayList<Degree> degrees = new ArrayList<Degree>();
        ArrayList<University> universitiesInformatica = new ArrayList<University>();
        universitiesInformatica.add(universities.get(0));
        ArrayList<University> universitiesAde = new ArrayList<University>();
        universitiesAde.add(universities.get(1));
        Degree informatica = new Degree("Grado en Ingenieria Informatica", universitiesInformatica);
        degrees.add(informatica);
        return degrees;
    }
    
    private static List<User> loadAllUser() {
       ArrayList<User> users = new ArrayList<User>();
       User ignacio = new User("ignacio", "1234","Ignacio", "Marín Reyes", Rol.Student, address.get(0), universities.get(0), degrees.get(0));
       User luis = new User("luis", "1234","Luis", "Enrique Galindo",Rol.Student, address.get(1), universities.get(1), degrees.get(0));
       User teacher = new User("Marta", "1234","Marta", "Enrique Galindo",Rol.Teacher, address.get(1), universities.get(1), degrees.get(0));
       User admin = new User("admin", "1234","admin", "Enrique Galindo",Rol.Admin, address.get(1));
       users.add(ignacio);
       users.add(luis);
       users.add(teacher);
       users.add(admin);
       return users;
    }

    private static List<Subject> loadAllSubjects() {
        ArrayList<Subject> subjects = new ArrayList<Subject>();
        Set<User> usersArquitecturaSofware = new HashSet<User>();
        usersArquitecturaSofware.add(users.get(0));
        usersArquitecturaSofware.add(users.get(1));
        Subject ArquitecturaSofware = new Subject("Arquitectura del Sofware", 4, users.get(3), universities.get(0), degrees.get(0), usersArquitecturaSofware);
        Set<User> usersGestionSofware2 = new HashSet<User>();
        usersGestionSofware2.add(users.get(0));
        Subject gestionSofware = new Subject("Gestión del Sofware 2", 4, users.get(3),universities.get(1), degrees.get(0), usersGestionSofware2);
        
        users.get(0).addSubject(ArquitecturaSofware);
        users.get(1).addSubject(ArquitecturaSofware);
        users.get(0).addSubject(gestionSofware);
        
        subjects.add(ArquitecturaSofware);
        subjects.add(gestionSofware);
        return subjects;
    }
    
    private static List<Comment> loadAllComments() {
        ArrayList<Comment> comments = new ArrayList<Comment>();
        Comment ignacioCommentArquitectura = new Comment(users.get(0), "Buen aporte", LocalDate.now());
        Comment luisCommentGestionSofware = new Comment(users.get(1), "Espectacular", LocalDate.now());
        comments.add(ignacioCommentArquitectura);
        comments.add(luisCommentGestionSofware);
        return comments;
    }

    private static List<Post> loadAllPost() {
       ArrayList<Post> posts = new ArrayList<Post>();
       Post postIgnacioArquitecturaSofware = new Post("Libro de arquitectura del Sofware", users.get(0), LocalDate.now(), "Comparto el libro de arquitectura", "images/libro1.jpeg", subjects.get(0));
       postIgnacioArquitecturaSofware.addComment(comments.get(0));
       posts.add(postIgnacioArquitecturaSofware);
       Post postIgnacioArquitecturaSofware2 = new Post("Apuntes de arquitectura del Sofware", users.get(0), LocalDate.now(), "Comparto los apuntes de arquitectura", "images/apuntes1.jpeg", subjects.get(0));
       posts.add(postIgnacioArquitecturaSofware2);
       Post postLuisoGestionSofware = new Post("Apuntes de gestión del sofware", users.get(1), LocalDate.now(), "Comparto los apuntes de gestión del sofware", "images/apuntes1.jpeg", subjects.get(1));
       posts.add(postLuisoGestionSofware);
       
       users.get(0).addPost(postIgnacioArquitecturaSofware);
       users.get(0).addPost(postIgnacioArquitecturaSofware2);
       users.get(1).addPost(postLuisoGestionSofware);
       
       return posts;
    }

    public static List<User> getUsers() {
        return users;
    }

    public static List<Address> getAddress() {
        return address;
    }

    public static List<University> getUniversities() {
        return universities;
    }

    public static List<Degree> getDegrees() {
        return degrees;
    }

    public static List<Subject> getSubjects() {
        return subjects;
    }

    public static List<Comment> getComments() {
        return comments;
    }

    public static List<Post> getPosts() {
        return posts;
    }
    
    public static void add(Post post){
        posts.add(post);
    }
       
}
