public class Test4Recursion {

    // 26. Java Program to Reverse a number using for, while loop and recursion

    /*
     * public static void reverseNumber(int n, int temp, int r) {
     * if (n == 0) {
     * System.out.println(temp);
     * return;
     * }
     * r = n % 10;
     * temp = temp * 10 + r;
     * reverseNumber(n / 10, temp, r);
     * }
     * 
     * public static void main(String[] args) {
     * int n = 1245;
     * System.out.println(n);
     * reverseNumber(n, 0, 0);
     * 
     * }
     */

    // 27. Java Program to check Palindrome string using Recursion

    public static void palindromeString(String str, String temp, int i) {
        if (i == str.length()) {
            System.out.println(str);
            System.out.println(temp);
            if(str.equalsIgnoreCase(temp)){
                System.out.println("palindrome");
            }else{
                System.out.println("not a palindrome");
            }
            return;
        }
        temp = str.charAt(i) + temp;
        palindromeString(str, temp, i + 1);
    }

    public static void main(String[] args) {
        palindromeString("helleh", "", 0);

    }

    // 28. Java Program to Reverse a String using Recursion

    /* public static void palindromeString(String str, String temp, int i) {
        if (i == str.length()) {
            System.out.println(temp);
            return;
        }
        temp = str.charAt(i) + temp;
        palindromeString(str, temp, i + 1);
    }

    public static void main(String[] args) {
        palindromeString("welcome", "", 0);

    } */


    // 29. Java Program to find Factorial of a number using Recursion

    /*
     * public static void factorial(int n,int fact){
     * if(n==1){
     * 
     * System.out.println(n+"="+fact);
     * return;
     * }
     * 
     * fact =fact*n;
     * System.out.print(n+"*");
     * factorial(n-1,fact);
     * }
     * public static void main(String[] args) {
     * factorial(5,1);
     * }
     */

}
