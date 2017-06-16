package ua.com.owu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ua.com.owu.entity.Blog;
import ua.com.owu.service.BlogService;
import ua.com.owu.service.PostService;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private PostService postService;

//    @RequestMapping(method = RequestMethod.GET, value = "/")
    @GetMapping({"/","/hi"})
    public String index(Model model) {
        model.addAttribute("xxx", "рамакафон");
        return "index";
    }



    @GetMapping("/showAllBlogs")
    public String showAllBlogs(Model model){
        List<Blog> blogs = blogService.findAll();
        model.addAttribute("blogsList", blogs);
        return "blogsList";
    }

    @GetMapping("/blogDetails{xxx}")
    public String blogDetails(@PathVariable("xxx") int id,
                              Model model){

        Blog blog = blogService.findOneWithPosts(id);
        model.addAttribute("blog",blog);

        return "blogPage";
    }


    @GetMapping("/detPost-{id}")
    public String detPost (@PathVariable int id,
                           Model model){

        model.addAttribute("post", postService.findOne(id));
        return "postPage";
    }

    @GetMapping("/edit-{id}")
    public String editPost(@PathVariable int id,
                           Model model){

        model.addAttribute("emptyPost", postService.findOne(id));
        System.out.println(blogService.findAll());
        model.addAttribute("blogs", blogService.findAll());

        return "adminPage";
    }
}

