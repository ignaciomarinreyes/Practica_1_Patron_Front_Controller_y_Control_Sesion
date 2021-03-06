package business;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Post {

    private static int idPost = 0;
    private int id;
    private String title;
    private User user;
    private LocalDate date;
    private String content;
    private String pathImage;
    private Set<User> likes;
    private List<Comment> comments;
    private List<String> files;
    private List<String> links;
    private Subject subject;

    public Post(String title, User user, LocalDate date, String content, String pathImage, Subject subject) {
        this.id = idPost++;
        this.title = title;
        this.user = user;
        this.date = date;
        this.content = content;
        this.pathImage = pathImage;
        this.subject = subject;
        this.likes = new HashSet<User>();
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

    public int getId() {
        return id;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public List<String> getFiles() {
        return files;
    }

    public void addFile(String pathFile) {
        files.add(pathFile);
    }

    public List<String> getLinks() {
        return links;
    }

    public void addLink(String link) {
        links.add(link);
    }

    public void addLike(User user) {
        likes.add(user);
    }

    public int numberLikes() {
        return likes.size();
    }

    public Subject getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Post{" + "id=" + id + ", title=" + title + ", user=" + user + ", date=" + date + ", content=" + content + ", pathImage=" + pathImage + '}';
    }

}
