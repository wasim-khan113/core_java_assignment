import java.util.Scanner;

public class Test6Number2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 43. Java Program to swap two numbers using bitwise operator
        // 44. Java Program to find smallest of three numbers using ternary operator

        /*
         * int a=12,b=43,c=22;
         * int temp=(a<b)?a:b;
         * int min=(temp<c)?temp:c;
         * System.out.println("Smallest number is : "+min);
         */

        // 45. Java Program to find largest of three numbers using ternary operator

        /*
         * int a=57,b=98,c=32,temp,max;
         * temp=a>b?a:b;
         * max=temp>c?temp:c;
         * System.out.println("Largest number is : "+max);
         */

        // 46. Java Program to display alternate prime numbers
        // 47. Java Program to display even numbers from 1 to n or 1 to 100

        /*
         * System.out.println("Even numbers between 1-100");
         * for(int i=1;i<=100;i++){
         * 
         * if(i%2==0){
         * System.out.print(i+", ");
         * }
         * }
         */

        // 48. Java Program to display odd numbers from 1 to n or 1 to 100

        /*
         * System.out.println("odd numbers between 1-100");
         * for(int i=1;i<=100;i++){
         * 
         * if(i%2!=0){
         * System.out.print(i+", ");
         * }
         * }
         */

        // 49. Java Program to Find average of 3 numbers

        /*
         * System.out.println("Enter values of a , b, c respectively ");
         * int a = sc.nextInt();
         * int b = sc.nextInt();
         * int c = sc.nextInt();
         * float sum = a + b + c;
         * System.out.println("average of " + a + "," + b + "," + c + " is = " + sum /
         * 3);
         */

        // 50. Java Program to Find HCF and LCM of Two Numbers
        // 51. Peterson Number in Java

        /*
         * System.out.println("Enter number : ");
         * int n = sc.nextInt();
         * int temp = n;
         * int r, sum = 0;
         * while (n > 0) {
         * int f = 1;
         * r = n % 10;
         * for (int i = 1; i <= r; i++) {
         * f = f * i;
         * 
         * }
         * sum = sum + f;
         * System.out.print(f + "+");
         * n = n / 10;
         * }
         * System.out.println("= " + sum);
         * if(temp==sum){
         * System.out.println(temp+" is a peterson number");
         * }else{
         * System.out.println(temp+" is not a peterson number");
         * }
         */

        // 52. Sunny Number in Java

        System.out.println("Enter number ");
        int num = sc.nextInt();
        int n = num + 1;
        double sq = Math.sqrt(n);
        if (sq - Math.floor(sq) == 0) {
            System.out.println(num + " is sunny number ");
        } else {
            System.out.println(n + " is not sunny number ");
        }

        // 53. Tech Number in Java

    }
}
