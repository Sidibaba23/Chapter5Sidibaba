package MethodsHW;

import java.util.Scanner;

/**
 * Class: ReverseString
 * @author Sidibaba Simpara
 * @version 1.0
 * Course: ITEC 2140 Section 9, Fall 2023
 * Written: October 24, 2023
 * Description: Program will take String value from user
 * and reverse the value
 */
public class ReverseString {
    private Scanner input;
    private String value;

    /**
     * Method name: reverse
     * @return string value from the user
     * and its reverse version
     */
    public String reverse(){
        System.out.println("Enter in a String value:");
        value = input.nextLine();
        String str = "";

        for (int i = value.length() - 1; i > 0; i--) {
            str += value.charAt(i);
        }
        return value;
    }

    /**
     * Method name: printRe
     * print out a statement
     */
    public void printRe(){
        System.out.println("The reversed value is: " + value);
    }


    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        obj.input = new Scanner(System.in);
        obj.reverse();
        obj.printRe();

    }
}
