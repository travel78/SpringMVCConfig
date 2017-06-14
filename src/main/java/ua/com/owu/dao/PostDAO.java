package ua.com.owu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.owu.entity.Post;

public interface PostDAO extends JpaRepository<Post, Integer> {
}
