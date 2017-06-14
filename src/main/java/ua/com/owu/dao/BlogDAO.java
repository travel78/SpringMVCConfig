package ua.com.owu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.owu.entity.Blog;

public interface BlogDAO extends JpaRepository<Blog,Integer>{


}
