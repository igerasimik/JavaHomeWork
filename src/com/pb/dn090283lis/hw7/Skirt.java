package com.pb.dn090283lis.hw7;

public  class Skirt extends Clothes implements  WomanClothes{

    Skirt(Size size, float prs, String col) {
        super(size, prs, col);
    }

    @Override
    public void dressWoman() {
        System.out.println(getClass().getSimpleName() + "    размер  " + clothesSize.getEuroSize()+ "   цена  " + price + "    цвет  " + color);

    }
}