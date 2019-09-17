package javawork1;

import java.util.Date;

public class Demo01Method {
    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println("===============");
        print();
        System.out.println(new Date());
    }

    public static int sum(int a ,int b){
        return a+b;
    }

    public static void print(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
