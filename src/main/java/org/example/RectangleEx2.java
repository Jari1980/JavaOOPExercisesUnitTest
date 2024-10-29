package org.example;

import java.util.Objects;

public class RectangleEx2 extends ShapeEx2 {
    private double sideOne;
    private double sideTwo;


    //Using Double instead of double in constructur just to be able to test null in unit test, else this should be double
    public RectangleEx2(Double sideOne, Double sideTwo){
        this.sideOne = Objects.requireNonNull(Math.abs(sideOne), "No null allowed");
        this.sideTwo = Objects.requireNonNull(Math.abs(sideTwo), "No null allowed");
    }

    @Override
    double area(){
        return sideOne * sideTwo;
    }
}
