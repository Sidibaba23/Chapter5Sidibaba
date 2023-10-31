package MethodsHW;
/**
 * Class: GetUserInput
 * @author Sidibaba Simpara
 * @version 1.0
 * Course: ITEC 2140 Section 9, Fall 2023
 * Written: October 24, 2023
 * Description: method call getIntput allows the user
 * to enter a String value and returns the value.
 * It'll be printed through printString method. No
 * static methods (besides main)
 */
import java.util.Scanner;
public class GetUserInput {

    private Scanner input;


    /**
     * Method name: getString
     * @return the string value from user
     */
    public String getString(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter in the string value:");
        String value = input.nextLine();
        return value;
    }

    /**
     * Method name: printString
     * @param value
     * @return value from getString() method
     */
    public void printString(String value){
        System.out.println("String value: " + value);
    }

    public static void main(String[] args) {
        GetUserInput user = new GetUserInput();
        user.input = new Scanner(System.in);
        user.getString();
        //System.out.println(user.printString());
    }
}
