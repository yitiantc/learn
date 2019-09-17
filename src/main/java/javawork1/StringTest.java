package javawork1;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {


        //char* temp = malloc(6);
        //char* greeting = "Hello";
        Scanner in = new Scanner("C:\\Javafile\\abc.txt");

        String greeting = "Hello";
        boolean n = "Hello".equals(greeting);
        System.out.println(n);
        System.out.println(greeting);
        System.out.println(in);
    }
}
