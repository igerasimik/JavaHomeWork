package com.pb.dn090283lis.hw7;

import java.util.concurrent.Callable;

public class Atelier {
    public static void dressMan(Clothes[] clothes){
        for (Clothes i: clothes){
            if (i instanceof ManClothes) {
                ((ManClothes) i).dressMan();
            }

        }
    }
    public static void  dressWomen(Clothes[] clothes){
        for (Clothes i: clothes){
            if (i instanceof WomanClothes) {
                ((WomanClothes) i).dressWoman();
            }

        }

    }
    public static void main(String[] args) {
        Clothes[] allClothes = new Clothes[]{new Tshert(Size.M,1050,"Желтый"),
                new Pants(Size.L,1250,"Зеленый"),
                new Skirt(Size.S,1300,"Голубой"),
                new Tie(Size.XXXL,1850,"Серый")};
        System.out.println("\nРезузьтат вызова метода dressWomen(Clothes[] clothes):");
        dressWomen(allClothes);
        System.out.println("\nРезузьтат вызова метода dressMan(Clothes[] clothes):");
        dressMan(allClothes);
    }
}