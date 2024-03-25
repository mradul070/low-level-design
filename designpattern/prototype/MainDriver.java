package designpattern.prototype;

public class MainDriver {
    public static void main(String[] args) {
        Person person = new Person("mradul", 21);

        Person p1 = person.clone();
        Person p2 = person.clone();

        p1.setAge(23);
        p2.setName("raj");
        person.display();
        p2.display();
        p1.display();
    }
}
