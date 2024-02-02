package com.example.syntax_terror;

public class Hexagon extends Shape {
    private int sidelength;
    public Hexagon(int sidelength) {
        this.sidelength = sidelength;
    }

    public int getSidelength() {
        return sidelength;
    }

    public void setSidelength(int sidelength) {
        this.sidelength = sidelength;
    }
}
