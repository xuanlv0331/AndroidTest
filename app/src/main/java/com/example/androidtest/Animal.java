package com.example.androidtest;

public class Animal {
    private String name;
    private String speak;
    private int icon;

    public Animal(){

    }

    public Animal(String name, String speak, int icon){
        this.name = name;
        this.speak = speak;
        this.icon = icon;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSpeak(String speak){
        this.speak = speak;
    }

    public String getSpeak(){
        return speak;
    }

    public void setIcon(int icon){
        this.icon = icon;
    }

    public int getIcon(){
        return icon;
    }

}
