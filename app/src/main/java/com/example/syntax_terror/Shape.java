package com.example.syntax_terror;

public abstract class Shape {

    private int x;
    private int y;
    String color = "green";

    private String color = "Rainbow";

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
