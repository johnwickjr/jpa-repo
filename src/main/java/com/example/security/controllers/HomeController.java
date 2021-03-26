package com.example.security.controllers;

import com.example.security.entities.Book;
import com.example.security.entities.User;
import com.example.security.services.UserRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    UserRepoImpl service;


    @GetMapping("/")
    public String home() {
        return "this is home";
    }

    @GetMapping("/user")
    public Book getBooks() {
        return new Book("J.k o my goo true love potter", "fire O fire", "fire is here");
    }

    @GetMapping("/admin")
    public Book adminBook() {
        return new Book("see you at the top", "introduction of management", "introduced by zig ziggler");
    }

    @GetMapping("/save/{name}/{pass}/{role}")
    public User saveUser(@PathVariable("name") String name, @PathVariable("pass") String pass, @PathVariable("role") String role) {
        return service.saveUser(name, pass, role);
    }

        @PostMapping("/testing-get/{ts}")
    public String testing(@PathVariable("ts") String ts) {
        System.out.println(ts);
        return "testing-get";
    }
}
