package com.uaa.securityoauth;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Client {
    public static void main(String[] args) {
        String encode = new BCryptPasswordEncoder().encode("123");
        System.out.println(encode);
        System.out.println("dev");
        System.out.println("two");
        System.out.println("admin");
        System.out.println("two");
    }
}
