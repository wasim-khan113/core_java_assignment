public class Test11Other2 {
    // Java Program to perform Arithmetic Operation using Method Overloading

    public void operation(int a, int b, int c) {
        System.out.println("addition is : " + a + b + c);
    }

    public void operation(int a, int b) {
        System.out.println("subraction is : " + (a - b));
    }

    public void operation(long a, int b) {
        System.out.println("Multiplication is : " + (a * b));
    }

    public void operation(double a, double b) {
        System.out.println("Division is : " + (a / b));
    }

    public static void main(String[] args) {
        Test11Other2 obj = new Test11Other2();
        obj.operation(2, 5, 35);
        obj.operation(24, 8);
        obj.operation(4L, 2);
        obj.operation(78.0, 2.0);
    }
}
