package com.pb.dn090283lis.hw6;


    public class VetСlinic {
        public static void main(String [] args) throws Exception{
            Animal[] allAnimals = new Animal[3];
            Cat Cat = new Cat("Пушистик", "Felix", "Домашний", "Любит лазить", 2);
            Dog Dog = new Dog("Барон", "Мясные консервы", "Вольер", "Игривый", 4);
            Horse Horse = new Horse("Тарзан", "Сено, овес", "Конюшня", "Любит бегать", 7);
            allAnimals[0] = Cat;
            allAnimals[1] = Dog;
            allAnimals[2] = Horse;

            System.out.println("Животные в клинике:");
            for (int i = 0; i< allAnimals.length; i++){
                if (allAnimals[i] instanceof Cat) {
                    System.out.println(((Cat) allAnimals[i]).toString());
                }
                if (allAnimals[i] instanceof Dog) {
                    System.out.println(((Dog) allAnimals[i]).toString());
                }
                if (allAnimals[i] instanceof Horse) {
                    System.out.println(((Horse) allAnimals[i]).toString());
                }
            }

            System.out.println("\nДля Кота:");
            Cat.makeNoise();
            Cat.eat();
            System.out.println("\nДля Собаки:");
            Dog.makeNoise();
            Dog.eat();
            System.out.println("\nДля Коня:");
            Horse.makeNoise();
            Horse.eat();

            System.out.print("\nОбращение к ветеринару");
            Class clazz = Class.forName("com.pb.dn090283lis.hw6.Veterinarian");
            Object obg = clazz.newInstance();
            if (obg instanceof Veterinarian) {
                ((Veterinarian) obg).treatAnimal(allAnimals[0]);
            }

        }
    }