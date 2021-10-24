package com.pb.dn090283lis.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        int arrayLong = myArray.length, sumAll = 0, countPozitivNumbers = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Заполняем массив целыми числами.");
        for (int i = 0; i < arrayLong; i++) {
            System.out.print("myArray[" + i + "] = ");
            myArray[i] = in.nextInt();
        }
        System.out.print("myArray = {");
        for (int j = 0; j < arrayLong; j++) {
            sumAll += myArray[j];
            if (myArray[j] >= 0) {
                countPozitivNumbers++;
            }
            System.out.print(myArray[j]);
            if (j < (arrayLong - 1))
                System.out.print(", ");
            else
                System.out.print("}\n");
        }

        System.out.print("Сумма элементов массива = " + sumAll + "\n");
        System.out.print("Количество положительных элементов массива  = " + countPozitivNumbers + "\n");

        int iteration = (arrayLong - 1), buffer;
        for (int y = iteration; y > 0; y--) {
            for (int x = 0; x < y; x++) {
                if (myArray[x] > myArray[x + 1]) {
                    buffer = myArray[x];
                    myArray[x] = myArray[x + 1];
                    myArray[x + 1] = buffer;
                }
            }
        }
        System.out.print("Отсортированный myArray = {");
        for (int j = 0; j < arrayLong; j++) {
            System.out.print(myArray[j]);
            if (j < (arrayLong-1))
                System.out.print(", ");
            else
                System.out.print("}\n");
        }

    }
}
