package com.example.ooppratice;

public class CorrectFixedPasswordGenerator implements PasswordGenerator{
    @Override
    public String generatePassword() {
        // 8글자
        return "abcdefgh";
    }
}
