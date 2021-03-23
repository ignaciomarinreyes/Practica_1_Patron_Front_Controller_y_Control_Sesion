package data.dao;

import business.Post;
import business.Subject;
import business.User;
import data.Data;
import java.util.ArrayList;
import java.util.List;

public class PostDAO {

    public static List<Post> findAllPostsFollowedSubjectsByUser(User userSesion) {
        List<Post> posts = new ArrayList<Post>();
        for (Post post : Data.getPosts()) {
            for (Subject subjectUserSession : userSesion.getSubjects()) {
                if (post.getSubject().equals(subjectUserSession)) {
                    posts.add(post);
                }
            }
        }
        return posts;
    }

    public static List<Post> findPostBySubject(int idUniversity, int idDegree, int idSubject) {
        List<Post> posts = new ArrayList<Post>();
        for (Post post : (ArrayList<Post>) Data.getPosts()) {
            if (post.getSubject().getUniversity().getId() == idUniversity && post.getSubject().getDegree().getId() == idDegree && post.getSubject().getId() == idSubject) {
                posts.add(post);
            }
        }
        return posts;
    }

    public static List<Post> findPostByUser(User user) {
        List<Post> posts = new ArrayList<Post>();
        for (Post post : (ArrayList<Post>) Data.getPosts()) {
            if (post.getUser().equals(user)) {
                posts.add(post);
            }
        }
        return posts;
    }

    public static Post findById(int idPost) {
        for (Post post : (ArrayList<Post>) Data.getPosts()) {
            if (post.getId() == idPost) {
                return post;
            }
        }
        return null;
    }

}
