package com.example.ooppratice;

public class WrongFixedPasswordGenerator implements PasswordGenerator{
    @Override
    public String generatePassword() {
        return "ab"; // 2글자
    }
}