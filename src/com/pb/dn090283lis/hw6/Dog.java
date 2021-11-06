package com.pb.dn090283lis.hw6;

import java.util.Objects;

public class Dog extends Animal{
        private String name;
        private String food;
        private String location;
        private String feature;
        private int ageAnimal;
        private final String NOISE = "гавкает";

    public  Dog(String name, String food, String location, String feature, int ageAnimal) {
        this.name = name;
        this.food = food;
        this.location = location;
        this.feature = feature;
        this.ageAnimal = ageAnimal;
        setFood("корм Josera");
        setLocation("вольер");

    }
    @Override
    public void makeNoise() {
        System.out.println("Собака  " + getName() + " " + NOISE);
    }
    @Override
    public void eat() {
        System.out.println("Собака "+ getName()+ " ест " + getFood());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return (ageAnimal == dog.ageAnimal &&
                Objects.equals(name, dog.getName()) &&
                Objects.equals(food, dog.getFood()) &&
                Objects.equals(location, dog.getLocation()) &&
                Objects.equals(feature, dog.getFeature()) &&
                Objects.equals(NOISE, dog.getNOISE()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, food, location, feature, ageAnimal, NOISE);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getFood() {
        return food;
    }

    @Override
    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public int getAgeAnimal() {
        return ageAnimal;
    }

    public void setAgeAnimal(int ageAnimal) {
        this.ageAnimal = ageAnimal;
    }

    public String getNOISE() {
        return NOISE;
    }

    @Override
    public String toString() {
        return "Собака ";
    }
}


