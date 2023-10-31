package MethodsHW;
/**
 * Class: ScanString
 * @author Sidibaba Simpara
 * @version 1.0
 * Course: ITEC 2140 Section 9, Fall 2023
 * Written: October 24, 2023
 * Description: Program will ask user to enter
 * in String value 
 */
import java.util.Scanner;
public class Question3 {

    private Scanner input;

    /**
     * Method name: scanning
     * @param input
     * @return the user's String value
     */
    public static String scanning(Scanner input){
        System.out.println("Enter in a String value:");
        String user = input.nextLine();
        return user;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Question3 str = new Question3();
        String scan = str.scanning(input);
        System.out.println(scan);
    }
}
