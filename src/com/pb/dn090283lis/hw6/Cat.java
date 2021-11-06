package com.pb.dn090283lis.hw6;

import java.util.Objects;

public class Cat extends Animal{
    private String name;
    private String food;
    private String location;
    private String feature;
    private int ageAnimal;
    private final String NOISE = "мяукает";

    public  Cat(String name, String food, String location, String feature, int ageAnimal) {
        this.name = name;
        this.food = food;
        this.location = location;
        this.feature = feature;
        this.ageAnimal = ageAnimal;
        setFood(" корм Felix ");
        setLocation("просторную клетку, нужен домик для лазанья ");

    }
    @Override
    public void makeNoise() {
        System.out.println(" Кот " + getName() + " " + NOISE);
    }
    @Override
    public void eat() {
        System.out.println(" Кот "+ getName()+ " ест " + getFood());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return (ageAnimal == cat.ageAnimal &&
                Objects.equals(name, cat.name) &&
                Objects.equals(food, cat.food) &&
                Objects.equals(location, cat.location) &&
                Objects.equals(feature, cat.feature) &&
                Objects.equals(NOISE, cat.getNOISE()));
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
        return "Кот ";
    }
}
