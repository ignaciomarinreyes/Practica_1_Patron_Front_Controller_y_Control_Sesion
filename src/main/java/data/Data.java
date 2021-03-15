package data;

import business.Address;
import business.Comment;
import business.Post;
import business.Rol;
import business.User;
import java.time.LocalDate;
import java.util.ArrayList;

public class Data {
    
    public static ArrayList<Post> loadMyPosts() {
        ArrayList<Post> posts = new ArrayList<Post>();
        User userIgnacio = new User("ignacio", "123","Ignacio", "Marín Reyes",Rol.Student, new Address("Polizón", "24", "35118", "Agüimes", "Canarias"), "ULPGC", "Grado en Ingeniería Informática");
        User userLuis = new User("luis", "123","Luis", "Marín Reyes",Rol.Student, new Address("Polizón", "24", "35118", "Agüimes", "Canarias"), "ULPGC", "Grado en Ingeniería Informática");
        Post post1 = new Post("Libro de arquitectura del sofware", userIgnacio, LocalDate.now(), "Comparto el libro de patrones de diseño, muy útil", "images/libro1.jpeg");
        post1.addComment(new Comment(userLuis, "Buen aporte", LocalDate.now()));
        post1.addComment(new Comment(userIgnacio, "De gran utilidad", LocalDate.now()));
        post1.addLike();
        posts.add(post1);
        
        return posts;
    }

    public static ArrayList<Post> loadPostsArquitecturaSofware() {
        ArrayList<Post> posts = new ArrayList<Post>();
        User userIgnacio = new User("ignacio", "123","Ignacio", "Marín Reyes",Rol.Student, new Address("Polizón", "24", "35118", "Agüimes", "Canarias"), "ULPGC", "Grado en Ingeniería Informática");
        User userLuis = new User("luis", "123","Luis", "Marín Reyes",Rol.Student, new Address("Polizón", "24", "35118", "Agüimes", "Canarias"), "ULPGC", "Grado en Ingeniería Informática");
        Post post1 = new Post("Libro de arquitectura del sofware", userIgnacio, LocalDate.now(), "Comparto el libro de patrones de diseño, muy útil", "images/libro1.jpeg");
        post1.addComment(new Comment(userLuis, "Buen aporte", LocalDate.now()));
        post1.addComment(new Comment(userIgnacio, "De gran utilidad", LocalDate.now()));
        post1.addLike();
        posts.add(post1);

        Post post2 = new Post("Apuntes de arquitectura del sofware", userLuis, LocalDate.now(), "Comparto unos apuntes propios de la asignatura", "images/apuntes1.jpeg");
        post2.addComment(new Comment(userLuis, "Están bastante bien los apuntes", LocalDate.now()));
        post2.addFile("pdf/pdf1.pdf");
        post2.addLink("https://es.wikipedia.org/wiki/Arquitectura_de_software");
        posts.add(post2);
        return posts;
    }
    
    public static ArrayList<Post> loadPostsGestionSofware() {     
        ArrayList<Post> posts = new ArrayList<Post>();
        User userLuis = new User("luis", "123","Luis", "Marín Reyes",Rol.Student, new Address("Polizón", "24", "35118", "Agüimes", "Canarias"), "ULPGC", "Grado en Ingeniería Informática");
        User userIgnacio = new User("ignacio", "123","Ignacio", "Marín Reyes",Rol.Student, new Address("Polizón", "24", "35118", "Agüimes", "Canarias"), "ULPGC", "Grado en Ingeniería Informática");
        Post post0 = new Post("Apuntes de gestión del sofware 2", userLuis, LocalDate.now(), "Comparto unos apuntes propios de la asignatura", "images/apuntes1.jpeg");
        post0.addComment(new Comment(userIgnacio, "Están bastante bien los apuntes", LocalDate.now()));
        post0.addLink("https://onerp.es/que-es-un-software-de-gestion");
        post0.addFile("pdf/pdf2.pdf");
        posts.add(post0);
        
         return posts;
    }

    public static User loadMyUser(String nickname, String password) {
        return new User(nickname, password,"Ignacio", "Marín Reyes",Rol.Student, new Address("Polizón", "24", "35118", "Agüimes", "Canarias"), "ULPGC", "Grado en Ingeniería Informática");
    }
    
    public static ArrayList<Post> loadPostsFollowedSubject() {     
          User userLuis = new User("luis", "123","Luis", "Marín Reyes",Rol.Student, new Address("Polizón", "24", "35118", "Agüimes", "Canarias"), "ULPGC", "Grado en Ingeniería Informática");
        User userIgnacio = new User("ignacio", "123","Ignacio", "Marín Reyes",Rol.Student, new Address("Polizón", "24", "35118", "Agüimes", "Canarias"), "ULPGC", "Grado en Ingeniería Informática");
        ArrayList<Post> posts = new ArrayList<Post>();
        
        Post post0 = new Post("Apuntes de gestión del sofware 2", userLuis, LocalDate.now(), "Comparto unos apuntes propios de la asignatura", "images/apuntes1.jpeg");
        post0.addComment(new Comment(userIgnacio, "Están bastante bien los apuntes", LocalDate.now()));
        post0.addLink("https://onerp.es/que-es-un-software-de-gestion");
        post0.addFile("pdf/pdf2.pdf");
        posts.add(post0);
        
        Post post1 = new Post("Libro de arquitectura del sofware", userIgnacio, LocalDate.now(), "Comparto el libro de patrones de diseño, muy útil", "images/libro1.jpeg");
        post1.addComment(new Comment(userLuis, "Buen aporte", LocalDate.now()));
        post1.addComment(new Comment(userLuis, "De gran utilidad", LocalDate.now()));
        post1.addLike();
        posts.add(post1);

        Post post2 = new Post("Apuntes de arquitectura del sofware", userLuis, LocalDate.now(), "Comparto unos apuntes propios de la asignatura", "images/apuntes1.jpeg");
        post2.addComment(new Comment(userIgnacio, "Están bastante bien los apuntes", LocalDate.now()));
        post2.addFile("pdf/pdf1.pdf");
        post2.addLink("https://es.wikipedia.org/wiki/Arquitectura_de_software");
        posts.add(post2);
        return posts;
    }
       
}
