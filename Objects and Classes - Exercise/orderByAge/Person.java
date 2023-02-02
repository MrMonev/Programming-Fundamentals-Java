package orderByAge;

public class Person {
    // Полета -> характеристики - Name, ID Age
    private String name;
    private String id;
    private int age;

    // Конструктор  -> създавам обекти от моя клас


    public Person(String name, String id, int age) {
        // Нов празен обект ( name = null), (ID = null), (Age = null)
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        // {name} with ID: {id} is {age} years old.
        return String.format("%s with ID: %s is %d years old.", this.name, this.id, this.age);
    }
}