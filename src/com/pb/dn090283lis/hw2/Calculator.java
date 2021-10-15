package com.pb.dn090283lis.hw2;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand1, operand2;
        char operation;
        System.out.print("Введите operand1: ");
        operand1 = scanner.nextInt();
        System.out.print("Введите operand2: ");
        operand2 = scanner.nextInt();
        System.out.print("Введите операцию: ");
        operation = scanner.next().charAt(0);
        switch (operation) {
            case '+':
                System.out.print("Результат = " + (operand1 + operand2));
                break;
            case '-':
                System.out.print("Результат  = " + (operand1 - operand2));
                break;
            case '*':
                System.out.print("Результат  = " + (operand1 * operand2));
                break;
            case '/': {

                if (operand2 != 0) {
                    System.out.print("Результат  = " + (operand1 / operand2));
                } else {
                    System.out.println("Делить на 0 нельзя");
                }
            }
            break;
            default:
                System.out.println("Ошибка выбора операции");

        }
    }

}