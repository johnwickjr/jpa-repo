package com.example.security.services;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;

public class MyUserDetail implements UserDetails {
   private String userName;


   public MyUserDetail() {
   }

   public MyUserDetail(String userName) {
      System.out.println(userName);
      this.userName = userName;
   }

   @Override
   public Collection<? extends GrantedAuthority> getAuthorities() {
      return Arrays.asList(new SimpleGrantedAuthority("ROLE_admin"));
   }

   @Override
   public String getPassword() {
      return "pass";
   }

   @Override
   public String getUsername() {
      return userName;
   }

   @Override
   public boolean isAccountNonExpired() {
      return true;
   }

   @Override
   public boolean isAccountNonLocked() {
      return true;
   }

   @Override
   public boolean isCredentialsNonExpired() {
      return true;
   }

   @Override
   public boolean isEnabled() {
      return true;
   }
}
