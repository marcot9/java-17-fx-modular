package com.example.graphics;

abstract class Shape {
    private double x;
    private double y;

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public abstract double computeArea(double x, double y);
    public abstract double computeCirumference(double x, double y);

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


}
