package com.javacourse.project2;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        int i = (int) (Math.random() * 100);
        System.out.println("i= " + i);
        System.out.println("vvedite chislo:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("vi vveli: " + number);

        if (i == number) {
            System.out.println("ygadali");
        } else {
            if (i > number) {
                System.out.println("bolshe");
            } else {
                System.out.println("menshe");
            }
        }
    }
}