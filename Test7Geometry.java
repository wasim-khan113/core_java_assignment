public class Test7Geometry {
    public static void main(String[] args) {

        // 54. Java Program to read number from Standard Input
        // 55. Java Program to Get IP Address
        // 56. Java Program to get Input From User

        // 57. Java Program to Calculate Area of Rectangle

        float length = 3f, breadth = 8f, area;
        area = length * breadth;
        System.out.println("Area of Rectangle is = " + area);

        // 58. Java Program to Calculate Area of Square

        int side = 12;
        System.out.println("Area of Square = " + side * side);

        // 59. Java Program to Calculate the area of Triangle

        float base = 6f, height = 3f, areaOfTriangle;
        areaOfTriangle = (base * height) / 2;
        System.out.println("Area of triangle = " + areaOfTriangle);

        // 60. Java Program to Calculate Area and Circumference of Circle

        float radius = 5f;
        double areaOfCircle = (Math.PI) * radius * radius;

        double circumference = 2 * (Math.PI) * radius;
        System.out.println("Area of circle is = " + areaOfCircle);
        System.out.println("circumference of circle is = " + circumference);
    }
}
