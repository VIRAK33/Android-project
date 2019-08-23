package com.example.javaobject;

import java.security.PrivateKey;


public class Circle {
    private Point center = new Point();
    private double radius = 1;

    public Circle() {
        this(new Point(), 1);
    }

    public Circle(Point center, double radius) {
        setCenter(center);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius > 0) {
            this.radius = radius;
        }
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        if(center != null)
            this.center = center;
    }
}


