package com.pb.dn090283lis.hw7;

public class Tshert extends Clothes implements ManClothes, WomanClothes{
    Tshert (Size size, float prs, String col){
        super(size, prs, col);
    }
    @Override
    public void dressMan(){
        System.out.println(getClass().getSimpleName() + "   размер  " + clothesSize.getEuroSize() + "   Цена  " + price + "   цвет  " + color);
    }
    @Override
    public void dressWoman(){
        System.out.println(getClass().getSimpleName() + "   размер  " + clothesSize.getEuroSize() + "   Цена  " + price + "   цвет  " + color);
    }
}

