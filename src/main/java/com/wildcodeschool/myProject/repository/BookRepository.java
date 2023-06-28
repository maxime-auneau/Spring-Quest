package com.wildcodeschool.myProject.repository;

import com.wildcodeschool.myProject.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByTitleContainingOrDescriptionContaining(String text, String textAgain);
}
