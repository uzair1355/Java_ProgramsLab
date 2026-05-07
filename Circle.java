class Cir {

    double rad;

    // parameterized constructor
    Cir(double r) {
        rad = r;
    }

    double area() {

        return (Math.PI * rad * rad);
    }

    void compare(double area2) {

        if (area() <= area2) {
            System.out.println("fits");
        } else {
            System.out.println("Does not fit");
        }
    }
}

public class Circle {

    public static void main(String[] args) {

        Cir c1 = new Cir(10);
        Cir c2 = new Cir(5);

        c2.compare(c1.area());
    }
}