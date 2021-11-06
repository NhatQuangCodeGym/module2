package com.codegym;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int a;
    int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao mot so a:");
        a = input.nextInt();
        System.out.println("Nhap vao mot so b:");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No greatest coammon factor");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greatest common factor: " + a);

    }
}
