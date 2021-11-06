package com.pb.dn090283lis.hw6;

public class Veterinarian {
        void treatAnimal(Animal animal){
             if (animal instanceof  Dog){
                System.out.println("\nБольное животное - собака  " + ((Dog) animal).getName()
                        + ".\n Поместить в " + ((Dog)animal).getLocation() + ".\nПитание " + ((Dog) animal).getFood());}

            else if (animal instanceof  Cat) {
                System.out.println("\nБольное животное - кот  " + ((Cat) animal).getName()
                        + ".\n Поместить в " + ((Cat)animal).getLocation() + ".\nПитание " + ((Cat) animal).getFood());}

            else if (animal instanceof  Horse){
                System.out.println("\nБольное животное - Лошадь  " + ((Horse) animal).getName()
                        + ".\n Поместить в " + ((Horse)animal).getLocation() + ".\nПитание " + ((Horse) animal).getFood());}
            }


    }

