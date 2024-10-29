package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class StudentEx3 {
    private String name;
    private LocalDate dob;
    private ArrayList<CompletedCourseEx3> courses = new ArrayList<>();

    public StudentEx3(String name, LocalDate dob){
        this.name = name;
        this.dob = dob;
    }

    public void addCourse(CompletedCourseEx3 course){
        this.courses.add(course);
    }
    public void removeCourse(CompletedCourseEx3 course){
        this.courses.remove(course);
    }
    public int getStudentAge(){
        return LocalDate.now().getYear() - this.dob.getYear();
    }
    public ArrayList<CompletedCourseEx3> getCompletedCourses(){
        return this.courses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }
}
