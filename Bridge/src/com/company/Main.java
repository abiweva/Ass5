package com.company;

public class Main {

    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape pent = new Something(new BlueColor());
        pent.applyColor();
    }
}
