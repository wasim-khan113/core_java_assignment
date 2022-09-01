import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. Take values of length and breadth of a rectangle from user and check if it
        // is square or not.

        /*
         * System.out.println("Enter length ");
         * int l = sc.nextInt();
         * System.out.println("Enter breadth ");
         * int b = sc.nextInt();
         * if (l == b) {
         * System.out.println("it is an square ");
         * } else {
         * System.out.println("not an square");
         * }
         */

        // 2. Take two int values from user and print greatest among them.

        /*
         * System.out.println("Enter First number ");
         * int x = sc.nextInt();
         * System.out.println("Enter second number ");
         * int y = sc.nextInt();
         * if (x > y) {
         * System.out.println("the gratest number is = " + x);
         * } else {
         * System.out.println("the gratest number is = " + y);
         * }
         */

        // 3. A shop will give discount of 10% if the cost of purchased quantity is more
        // than 1000.
        // Ask user for quantity
        // Suppose, one unit will cost 100.
        // Judge and print total cost for user.

        /*
         * System.out.println("Enter quantity ");
         * int quan = sc.nextInt();
         * int cost = quan * 100;
         * if (cost > 1003) {
         * float discount = (cost * 10) / 100;
         * float totalCost = cost - discount;
         * System.out.
         * println(" Congratulation you got 10% additional discount on this purchase ");
         * System.out.println("Total Cost = " + totalCost);
         * } else {
         * System.out.println("Total cost = " + cost);
         * }
         */

        // 4. A company decided to give bonus of 5% to employee if his/her year of
        // service is more than 5 years.Ask user for their salary and year of service
        // and print the net bonus amount.

        /*
         * System.out.println("Enter annual salary of employee ");
         * int sal = sc.nextInt();
         * System.out.println("Enter year of service of employee ");
         * float ser = sc.nextFloat();
         * if (ser > 5) {
         * float bonus = (sal * 5) / 100;
         * float totalBonus = bonus * ser;
         * System.out.println("congratulation you got 5% bonus... ");
         * System.out.println("your bonus amount is : " + totalBonus);
         * } else {
         * System.out.println("Sorry you did'nt get any bonus amount");
         * }
         */

        // 5. A school has following rules for grading system:
        // a. Below 25 - F
        // b. 25 to 45 - E
        // c. 45 to 50 - D
        // d. 50 to 60 - C
        // e. 60 to 80 - B
        // f. Above 80 - A
        // Ask user to enter marks and print the corresponding grade.

        /*
         * System.out.println("enter marks ");
         * int m = sc.nextInt();
         * if (m > 80 && m <= 100) {
         * System.out.println("A");
         * } else if (m > 60 && m <= 80) {
         * System.out.println("B");
         * } else if (m > 50 && m <= 60) {
         * System.out.println("C");
         * } else if (m > 45 && m <= 50) {
         * System.out.println("D");
         * } else if (m > 25 && m <= 45) {
         * System.out.println("E");
         * } else if (m > 0 && m <= 25) {
         * System.out.println("C+");
         * } else {
         * System.out.println("Please check your input");
         * }
         */

        // 6. Take input of age of 3 people by user and determine oldest and youngest
        // among them.

        /*
         * System.out.println("Enter age of 1st person ");
         * int a = sc.nextInt();
         * System.out.println("Enter age of 2nd person ");
         * int b = sc.nextInt();
         * System.out.println("Enter age of 3rd person ");
         * int c = sc.nextInt();
         * int temp = (a > b) ? a : b;
         * int max = (temp > c) ? temp : c;
         * System.out.println("The oldest age of person is : " + max);
         */

        // 7. Write a program to print absolute vlaue of a number entered by user. E.g.-
        // INPUT: 1 OUTPUT: 1
        // INPUT: -1 OUTPUT: 1

        /*
         * System.out.println("Enter value");
         * int n=sc.nextInt();
         * System.out.println("Absolute value of "+n+" is : "+Math.abs(n));
         */

        // 8. A student will not be allowed to sit in exam if his/her attendence is less
        // than 75%.
        // Take following input from user
        // Number of classes held
        // Number of classes attended.
        // And print
        // percentage of class attended
        // Is student is allowed to sit in exam or not.

        /*
         * System.out.println("Enter number of class held");
         * int toalClass=sc.nextInt();
         * System.out.println("Enter number of class Attend");
         * int attendence=sc.nextInt();
         * float percentage=(attendence*100)/toalClass;
         * System.out.println("percentage of class attended : "+percentage);
         * if(percentage<75){
         * System.out.println("you are not allowed to sit in the exam");
         * }else{
         * System.out.println("you are allowed allowed to sit in the exam");
         * }
         */

        // 9. Modify the above question to allow student to sit if he/she has medical
        // cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print
        // accordingly.

        /*
         * System.out.println("Enter number of class held");
         * int toalClass=sc.nextInt();
         * System.out.println("Enter number of class Attend");
         * int attendence=sc.nextInt();
         * System.out.
         * println("do you have any medical condition if yes enter 'Y' if not enter 'N' "
         * );
         * char medical=sc.next().charAt(0);
         * float percentage=(attendence*100)/toalClass;
         * System.out.println("percentage of class attended : "+percentage);
         * if(percentage>75){
         * System.out.println("you are  allowed to sit in the exam");
         * }else if(percentage<75&& medical=='Y'||medical=='y'){
         * System.out.
         * println("you are  allowed to sit in the exam because of medical condition");
         * }
         * else{
         * System.out.println("you are not allowed to sit in the exam");
         * }
         */

        // 10. If
        // x = 2
        // y = 5
        // z = 0
        // then find values of the following expressions:
        // a. x == 2
        // b. x != 5
        // c. x != 5 && y >= 5
        // d. z != 0 || x == 2
        // e. !(y < 10)

        /*
         * int x = 2;
         * int y = 5;
         * int z = 0;
         * System.out.println("x==2 : "+(x==2));
         * System.out.println("x != 5 && y >= 5 : "+(x != 5 && y >= 5));
         * System.out.println("z != 0 || x == 2 : "+(z != 0 || x == 2));
         */

        // 11. Write a program to check whether an entered character is lowercase ( a to z ) or uppercase ( A to Z ).
         

        System.out.println("enter character");
        char ch = sc.next().charAt(0);
        if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is uppercase");
        } else {
            System.out.println(ch + " is lower case");
        }
    }
}
