package ua.com.owu.service;

import ua.com.owu.entity.Post;

import java.util.List;

public interface PostService {
    void save(String postTitle, String postText);
    void save(Post post);

    Post findOne(int id);
    Post findOneWithBlog(int id);

    List<Post> findAll();

}
