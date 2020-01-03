package com.higbie.classes;

import java.util.Scanner;

public class ExampleIO {

    public static void main(String[] args){
        int result = divide();
        System.out.println(result);
    }

    private static int divide(){
        int x = getInt();
        int y = getInt();
        System.out.println("X is " + x + ", Y is "+ y);
        return x/y;
    }

    private static int getInt(){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        return s.nextInt();
    }
}
