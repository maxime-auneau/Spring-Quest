package com.wildcodeschool.myProject.controller;

import com.wildcodeschool.myProject.model.Blog;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.wildcodeschool.myProject.repository.BlogRepository;

import java.util.List;
import java.util.Map;

@RestController
public class BlogController {

    @Autowired
    BlogRepository blogRespository;

    @GetMapping("/blogs")
    public List<Blog> index(){
        return blogRespository.findAll();
    }

    @GetMapping("/blogs/{id}")
    public Blog show(@PathVariable long id){
        return blogRespository.findById(id).get();
    }

    @PostMapping("/blog/search")
    public List<Blog> search(@RequestBody Map<String, String> body){
        String searchTerm = body.get("text");
        return blogRespository.findByTitleContainingOrContentContaining(searchTerm, searchTerm);
    }

    @PostMapping("/blogs")
    public Blog create(@RequestBody Blog blog){
        return blogRespository.save(blog);
    }

    @PutMapping("/blogs/{id}")
    public Blog update(@PathVariable long id, @RequestBody Blog blog){
        // getting blog
        Blog blogToUpdate = blogRespository.findById(id).get();
        blogToUpdate.setTitle(blog.getTitle());
        blogToUpdate.setContent(blog.getContent());
        return blogRespository.save(blogToUpdate);
    }

    @DeleteMapping("blogs/{id}")
    public boolean delete(@PathVariable long id){
        blogRespository.deleteById(id);
        return true;
    }
}
