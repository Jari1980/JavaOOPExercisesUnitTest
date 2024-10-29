package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    void personTest(){
        Person person = new Person("Jari", 100);
        String actualName = person.getName();
        int actualAge = person.getAge();
        assertEquals(person.getInfo(), "name: " + actualName + " age: " + actualAge);
    }
}
