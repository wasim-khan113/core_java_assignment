import java.util.Random;
import java.util.Scanner;

public class Test5Number {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 30. Java Program to display first 100 prime numbers

    /*
     * System.out.print("first 100 prime numbers are = ");
     * int count = 0;
     * for (int i = 2; i > 0; i++) {
     * int temp = 0;
     * for (int j = 2; j < i; j++) {
     * if (i % j == 0) {
     * temp++;
     * }
     * }
     * if (temp == 0) {
     * System.out.print(i + ", ");
     * count++;
     * if (count == 100)
     * break;
     * }
     * }
     */

    // 31. Java Program to display prime numbers between 1 and 100 or 1 and n

    /*
     * System.out.print("prime numbers between 1-100 are = ");
     * for (int i = 2; i < 110; i++) {
     * int temp = 0;
     * for (int j = 2; j < i; j++) {
     * if (i % j == 0) {
     * temp++;
     * }
     * }
     * if (temp == 0) {
     * System.out.print(i + ", ");
     * 
     * }
     * }
     */

    // 32. Java program to break integer into digits

    /*
     * System.out.println("Enter number : ");
     * int n=sc.nextInt();
     * int r=0;
     * 
     * while(n>0){
     * r=n%10;
     * System.out.print(r+",");
     * n=n/10;
     * }
     */

    // 33. Java Program to check Prime Number

    /*
     * System.out.println("Enter number : ");
     * int n=sc.nextInt();
     * int temp=0;
     * for(int i=2;i<n;i++){
     * if(n%i==0){
     * temp++;
     * }
     * }
     * if(temp==0){
     * System.out.println(n+" is prime number ");
     * }else{
     * System.out.println(n+" is not a prime number ");
     * }
     */

    // 34. Java Program to check if a given number is perfect square

    /*
     * System.out.println("Enter number ");
     * int n = sc.nextInt();
     * int temp=0;
     * for (int i = 2; i < n / 2; i++) {
     * if (n % i == 0) {
     * if (i * i == n) {
     * System.out.println(n+" is perfect square");
     * temp++;
     * }
     * }
     * }if(temp==0){
     * System.out.println(n+" is not a perfect square");
     * }
     */

    // 35. Java Program to find square root of a number without sqrt method

    /*
     * System.out.println("Enter number ");
     * int n = sc.nextInt();
     * int count=0;
     * for(int i=2;i<n/2;i++){
     * if(n%i==0){
     * if(i*i==n){
     * System.out.println("Square root of "+n+" is = "+i);
     * count++;
     * }
     * }
     * } if(count==0){
     * System.out.println(n+" is not a perfect square");
     * }
     */

    // 36. Java Program to print Armstrong numbers between a given range

    /*
     * System.out.println("Enter initial value ");
     * int n1 = sc.nextInt();
     * System.out.println("Enter Last Value ");
     * int n2 = sc.nextInt();
     * System.out.print("Armstrong numbers between "+n1+" - "+n2+" = ");
     * for (int i = n1; i < n2; i++) {
     * 
     * int r, sum = 0;
     * int temp = i;
     * while (temp > 0) {
     * r = temp % 10;
     * sum = sum + r * r * r;
     * temp = temp / 10;
     * }
     * if (i == sum) {
     * System.out.print(i+" ,");
     * }
     * }
     */

    // 37. Java Program to Find Sum of Natural Numbers

    /*
     * System.out.println("natural number upto 10");
     * for(int i=1;i<=10;i++){
     * System.out.println(i);
     * }
     */

    // 38. Java Program to check if a number is Positive or Negative

    /*
     * System.out.println("Enter number : ");
     * int n=sc.nextInt();
     * if(n<0){
     * System.out.println(n+" is negative number");
     * }else{
     * System.out.println(n+ " is positive number");
     * }
     */

    // 39. Java Program to generate Random Number

   /*  Random random = new Random();
    System.out.println("Random number : " + random.nextInt(20)); */

    // 40. Java Program to check Armstrong number

    /*
     * int x = 153, r = 0, sum = 0;
     * int temp = x;
     * while (x > 0) {
     * r = x % 10;
     * sum = sum + r * r * r;
     * x = x / 10;
     * }
     * if (sum == temp) {
     * System.out.println(temp + " is palindrom");
     * 
     * } else {
     * System.out.println(temp + " is not palindrom");
     * }
     */

    // 41. Java Program to find GCD of two numbers

    // 42. Java Program to find Largest of three numbers

    /* int a = 12, b = 2, c = 24;
    if (a > b && a > c) {
      System.out.println(a + " is greatest");
    } else if (b > a && b > c) {
      System.out.println(b + " is greatest");
    } else if (c > a && c > b) {
      System.out.println(c + " is greatest");
    } */


  
  }
}
