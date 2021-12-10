package com.example.graphics;

public class Rectangular extends Shape {

    private double width;
    private double height;
    @Override
    public double computeArea(double height, double width) {
        return height * width;
    }

    @Override
    public double computeCirumference(double x , double y) {
        height = x;
        width = y;
        return (2 * height) + (2 * width);

    }

    @Override
    public String toString() {
        return "Rectangular{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public Rectangular( double x, double y, double height, double width) {
        super (x,y);
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
