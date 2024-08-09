package org.example;
import exception.WrongLoginException;
import exception.exception.WrongPasswordException;

import static org.example.service.ValidationService.validate;

public class Main {
    public static void main(String args[]){
        try {
            validate("morkow", "132", "132");
            System.out.println("Все супер! Данные корректны");
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Спасибо!");
        }
    }
}
