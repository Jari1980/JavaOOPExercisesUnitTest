package org.example;

public class CompletedCourseEx3 {
    private String courseName;
    private int grade;

    public CompletedCourseEx3(String courseName, int grade){
        this.courseName = courseName;
        this.grade = grade;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getGrade() {
        return grade;
    }
}
