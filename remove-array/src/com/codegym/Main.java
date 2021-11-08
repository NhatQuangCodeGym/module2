package com.codegym;

import java.util.Arrays;
public class Main {
    public static int[] removeTheElement(int[] array,int index){
        if(array == null|| index >= array.length|| index<0 ){
            return array;
        }
        int[] newArray =new int[array.length-1];
        for(int i=0, k=0; i<array.length;i++ ){
            if(i==index){
                continue;
            }
            newArray[k++]=array[i];
        }   return newArray;
    }
    public static void main(String[] args ){
        int[] array = {1,2,3,4,5,6};
        System.out.println("Mang ban dau la: " + Arrays.toString(array));
        int index = 3;
        array = removeTheElement(array,index);
        System.out.println("Mang sau khi xoa la: " + Arrays.toString(array));







    }
}