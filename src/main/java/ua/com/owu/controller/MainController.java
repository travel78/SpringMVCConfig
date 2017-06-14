package ua.com.owu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ua.com.owu.entity.Blog;
import ua.com.owu.service.BlogService;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private BlogService blogService;

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

        Blog blog = blogService.findOne(id);
        model.addAttribute("blog",blog);

        return "blogsList";
    }
}

