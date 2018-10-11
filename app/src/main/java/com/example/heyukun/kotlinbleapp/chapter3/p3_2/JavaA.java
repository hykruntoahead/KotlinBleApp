package com.example.heyukun.kotlinbleapp.chapter3.p3_2;

public class JavaA {
    private int b = 0;


    public int getB() {
        System.out.println("Some one gets b.");
        return b;
    }

    public void setB(int b) {
        System.out.println("Some one sets b.");
        this.b = b;
    }
}
