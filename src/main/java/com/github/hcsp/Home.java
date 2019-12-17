package com.github.hcsp;

import com.github.hcsp.pet.Cat;

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
