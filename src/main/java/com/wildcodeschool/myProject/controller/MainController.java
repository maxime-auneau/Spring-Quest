package com.wildcodeschool.myProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/greetings")
    @ResponseBody
    public String index() {
        return "Greetings from <a href='https://spring.io/projects/spring-boot'>Spring Boot!</a>";
    }

    @GetMapping("/movie")
    @ResponseBody
    public String showTitle(@RequestParam String title, @RequestParam(defaultValue = "", required = false) String year) {
        if (!year.isEmpty()) {
            return "The movie's title is " + title + " (" + year + ")";
        }
        return "The movie's title is " + title;
    }


}
