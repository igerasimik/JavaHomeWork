package com.pb.dn090283lis.hw7;

public abstract class Clothes {
    public Size clothesSize;
    public float price;
    public String color;
    Clothes(Size size, float prs, String col){
        this.clothesSize = size;
        this.price = prs;
        this.color = col;
    }

}
