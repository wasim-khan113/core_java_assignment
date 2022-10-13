public class Test19 {
    public static void main(String[] args) {

        // 45. Java Program to Add Two Matrix Using Multi-dimensional Arrays

        /*
         * int a[][] = { { 1, 2, 3 }, { 2, 2, 2 }, { 4, 5, 6 } };
         * int b[][] = { { 1, 1, 1 }, { 1, 4, 4 }, { 3, 3, 3 } };
         * int c[][] = new int[3][3];
         * for (int i = 0; i < a.length; i++) {
         * for (int j = 0; j < a.length; j++) {
         * c[i][j] = a[i][j] + b[i][j];
         * System.out.print(c[i][j] + " ");
         * }
         * System.out.println();
         * }
         */

        // 46. Java Program to Multiply Two Matrix Using Multi-dimensional Arrays

        /*
         * int a[][] = { { 1, 2, 3 }, { 2, 2, 2 }, { 4, 5, 6 } };
         * int b[][] = { { 1, 1, 1 }, { 1, 4, 4 }, { 3, 3, 3 } };
         * int c[][] = new int[3][3];
         * for (int i = 0; i < a.length; i++) {
         * for (int j = 0; j < a.length; j++) {
         * c[i][j] = a[i][j] * b[i][j];
         * System.out.print(c[i][j] + " ");
         * }
         * System.out.println();
         * }
         */

        // 47. Java Program to Multiply two Matrices by Passing Matrix to a Function
        // 48. Java Program to Find Transpose of a Matrix
        // 49. Java Program to Find the Frequency of Character in a String

        // 50. Java Program to Count the Number of Vowels and Consonants in a Sentence

        /*
         * String str = "this is java tutorial";
         * int temp = 0, count = 0;
         * for (int i = 0; i < str.length(); i++) {
         * if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
         * str.charAt(i) == 'o'
         * || str.charAt(i) == 'u') {
         * temp++;
         * } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
         * count++;
         * }
         * 
         * }
         * System.out.println("Number of vowel = " + temp);
         * System.out.println("Number of consonent = " + count);
         */

        // 51. Java Program to Sort Elements in Lexicographical Order (Dictionary Order)

        // 52. Java Program to Add Two Complex Numbers by Passing Class to a Function
        // 53. Java Program to Calculate Difference Between Two Time Periods
        // 54. Java Code To Create Pyramid and Pattern
        /*
         * for (int i = 1; i <= 5; i++) {
         * for (int j = 5; j > i; j--) {
         * System.out.print(" ");
         * 
         * }
         * for (int k = 2; k <= i; k++) {
         * System.out.print("*");
         * }
         * for (int x = 1; x <= i; x++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        /*
         * for (int i = 1; i <= 5; i++) {
         * for (int j = 5; j >= i; j--) {
         * System.out.print(" ");
         * }
         * for (int k = 1; k <= i; k++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         * for (int i = 5; i >= 1; i--) {
         * for (int j = 5; j >= i; j--) {
         * System.out.print(" ");
         * }
         * for (int k = 1; k <= i; k++) {
         * System.out.print("*");
         * }
         * System.out.println("");
         * }
         */

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.err.println();
        }
        
        // 55. Java Program to Remove All Whitespaces from a String

        /*
         * String str = "this is it";
         * String newString = str.replaceAll(" ", "");
         * System.out.println(newString);
         */

        // 56. Java Program to Print an Array

        /*
         * int arr[]={12,23,21,2,9};
         * for(int a:arr){
         * System.out.print(a+", ");
         * }
         */
    }
}
