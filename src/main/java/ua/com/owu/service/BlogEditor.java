package ua.com.owu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.owu.entity.Blog;

import java.beans.PropertyEditorSupport;

@Component
public class BlogEditor extends PropertyEditorSupport{
    @Autowired
    private BlogService blogService;

    @Override
    public void setAsText(String id) throws IllegalArgumentException {
        int idInt = Integer.parseInt(id);
        Blog blog = blogService.findOne(idInt);
        setValue(blog);

    }
}
