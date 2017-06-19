package ua.com.owu.service;

import ua.com.owu.entity.Blog;

public interface MailService {
    void sendMail(String email, Blog blog);
}
