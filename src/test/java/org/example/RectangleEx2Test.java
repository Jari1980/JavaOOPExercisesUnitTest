package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleEx2Test {
    @Test
    void rectangleTest(){
        RectangleEx2 rect = new RectangleEx2(10.0, 10.0);
        assertEquals(rect.area(), 100);
    }
    @Test
    void rectangleNullTest(){
        Assertions.assertThrowsExactly(NullPointerException.class, () -> {
            RectangleEx2 rect = new RectangleEx2(10.0, null);
        });
    }
}
