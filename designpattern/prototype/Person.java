package designpattern.prototype;

public class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.age = age;
        this.name = name;
    }
    private Person(Person person) {
        this.age = person.age;
        this.name = person.name;
    }
    public Person clone() {
        return new Person(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
