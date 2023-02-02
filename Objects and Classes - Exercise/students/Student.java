package students;

import jdk.dynalink.beans.StaticClass;

public class Student{
    // полета -> характеристики -> Име, Фамилия, Оценка
    private String name;
    private String lastName;
    private double grade;

    // Конструктор -> Обекти от този клас
    public Student(String name,String lastName, double grade) {
        // Нов обект
        this.name = name;
        this.lastName = lastName;
        this.grade = grade;
    }
    // getter

    public double getGrade() {
        return this.grade;
    }

    @Override
    public String toString() {
        //"First name: { second name }: { grade }"
        return String.format("%s %s: %.2f",this.name, this.lastName, this.grade);
    }

}
