package assign42;

public class Employe extends Person {

    int Salary;

    public Employe(int Salary, String name, int age) {
        super(name, age);
        this.Salary = Salary;
    }

    @Override
    void Display() {
        System.out.println(
            "Name: " + name +
            ", Age: " + age +
            " and Salary: " + Salary
        );
    }
}