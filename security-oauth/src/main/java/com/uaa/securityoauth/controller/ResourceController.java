package com.uaa.securityoauth.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/r/r1")
    public String resource(){
        return "resource";
    }
    /**
      * 注解指定需要的权限
      **/
    @RequestMapping("/r/pre")
    @PreAuthorize("hasAnyAuthority('vip1')")
    public String pre(){
        return "pre";
    }
}
