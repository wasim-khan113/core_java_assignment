import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 16. Java Program to Generate Multiplication Table

        /*
         * System.out.println("Enter number for table");
         * int n = sc.nextInt();
         * int t;
         * for (int i = 1; i < 11; i++) {
         * t = n * i;
         * System.out.println(n + "*" + i + "= " + t);
         * }
         */

        // 17. Java Program to Display Fibonacci Series

        /*
         * int a = 0, b = 1, s = 0, temp;
         * for (int i = 1; i < 9; i++) {
         * s = a + b;
         * System.out.print(a + "+");
         * a = b;
         * b = s;
         * }
         */

        // 18. Java Program to Find GCD of two Numbers
        // 19. Java Program to Find LCM of two Numbers
        // 20. Java Program to Display Alphabets (A to Z) using loop

        /*
         * char ch='A';
         * for(int i=0;i<26;i++){
         * System.out.print(ch+" ,");
         * ch++;
         * }
         */

        // 21. Java Program to Count Number of Digits in an Integer

        /*
         * System.out.println("enter number");
         * int n=sc.nextInt();
         * int r,count=0,t=n;
         * while(n>0){
         * r=n%10;
         * count++;
         * n=n/10;
         * }System.out.println("digits in "+t+" are = "+count);
         */

        // 22. Java Program to Reverse a Number

        /*
         * System.out.println("enter number");
         * int n = sc.nextInt();
         * int r, count = 0, t = n, sum = 0;
         * while (n > 0) {
         * r = n % 10;
         * sum = sum * 10 + r;
         * count++;
         * n = n / 10;
         * }
         * System.out.println("Reverse of " + t + " is = " + sum);
         */

        // 23. Java Program to Calculate the Power of a Number
        // 24. Java Program to Check Palindrome

        /*
         * System.out.println("enter number");
         * int n = sc.nextInt();
         * int r, count = 0, t = n, sum = 0;
         * while (n > 0) {
         * r = n % 10;
         * sum = sum * 10 + r;
         * count++;
         * n = n / 10;
         * }
         * System.out.println("Reverse of " + t + " is = " + sum);
         * if (t == sum) {
         * System.out.println(t + " is a palindrome");
         * } else {
         * System.out.println(t + " is not a palindrome");
         * }
         */

        // 25. Java Program to Check Whether a Number is Prime or Not

        /*
         * System.out.println("Enter number ");
         * int n = sc.nextInt();
         * int t = 0;
         * for (int i = 2; i < n; i++) {
         * if (n % i == 0) {
         * t++;
         * 
         * }if(t==0){
         * System.out.println(n+" is prime number");
         * }else{
         * System.out.println(n+" is not a prime number");
         * }
         * }
         */

        // 26. Java Program to Display Prime Numbers Between Two Intervals

        /*
         * System.out.println("enter starting point");
         * int n=sc.nextInt();
         * System.out.println("Enter limit ");
         * int m = sc.nextInt();
         * System.out.println("Prime numbers between "+n+"- "+m);
         * for (int i = n; i < m; i++) {
         * int count = 0;
         * for (int j = 2; j < i; j++) {
         * if (i % j == 0) {
         * count++;
         * }
         * }
         * if (count == 0) {
         * System.out.print(i+", ");
         * }
         * }
         */

        // 27. Java Program to Check Armstrong Number

        /*
         * int x = 153, r = 0, sum = 0;
         * int temp = x;
         * while (x > 0) {
         * r = x % 10;
         * sum = sum + r * r * r;
         * x = x / 10;
         * }
         * if (sum == temp) {
         * System.out.println(temp + " is Armstrong");
         * 
         * } else {
         * System.out.println(temp + " is not Armstrong");
         * }
         */


        // 28. Java Program to Display Armstrong Number Between Two Intervals

        
    }
}
