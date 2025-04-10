package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "dummy I love Jenkins";

    public App() {}

    public static void main(String[] args) {
        System.out.println("Modified for github scm from local project 2");
    }

    public String getMessage() {
        return MESSAGE;
    }
}
