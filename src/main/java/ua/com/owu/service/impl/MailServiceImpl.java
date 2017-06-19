package ua.com.owu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import ua.com.owu.entity.Blog;
import ua.com.owu.service.MailService;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@Service
public class MailServiceImpl implements MailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public void sendMail(String email, Blog blog) {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
        try {
            helper.setFrom("sergey.okten@gmail.com");
            helper.setTo(new InternetAddress(email));
            helper.setText("you`we been subscribe.....to blog " + blog.getBlogDescription() + " visit our " +
                    "website <a href='http://owu.com.ua'> here </a>", true);

        } catch (MessagingException e) { e.printStackTrace(); }

        javaMailSender.send(message);

    }
}
