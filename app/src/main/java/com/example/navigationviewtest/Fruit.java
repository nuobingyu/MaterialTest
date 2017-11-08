package com.example.navigationviewtest;

/**
 * Created by 96274 on 2017/11/5.
 */

public class Fruit {

    private String name;

    private int imageId;

    public Fruit(String name , int imageId){
        this.name = name;
        this.imageId = imageId ;
    }

    public String getName() {
         return name;
    }

    public int getImageId() {
         return imageId;
    }
}
