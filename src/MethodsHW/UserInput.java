package MethodsHW;
import java.util.Scanner;
/**
 * Class: UserInput
 * @author Sidibaba Simpara
 * @version 1.0
 * Course: ITEC 2140 Section 9, Fall 2023
 * Written: October 24, 2023
 * Description: method will take user input through String value
 */
public class UserInput {

    /**
     * Method name: getString
     * @return String value
     */
    public static String getString(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String value: ");
        String user = input.nextLine();
        return user;
    }

    public static void main(String[] args) {
        System.out.println(getString());
    }
}
