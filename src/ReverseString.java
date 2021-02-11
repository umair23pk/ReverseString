
//using string builder

import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String str) {
        StringBuffer sb = new StringBuffer(str);
        return sb.reverse().toString();

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();


        String reverseString = reverseString(str);
        System.out.println("String after reversing : " + reverseString);


    }

}

