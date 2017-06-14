package ua.com.owu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ua.com.owu.entity.Post;
import ua.com.owu.service.BlogService;
import ua.com.owu.service.PostService;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private PostService postService;

    @ModelAttribute("emptyPost")
    public Post post() {
        return new Post();
    }

    @GetMapping("/toAdminPage")
    public String toAdminPage(Model model) {
        model.addAttribute("emptyPost", Post.builder().postTitle("test").postText("text").build());
        return "adminPage";
    }

    @PostMapping("/saveBlog")
    public String saveBlog(@RequestParam("blogName") String bName,
                           @RequestParam String blogDescript) {
        blogService.save(bName, blogDescript);
        return "index";
    }


    @PostMapping("/savePost")
    public String savePost(@ModelAttribute("emptyPost") Post post) {
        postService.save(post);
        return "redirect:/admin/toAdminPage";
    }
}
