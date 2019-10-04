package com.company;

import java.util.Scanner;

public class Calculator {

    private  int add(int x, int y )
    {
        return (x + y);
    }

    public static void main(String[] args) {

        System.out.println("Mrunalini");

        Scanner s = new Scanner(System.in);
       int  a = s.nextInt();
       int b  = s.nextInt();

       Calculator calObj = new Calculator();
        System.out.println(calObj.add(a, b ));






    }
}
