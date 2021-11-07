package com.codegym;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int length = array1.length + array2.length;

        int[] result = new int[length];
        int k = 0;

        for (int element : array1) {
            result[k] = element;
            k++;
        }

        for (int element : array2) {
            result[k] = element;
            k++;
        }

        System.out.println(Arrays.toString(result));

    }
}