import java.util.Scanner;
import java.util.Arrays;

public class Test3Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 20. Java Program to Calculate average of numbers using Array

        /*
         * System.out.println("Enter Size of array");
         * int size = sc.nextInt();
         * int arr[] = new int[size];
         * double sum = 0;
         * 
         * System.out.println("Enter array elements");
         * for (int i = 0; i < size; i++) {
         * arr[i] = sc.nextInt();
         * }
         * System.out.print("The Array is : ");
         * for (int a : arr) {
         * sum = sum + a;
         * System.out.print(a + ", ");
         * 
         * }
         * System.out.println();
         * System.out.println("Average of array is = " + sum / size);
         */

        // 21. Java Program to Add the elements of an Array

        /*
         * int arr[]={2,5,6,12,4};
         * int sum=0;
         * for(int a:arr){
         * sum=sum+a;
         * System.out.print(a+"+");
         * }System.out.println(" ="+sum);
         */

        // 22. java program to reverse an array

        /*
         * int arr[]={2,5,6,12,4};
         * System.out.print("reverse array is = ");
         * for(int i=arr.length-1;i>=0;i--){
         * System.out.print(arr[i]+",");
         * }
         */

        // 23. java program to sort an array in ascending order

        /*
         * int[] arr = { 22, 1, 6, 12, 4 };
         * int temp = 0;
         * for (int i = 0; i < arr.length; i++) {
         * for (int j = i + 1; j < arr.length; j++) {
         * if (arr[i] > arr[j]) {
         * temp = arr[i];
         * arr[i] = arr[j];
         * arr[j] = temp;
         * }
         * }
         * 
         * }
         * System.out.print("Sorted array is : ");
         * for (int a : arr) {
         * System.out.print(a + ",");
         * }
         */

        // 24. Java Program to convert char Array to String

        /*
         * char ch[]={'h','e','l','l','o'};
         * String str="";
         * for(char c:ch){
         * str=str+c;
         * }System.out.println(str);
         */

        // 25. Java Program to Add Two Matrix Using Multi-dimensional Arrays

       /*  int arr[][] = { { 1, 1, 1 }, { 1, 2, 3 }, { 4, 5, 3 } };
        int brr[][] = { { 2, 2, 2, }, { 1, 1, 1 }, { 2, 3, 2 } };
        int crr[][] = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                crr[i][j] = arr[i][j] + brr[i][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(crr[i][j] + " ");
            }
            System.out.println();
        }
 */
    }
}
