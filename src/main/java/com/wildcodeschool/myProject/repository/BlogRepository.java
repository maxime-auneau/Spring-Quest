package com.wildcodeschool.myProject.repository;

import com.wildcodeschool.myProject.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepository  extends JpaRepository<Blog, Long> {
    List<Blog>
    findByTitleContainingOrContentContaining(String text, String textAgain);
}
