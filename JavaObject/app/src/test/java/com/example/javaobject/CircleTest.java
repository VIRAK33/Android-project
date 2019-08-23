package com.example.javaobject;

import org.junit.Test;

public class CircleTest {
    @Test
    public void testNegativeRadius(){
        Circle c1;//c1 is null ==> not usable
        Circle c2 = new Circle();// ==> radius=1
        Circle c3 = new Circle(new Point(2,5), -100);
        System.out.println("radius="+c3.getRadius());
        c3.setRadius(-20);
        System.out.println("radius="+c3.getRadius());
        Circle c4 = new Circle(new Point(5,10),10);
        System.out.println("c4 radius="+c4.getRadius());
    }

    @Test
    public void testNullCenter(){
        Circle c = new Circle(null, 5);
        System.out.println("center x: "+c.getCenter().getX());
    }
}
