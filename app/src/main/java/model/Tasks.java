package model;

import android.graphics.Color;


public class Tasks{

    private String description;
    private int color;


    public Tasks(String description, int color) {
        this.description = description;
        this.color = color;
    }

    public Tasks(String description) {
        this.description = description;
        this.color= Color.BLACK;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return description;
    }
}
