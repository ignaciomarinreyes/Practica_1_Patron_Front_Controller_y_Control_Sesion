package data.dao;

import business.Post;
import business.Subject;
import business.User;
import data.Data;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class PostDAO {

    private HttpSession session;

    public PostDAO(HttpServletRequest request) {
        this.session = request.getSession();
    }

    public List<Post> findAllPostsFollowedSubjectsByUser(User userSesion) {
        List<Post> posts = new ArrayList<Post>();
        for (Post post : (ArrayList<Post>) session.getAttribute("posts")) {
            for (Subject subjectUserSession : userSesion.getSubjects()) {
                if (post.getSubject().equals(subjectUserSession)) {
                    posts.add(post);
                }
            }
        }
        return posts;
    }
}
