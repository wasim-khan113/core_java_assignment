import java.time.DayOfWeek;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
import javax.swing.plaf.basic.BasicPasswordFieldUI;

class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. java progamme to add two numbers

        /*
         * int a=5,b=7;
         * int sum=a+b;
         * System.out.println("Sum is : "+sum);
         */

        // 2. to check number is even or odd..

        /*
         * System.out.println("Enter  number : ");
         * int n=sc.nextInt();
         * if(n%2==0){
         * System.out.println("Even number ");
         * }
         * else{
         * System.out.println("Odd Number");
         * }
         */

        // 3. Add two binary numbers...

        // 4. Add Two complex number...

        // 5. Multiply two numbers..

        /*
         * int x = 4, y = 3;
         * int mul = x * y;
         * System.out.println("Multiply is : " + mul);
         */

        // 6. to check leap year

        /*
         * System.out.println("Enter year ");
         * int year = sc.nextInt();
         * if (year % 4 == 0 && year % 100 != 0|| year%400==0) {
         * System.out.println(year + " is leap year");
         * 
         * } else {
         * System.out.println(year + " is not a leap year");
         * }
         */

        // 7. to check given character is vowel or consonent

        /*
         * System.out.println("Enter character ");
         * char day=sc.next().charAt(0);
         * switch(day){
         * case 'a' : System.out.println(day +" is vowel");
         * break;
         * case 'e': System.out.println(day+" is vowel");
         * break;
         * case 'i': System.out.println(day +" is vowel");
         * break;
         * case 'o': System.out.println(day+" is vowel");
         * break;
         * case 'u': System.out.println(day+" is vowel");
         * break;
         * case 'A': System.out.println(day+" is vowel");
         * break;
         * case 'E': System.out.println(day+" is vowel");
         * break;
         * case 'I': System.out.println(day+" is vowel");
         * break;
         * case 'O': System.out.println(day+" is vowel");
         * break;
         * case 'U': System.out.println(day+" is vowel");
         * break;
         * default :
         * System.out.println(day+" is Consonant");
         * }
         */

        // 8. to calculate compound intrest
        /*
         * int amount =12000;
         * double roi=6;
         * // time is in years
         * double time=2;
         * double intrest;
         * intrest = amount*(Math.pow((1+roi/100),time))-amount;
         * 
         * System.out.println("Compound intrest is : "+intrest +" rupees");
         */

        // 9. program to find simple intrest

        /*
         * int amount = 12000;
         * double roi = 6, time = 2;
         * double SI = (amount * roi * time) / 100;
         * System.out.println("Simpe intrest = " + SI);
         */

        // 10. program to find quotient and remainder

        /*
         * int x=25,y=4;
         * double rem,q;
         * rem=x%y;
         * q=x/y;
         * System.out.println("Quotient is = "+q);
         * System.out.println("Remainder is = "+rem);
         */

        // Java Program to calculate power of a number

        int base = 3,temp=1;
        for (int p = 4; p > 0; p--) {
            temp = temp * base;
            System.out.print(base+"*");

        }System.out.println("= "+temp);

        // with Math.pow function...
int power=4;
        double value=Math.pow(base,power );
        System.out.println(value);
    }
}