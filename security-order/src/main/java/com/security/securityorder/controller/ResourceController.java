package com.security.securityorder.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    /**
      * 注解指定需要的权限
      **/
    @RequestMapping("r/order_resource")
    @PreAuthorize("hasAnyAuthority('vip1')")
    public String order_resource(){
        return "I am order_resource";
    }
}
