package org.example.service;

import exception.WrongLoginException;
import exception.exception.WrongPasswordException;

public class ValidationService {
    public static final String VALIDATE_SYMBOLS = "qwertyuiop[]asdfghjkl;'zxcvbnm,./1234567890-QWERTYUIOPASDFGHJKLZXCVBNM";

    public static void validate(String login, String password, String confirmPassword) {
        validateLogin(login);
        validatePassword(password, confirmPassword);
    }

    private static void validateLogin(String login) {

        if (login.length() > 20) {
            throw new WrongLoginException("Логин содержит больше 20 символов", login);
        }
        for (int i = 0; i < login.length(); i++) {
            if (!VALIDATE_SYMBOLS.contains(String.valueOf(login.charAt(i)))) {
                throw new WrongLoginException("Логин содержит неккоректный символ", login);
            }
        }

    }

    private static void validatePassword(String password, String confirmPassword) {
        if (password.equals(confirmPassword)) {
            throw new WrongPasswordException(password);
        }
        if (password.length() > 20) {
            throw new WrongPasswordException(password);
        }
        for (int i = 0; i < password.length(); i++) {
            if (!VALIDATE_SYMBOLS.contains(String.valueOf(password.charAt(i)))) {
                throw new WrongPasswordException(password, confirmPassword);
            }
        }
    }
}
