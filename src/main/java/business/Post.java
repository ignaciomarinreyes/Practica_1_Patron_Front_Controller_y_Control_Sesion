
package business;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private String title;
    private User user;
    private LocalDate date;
    private String content;
    private String pathImage;
    private int numberLikes;
    private List<Comment> comments;
    private List<String> files;
    private List<String> links;

    public Post(String title, User user, LocalDate date, String content, String pathImage) {
        this.title = title;
        this.user = user;
        this.date = date;
        this.content = content;
        this.pathImage = pathImage;
        this.numberLikes = 0;
        this.comments = new ArrayList<Comment>();
        this.files = new ArrayList<String>();
        this.links = new ArrayList<String>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPathImage() {
        return pathImage;
    }

    public void setPathImage(String pathImage) {
        this.pathImage = pathImage;
    }

    public int getNumberLikes() {
        return numberLikes;
    }

    public void setNumberLikes(int numberLikes) {
        this.numberLikes = numberLikes;
    }

    public List<Comment> getComments() {
        return comments;
    }
    
    public void addComment(Comment comment){
        comments.add(comment);
    }

    public List<String> getFiles() {
        return files;
    }
    
    public void addFile(String pathFile){
        files.add(pathFile);
    }

    public List<String> getLinks() {
        return links;
    }
    
    public void addLink(String link){
        links.add(link);
    }
    
    public void addLike(){
        numberLikes++;
    }
    
}
