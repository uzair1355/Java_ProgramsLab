    package assign42;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void Display() {
        System.out.println("Name: " + name + " and Age: " + age);
    }
}