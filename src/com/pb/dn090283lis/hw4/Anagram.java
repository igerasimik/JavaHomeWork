package com.pb.dn090283lis.hw4;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        String sAnagram1, sAnagram2;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку1: ");
        sAnagram1=in.nextLine();
        System.out.print("Введите строку2: ");
        sAnagram2=in.nextLine();
        sAnagram1 = sAnagram1.toLowerCase(); //переводим страку в нижний регистр
        sAnagram2 = sAnagram2.toLowerCase();
        sAnagram1 = sAnagram1.replaceAll("[^\\da-zа-яё]", ""); // убираем из строки все кроме букв и цифр.
        sAnagram2 =  sAnagram2.replaceAll("[^\\da-zа-яё]", "");
                char[] cAnagram1 = sAnagram1.toCharArray(); //трансформируем строку в масив символов
        char[] cAnagram2 = sAnagram2.toCharArray();
        Arrays.sort(cAnagram1);
        Arrays.sort(cAnagram2);
        if ((new String(cAnagram1)).equals(new String(cAnagram2)))
            System.out.println("Эти строки являются анаграммами");
        else
            System.out.println("Это не анаграммы");

    }
}