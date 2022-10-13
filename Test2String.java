import java.util.Arrays;

public class Test2String {
    public static void main(String[] args) {

        // 12. Java Program to Convert char to String and String to Char

        /*
         * char ch='h';
         * Character.toString(ch);
         * System.out.println(ch);
         */

        /*
         * String s="hello";
         * for(int i=0;i<s.length();i++){
         * System.out.print(s.charAt(i)+" ,");
         * }
         */

        // 13. Java Program to find duplicate characters in a String

        // 14. Java Program to check Palindrome String using Stack, Queue, For and While
        // loop

        // 15. Java Program to sort strings in alphabetical order

        /*
         * String str = "welcome java";
         * char ch[] = str.toCharArray();
         * Arrays.sort(ch);
         * System.out.println(new String(ch));
         */

        // 16. Java Program to reverse words in a String

        /*
         * String str = "welcome java";
         * String temp = " ";
         * for (int i = 0; i < str.length(); i++) {
         * temp = str.charAt(i) + temp;
         * }
         * System.out.println(temp);
         */

        // 17. Java Program to perform bubble sort on Strings

        /*
         * String str[] = { "w", "e", "l", "c", "o", "m", "e" };
         * String temp;
         * for (int i = 0; i < str.length; i++) {
         * for (int j = i + 1; j < str.length; j++) {
         * if (str[i].compareTo(str[j]) > 0) {
         * temp = str[i];
         * str[i] = str[j];
         * str[j] = temp;
         * 
         * }
         * }
         * System.out.print(str[i] + " ,");
         * }
         */

        // 18. Java program to find occurrence of a character in a String

       

        // 19. Java program to count vowels and consonants in a String

        /* String str = "this is java tutorial";
        int temp = 0, count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                temp++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                count++;
            }

        }
        System.out.println("Number of vowel = " + temp);
        System.out.println("Number of consonent = " + count);
     */

     int arr[]=new int[4];
     arr[0]=3;
     arr[1]=12;
     arr[3]=21;
     for(int a:arr){
        System.out.println(a);
     }
    }
}
