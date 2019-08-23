package com.example.javaobject;

import android.graphics.Color;

import org.junit.Test;

public class PointTest {
    @Test
    public void testDistance(){
        Point p1 = new Point(0,10);
        Point p2 = new Point(2,3);
        System.out.println("dist:"
                +p2.distance(p1));

    }
    @Test
    public void testPoint(){
        System.err.print("Hello world!");
        Point p = new Point(5,10);
        /*p.setX(5); p.setY(10);*/
        System.out.printf("\nx=%.2f, y=%.2f, p is Point = "
                +(p instanceof Point), p.getX(), p.getY());
        System.out.println("\nDistance from 0,0: "+ p.distance());
        p.translate(-5,0);
        System.out.printf("\nTranslate -5,0: %.2f",p.distance());
        Color c;
    }
    @Test
    public void testEqual(){
        Point p1 = new Point(2.000009, 3.000003);
        Point p2 = new Point(2.000003, 3.000008);

        Point.setEps(1.0e-4);
        System.out.println("p1==p2? "+(p1.equals(p2)));
        System.out.println("p2==p1? "+(p2.equals(p1)));

    }
    @Test
    public void testToString(){
        Point p1 = new Point(3,1);
        System.out.println(p1);
        p1 = null;
        System.gc(); //clean unreferenced memory
    }
}
