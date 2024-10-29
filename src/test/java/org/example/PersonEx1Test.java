package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PersonEx1Test {

    @Test
    void personTest(){
        PersonEx1 person = new PersonEx1("Jari", 100);
        String actualName = person.getName();
        int actualAge = person.getAge();
        assertEquals(person.getInfo(), "name: " + actualName + " age: " + actualAge);
    }


}
