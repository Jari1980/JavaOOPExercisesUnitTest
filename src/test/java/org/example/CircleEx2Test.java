package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleEx2Test {
    @Test
    void circleTest(){
        CircleEx2 circle = new CircleEx2(1);
        double expected = Math.PI;
        assertEquals(circle.area(),expected);
    }
}
