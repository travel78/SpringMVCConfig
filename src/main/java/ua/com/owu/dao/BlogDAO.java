package ua.com.owu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ua.com.owu.entity.Blog;

public interface BlogDAO extends JpaRepository<Blog,Integer>{

    @Query("select b from Blog b left outer join fetch b.posts where b.id =:asd")
    Blog findOneWithPosts(@Param("asd") int id);

}
