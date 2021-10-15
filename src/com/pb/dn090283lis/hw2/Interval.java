package com.pb.dn090283lis.hw2;

import java.util.Scanner;

public class Interval {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Введите число: ");
        num = scanner.nextInt();
        if (num < 0 || num > 100) {
            System.out.print("Число не попадает в диапазон 0-100: ");
        } else {
            if (num < 15)
                System.out.println("Диапазон: [0-14]");
            if (num > 14 && num < 36)
                System.out.println("Диапазон: [15-35]");
            if (num > 35 && num < 51)
                System.out.println("Диапазон: [36-50]");
            if (num > 50)
                System.out.println("Диапазон: [51-100]");

        }
    }

}

