package com.example.security.services;

import com.example.security.entities.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MyUserDetail implements UserDetails {
    private String userName;
    private String role;
    private String userPassword;


    public MyUserDetail() {
    }

    public MyUserDetail(User user) {
        System.out.println(user);
        this.userName = user.getUserName();
        this.userPassword = user.getPassword();
        this.role = user.getRole();
        System.out.println(userName + " " + role + " " + userPassword);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singletonList(new SimpleGrantedAuthority(role));
    }

    @Override
    public String getPassword() {
        return userPassword;
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
