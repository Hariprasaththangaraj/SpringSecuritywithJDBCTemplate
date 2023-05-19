package com.springsecurity.withJDBC.controller;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SpringSecurityWithJDBC {

    @GetMapping("/get")
    public String getData() {
        return " This Data from Spring";
    }


    @GetMapping("/admin")
    public String getAdminData() {
        return " This Data from ADMIN";
    }


    @GetMapping("/user")
    public String getUserData() {
        return " This Data from USER";
    }
}
