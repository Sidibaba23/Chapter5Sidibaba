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

    /**
     * Method name: reverse
     * @return string value from the user
     * and its reverse version
     */
    public String reverse(Scanner input){
        System.out.println("Enter in a String value:");
       String value = input.nextLine();
        String str = "";

        for (int i = value.length() - 1; i > 0; i--) {
            str += value.charAt(i);
        }
        return str;
    }

    /**
     * Method name: printRe
     * print out a statement
     */
    public void printRe(String str){
        System.out.println("The reversed value is: " + str);
    }


    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        obj.input = new Scanner(System.in);
       String str = obj.reverse(obj.input);
        obj.printRe(str);

    }
}
