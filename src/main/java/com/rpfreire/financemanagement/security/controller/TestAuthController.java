package com.rpfreire.financemanagement.security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@PreAuthorize("denyAll()")
public class TestAuthController {
    @GetMapping("/hello")
    @PreAuthorize("permitAll()")
    public String hello(){
        return "Hello world";
    }

    @GetMapping("/hello-secured")
    @PreAuthorize("hasAnyAuthority('READ')")
    public String helloSecured(){
        return "Hello world secured";
    }
}
