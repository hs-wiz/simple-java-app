package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Dummy String I love Jenkins";

    public App() {}

    public static void main(String[] args) {
        System.out.println("Modified random word from local project");
    }

    public String getMessage() {
        return MESSAGE;
    }
}
