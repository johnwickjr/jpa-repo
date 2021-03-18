package com.example.security.controllers;

import com.example.security.entities.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


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
}
