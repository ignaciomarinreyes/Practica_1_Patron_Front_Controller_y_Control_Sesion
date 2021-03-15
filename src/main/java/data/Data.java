package data;

import business.Comment;
import business.Post;
import business.User;
import java.time.LocalDate;
import java.util.ArrayList;

public class Data {

    public static ArrayList<Post> loadPostsArquitecturaSofware(User user) {
        ArrayList<Post> posts = new ArrayList<Post>();
        Post post1 = new Post("Libro de arquitectura del sofware", user, LocalDate.now(), "Comparto el libro de patrones de diseño, muy útil", "images/libro1.jpeg");
        post1.addComment(new Comment(user, "Buen aporte", LocalDate.now()));
        post1.addComment(new Comment(user, "De gran utilidad", LocalDate.now()));
        post1.addLike();
        posts.add(post1);

        Post post2 = new Post("Apuntes de arquitectura del sofware", user, LocalDate.now(), "Comparto unos apuntes propios de la asignatura", "images/apuntes1.jpeg");
        post2.addComment(new Comment(user, "Están bastante bien los apuntes", LocalDate.now()));
        post2.addFile("pdf/pdf1.pdf");
        post2.addLink("https://es.wikipedia.org/wiki/Arquitectura_de_software");
        posts.add(post2);
        return posts;
    }
    
    public static ArrayList<Post> loadAllPosts(User user) {       
        ArrayList<Post> posts = new ArrayList<Post>();
        
        Post post0 = new Post("Apuntes de gestión del sofware 2", user, LocalDate.now(), "Comparto unos apuntes propios de la asignatura", "images/apuntes1.jpeg");
        post0.addComment(new Comment(user, "Están bastante bien los apuntes", LocalDate.now()));
        post0.addLink("https://onerp.es/que-es-un-software-de-gestion");
        post0.addFile("pdf/pdf2.pdf");
        posts.add(post0);
        
        Post post1 = new Post("Libro de arquitectura del sofware", user, LocalDate.now(), "Comparto el libro de patrones de diseño, muy útil", "images/libro1.jpeg");
        post1.addComment(new Comment(user, "Buen aporte", LocalDate.now()));
        post1.addComment(new Comment(user, "De gran utilidad", LocalDate.now()));
        post1.addLike();
        posts.add(post1);

        Post post2 = new Post("Apuntes de arquitectura del sofware", user, LocalDate.now(), "Comparto unos apuntes propios de la asignatura", "images/apuntes1.jpeg");
        post2.addComment(new Comment(user, "Están bastante bien los apuntes", LocalDate.now()));
        post2.addFile("pdf/pdf1.pdf");
        post2.addLink("https://es.wikipedia.org/wiki/Arquitectura_de_software");
        posts.add(post2);
        return posts;
    }
    
    public static ArrayList<Post> loadPostsGestionSofware(User user) {     
        ArrayList<Post> posts = new ArrayList<Post>();
        
        Post post0 = new Post("Apuntes de gestión del sofware 2", user, LocalDate.now(), "Comparto unos apuntes propios de la asignatura", "images/apuntes1.jpeg");
        post0.addComment(new Comment(user, "Están bastante bien los apuntes", LocalDate.now()));
        post0.addLink("https://onerp.es/que-es-un-software-de-gestion");
        post0.addFile("pdf/pdf2.pdf");
        posts.add(post0);
        
         return posts;
    }
}
