package javawork1;

import java.util.Arrays;

public class ArrTest {
    public static void main(String[] args) {
        int[] a = {3, 2, 6, 4, 5, 6};
        int[] b = a;
        int s = b[3];
        int[] copy = Arrays.copyOf(a, 2 * a.length);
        for (int i = 0; i < copy.length; i++) {
            if (copy[i] == 0) {
                copy[i] = 10;
            }
        }
        for (int x : copy) {
            System.out.println(x);
        }
        System.out.println(s);
    }

    // 11
    // 11
}