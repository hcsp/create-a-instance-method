package com.github.hcsp.pet;

public class Home {
    public static void main(String[] args) {
        Cat black = new Cat();
        black.name = "Black";
        black.sayName();

        Cat white = new Cat();
        white.name = "White";
        white.sayName();
    }
}
