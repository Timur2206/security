package ru.itmentor.spring.boot_security.demo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoderGenerator {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword = "Yana"; // Замените на реальный пароль
        String encodedPassword = encoder.encode(rawPassword);
        System.out.println(encodedPassword);
    }
}
