public class Test12Other3 {
    // Java Program to find Area of Geometric figures using method overloading

    public void area(int length, int breadth) {
        float areaOfRectangle = length * breadth;
        System.out.println("Area of rectangle is = " + areaOfRectangle);
    }

    public void area(int side) {
        float areaOfSquare = side * side;
        System.out.println("Area of Square = " + areaOfSquare);
    }

    public static void main(String[] args) {
        Test12Other3 obj = new Test12Other3();
        obj.area(3, 5);
        obj.area(6);
    }
}
