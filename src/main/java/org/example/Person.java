package org.example;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("name: ").append(name);
        sb.append(" age: ").append(age);
        return sb.toString();
    }
}
