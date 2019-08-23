package com.example.javaobject;

import android.graphics.Color;

import org.junit.Test;

public class PointGraphicTest {
    @Test
    public void testPointGraphic(){
        PointGraphic pg = new PointGraphic();
        System.out.println(pg);
        System.out.println("Distance: "+ pg.distance());

    }

}
