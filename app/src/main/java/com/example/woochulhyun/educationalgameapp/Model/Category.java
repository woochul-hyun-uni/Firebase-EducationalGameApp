package com.example.woochulhyun.educationalgameapp.Model;

/**
 * Created by WOOCHUL HYUN on 2018-01-10.
 */

public class Category {

    private String Name;
    private String Image;

    public Category() {
    }

    public Category(String name, String image) {
        Name = name;
        Image = image;

    }

    public String getName() {
        return Name;
    }

    public void setName(String nmae) {
        Name = nmae;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}
