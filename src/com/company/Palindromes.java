package com.company;
import java.util.Scanner;

/**
 * Created by Nebras on 9/25/2015.
 */
public class Palindromes {
    public static void main(String[] args) {
        //check if string is palindrome.

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = in.nextLine();
        if (isPalindrome(str)){
            System.out.println("This string is a palindrome.");
        }else{
            System.out.print("This string is not a palindrome.");
        }


    }

    public static boolean isPalindrome(String str){
        //racecar
        String temp = str;
        boolean result = true;
        int lenOfstr = str.length();
        int m = 0;
        for(int i = lenOfstr - 1; i >= 0;i--) {
            if (temp.charAt(i) == str.charAt(m)) {
                m++;
            } else {
                result = false;
                break;
            }
        }
     return result;
    }

}
