package ua.com.owu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ua.com.owu.entity.Post;

import java.util.List;

@Component
public class PostValidator implements Validator {

    @Autowired
    private PostService postService;

    public boolean supports(Class<?> clazz) {
        return clazz.equals(Post.class);
    }

    public void validate(Object target, Errors errors) {
        List<Post> postList = postService.findAll();
        Post post = (Post) target;
        postList.forEach((p) -> {
            if (p.getPostTitle().equals(post.getPostTitle())) {
                errors.rejectValue(
                        "postTitle",
                        "450",
                        "post title is already exists"
                );
            }
        });
    }
}
