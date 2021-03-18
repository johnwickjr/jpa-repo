package com.example.security.entities;

public class Book {

   private String name, title, subtitle;

   public Book(String name, String title, String subtitle) {
      this.name = name;
      this.title = title;
      this.subtitle = subtitle;
   }

   public Book() {
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getSubtitle() {
      return subtitle;
   }

   public void setSubtitle(String subtitle) {
      this.subtitle = subtitle;
   }
}
