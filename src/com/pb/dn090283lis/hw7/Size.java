package com.pb.dn090283lis.hw7;

public enum Size { XXS("подростковый ", 36),
                    XS("подростковый", 38),
                     S("молодежный", 40),
                    M("молодежный", 42),
                    L("взрослый", 44),
                   XXXL("очень большой", 56);

    private int euroSize;
    private String description;
    Size(String descrip, int  eSize){
        euroSize=eSize;
        description=descrip;
    }
    public String getDescription(){
        return description;
    }
    public  int getEuroSize(){
        return euroSize;
    }
}

