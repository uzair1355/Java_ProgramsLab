class Classcalculator {

    // instance variables
    private double num1;
    private double num2;
    private char operator;

    // static history array
    static double[] historyArr = new double[5];
    static int index = 0;

    // stores current result
    double result = 0;

    // parameterized constructor
    Classcalculator(double num1, double num2, char operator) {

        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    // calculate method
    void calculate() {

        switch (operator) {

            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':

                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero");
                    return;
                }

                break;

            default:
                System.out.println("Invalid Operator");
                return;
        }

        System.out.println("Result: " + result);

        // storing history
        historyArr[index % 5] = result;
        index++;
    }

    // print history method
    void printHistory() {

        System.out.println("\nCalculation History:");

        for (int i = 0; i < index && i < historyArr.length; i++) {

            System.out.println(historyArr[i]);
        }
    }

    // main method
    public static void main(String[] args) {

        Classcalculator c1 = new Classcalculator(10, 5, '+');
        c1.calculate();

       

        Classcalculator c4 = new Classcalculator(40, 8, '/');
        c4.calculate();

        // printing history
        c4.printHistory();
    }
}