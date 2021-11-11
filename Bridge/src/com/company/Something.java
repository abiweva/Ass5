package com.company;



public class Something extends Shape{

    public Something(Color c) {
        super(c);
    }

    @Override
    public void applyColor() {
        System.out.print("Something filled with color ");
        color.applyColor();
    }

}
