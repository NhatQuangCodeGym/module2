package com.codegym;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	System.out.print("Nhap vao so phan tu cua mang:");
    int size = input.nextInt();
    int[] array;
    array = new int[size];
    int i=0;
    while (i<array.length){
        System.out.print("Enter element " + (i+1) + ":" );
        array[i]= input.nextInt();
        i++;
    }
        System.out.print("Cac phan tu cua mang la: ");
        for(int element : array) {
            System.out.print(element);
        }
        System.out.println();
        int value;
        System.out.println("Nhap gia tri muon chen vao: ");
        value = input.nextInt();
        int vindex;
        System.out.print("Nhap vi tri muon chen vao: ");
        vindex = input.nextInt();
        for(int k = size;k > size;k--){
            array[k]= array[k-1];
        }
        array[vindex-1]= value;
        System.out.print("Sau khi chen: ");
        for(int element : array) {
            System.out.print(element);
        }
        System.out.println();
        }
    }

