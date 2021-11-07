package com.codegym;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int m;
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao so dong cua ma tran");
        m = input.nextInt();
        System.out.print("Nhap vao so cot cua ma tran");
        n = input.nextInt();
        int matrix[][] = new int[m][n];
        System.out.print("Nhap cac phan tu cho ma tran");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                matrix[i][j] = input.nextInt();
            }
        }
        int max=matrix[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Phan tu lon nhat cua ma tran la :" + max);
    }
}
