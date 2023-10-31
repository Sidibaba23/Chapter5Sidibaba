package MethodsHW;

import java.util.Scanner;

/**
 * Class: MethodString
 * @author Sidibaba Simpara
 * @version 1.0
 * Course: ITEC 2140 Section 9, Fall 2023
 * Written: October 24, 2023
 * Description: This program will read a String value
 * given by the user
 */
public class MethodString {
    /**
     * Method name: User
     * @return string value from the user
     */
    public static String User(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String value: ");
        String str = input.nextLine();
        return str;
    }

    public static void main(String[] args) {
        String output = User();
        System.out.println(output);
    }
}
