package com.example.eran.my_1_class;

//This class is for Shape representation//
public class Mshape {
    private int size;
    private int color;

    public void draw() {
        //ציור של הצורה
    }

    public Mshape() {              //קונסטרקטור//
        size = 0;
        color = 100;
    }

    public Mshape(int x, int y) {
        this.size = x;
        this.color = y;
    }

    //this constractor sets the size//
    public Mshape(int s) {
        size = s;
        this.color = 000;
    }

    public void setColor(int color) {
        if (color > 5000)
            this.color = color;
        else
            this.color = 000;
    }
    public int getColor(){
        return color;
    }

}


// Shape Circle= new Circle();
//Shape Rectangle= new shape();
