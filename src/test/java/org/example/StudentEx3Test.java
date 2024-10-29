package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentEx3Test {
    CompletedCourseEx3 course1 = new CompletedCourseEx3("Math", 10);
    CompletedCourseEx3 course2 = new CompletedCourseEx3("Washing", 1);
    StudentEx3 student = new StudentEx3("Jari", LocalDate.of(1940,8,31));

    @Test
    void studentEx3AgeTest(){
        assertEquals(student.getStudentAge(),84);
    }

    @Test
    void studentEx3AddCourseTest(){
        student.addCourse(course1);
        student.addCourse(course2);
        ArrayList<CompletedCourseEx3> testList = new ArrayList<>(Arrays.asList(course1, course2));
        assertEquals(student.getCompletedCourses(), testList);
    }

    @Test
    void studentEx3RemoveCourseTest(){
        student.addCourse(course1);
        student.addCourse(course2);
        student.removeCourse(course2);
        ArrayList<CompletedCourseEx3> testList2 = new ArrayList<>(Arrays.asList(course1));
        assertEquals(student.getCompletedCourses(), testList2);
    }
}
