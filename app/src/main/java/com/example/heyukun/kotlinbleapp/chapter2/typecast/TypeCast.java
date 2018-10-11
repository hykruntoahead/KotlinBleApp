package com.example.heyukun.kotlinbleapp.chapter2.typecast;

public class TypeCast {
    public static void main(String... args){
        Parent parent = new Child();
        System.out.println( ((Child)parent).getName());

        if (parent instanceof Child){
            System.out.println( ((Child)parent).getName());
        }

        //ClassCastException
//        Parent parent = new Parent();
//        System.out.println( ((Child)parent).getName());

    }
}
