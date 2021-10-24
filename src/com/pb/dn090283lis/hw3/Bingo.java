package com.pb.dn090283lis.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randNum = new Random();
        int num = randNum.nextInt(101);
        System.out.println(num);
        int count = 0;
        while (true){
            count++;
        System.out.print("Введите число: ");
        int myNumber = scanner.nextInt();
        if (num == myNumber) {
            System.out.print("Вы угадали c " + count + "й попытки!");
            break;
        } else {
            System.out.println("Вы не угадали!");
        }
            if (myNumber > num) {
                System.out.println("Загаданое число меньше!");
            }
            else {
                System.out.println("Загаданое число больше!");
            }
            if (count>2) {
                System.out.println("Продолжаем игру, введите 1. Заканчиваем игру введите 0");
                if (scanner.nextInt()==1) {
                    System.out.println("Ок");
                    }
                else{
                    System.out.println("Спасибо, игра окончена!");
                    break;
                }

            }
        }

        }

    }




