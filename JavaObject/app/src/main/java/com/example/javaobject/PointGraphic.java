package com.example.javaobject;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class PointGraphic extends Point {
    public int color = Color.BLUE;
    public PointGraphic(double x, double y){
        super(x,y);// call constructor of parent class (Point);
    }

    public PointGraphic(double x, double y, int color) {
        super(x, y);
        this.color = color;
    }

    public PointGraphic(){super();}
    public void draw(Canvas canvas){

        Paint paint = new Paint();
        paint.setColor(color);
        paint.setStrokeWidth(3);
        canvas.drawRect((float)getX(), (float)getY(), (float)getX()+300, (float)getY()+300, paint);



    }


}
