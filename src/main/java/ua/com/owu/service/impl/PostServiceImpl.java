package ua.com.owu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.owu.dao.PostDAO;
import ua.com.owu.entity.Post;
import ua.com.owu.service.PostService;

import java.util.List;

@Service
@Transactional
public class PostServiceImpl implements PostService {
    @Autowired
    private PostDAO postDAO;

    public void save(String postTitle, String postText) {
        postDAO.save(Post.builder().postText(postText).postTitle(postTitle).build());
    }

    public void save(Post post) {
        postDAO.save(post);
    }

    public Post findOne(int id) {
        return postDAO.findOne(id);
    }

    @Override
    public Post findOneWithBlog(int id) {
        return postDAO.findOneWithBlog(id);
    }

    public List<Post> findAll() {
        return postDAO.findAll();
    }
}
