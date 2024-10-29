package org.example;

public class CircleEx2 extends ShapeEx2 {
    private double radius;

    public CircleEx2(double radius){
        this.radius = radius;
    }

    @Override
    double area(){
        return Math.PI * Math.pow(radius,2);
    }
}
