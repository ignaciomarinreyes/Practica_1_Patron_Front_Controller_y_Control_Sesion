package business;

import java.time.LocalDate;

public class Comment {
    private User user;
    private String content;
    private LocalDate date;

    public Comment(User user, String content, LocalDate date) {
        this.user = user;
        this.content = content;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }   
    
}
