package com.example.graphics;

public class Circle extends Shape {
    private double radius;

    @Override
    public double computeArea(double radius, double x) {
        return radius * radius *Math.PI;
    }

    @Override
    public double computeCirumference(double x, double y) {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public Circle(double x, double y,double radius) {
        super(x, y);
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
