package com.uaa.securityoauth;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Client {
    public static void main(String[] args) {
        String encode = new BCryptPasswordEncoder().encode("123");
    }
}
