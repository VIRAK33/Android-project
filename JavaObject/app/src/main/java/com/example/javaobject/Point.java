package com.example.javaobject;

import android.graphics.Color;

import java.util.Locale;

public class Point {
    private static double eps = 1.0e-5;
    /**
     * Move point to another location.
     *
     * @param dx delta x
     * @param dy delta y
     */
    void translate(double dx, double dy) {
        x += dx;
        y += dy;
    }

    /**
     * Calculate distance from 0,0
     *
     * @return distance calculated
     */
    public double distance() {
        double dist;
        dist = Math.sqrt(x * x + y * y);
        return dist;
    }
    public double distance(Point p){
        double dist;
        dist = Math.sqrt(
                Math.pow(x - p.x, 2)
                        + Math.pow(y - p.y,2));
        return dist;
    }

    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(){
        this(0,0);// constructor delegation
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
    public void display(){
        Object obj = new Object(){
            public String toString(){
                return  "I am working...";
            }
        };
        System.out.println("obj toString: "+obj.toString());
    }

    public static double getEps() {
        return eps;
    }

    public static void setEps(double eps) {
        Point.eps = eps;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Point){
            Point p = (Point) obj;
            double dx = Math.abs(x-p.x);
            double dy = Math.abs(y-p.y);
            return (dx < eps) && (dy < eps);
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format(Locale.forLanguageTag("khm-KHM"),"Point(x:%.2f,y:%.2f)",x,y);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Destroyed!");
        super.finalize();
    }
}
