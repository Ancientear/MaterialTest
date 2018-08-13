package com.example.shenfan.materialtest;

public class Fruit {

    private String name;//表示水果的名字
    private int imageId;//表示水对应图片的资源id
    public Fruit(String name,int imageId){
        this.name = name;
        this.imageId = imageId;
    }

    public String getName(){
        return name;
    }

    public int getImageId(){
        return imageId;
    }
}
