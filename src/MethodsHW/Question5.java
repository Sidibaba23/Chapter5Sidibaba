package MethodsHW;
/**
 * Class: ScannerString
 * @author Sidibaba Simpara
 * @version 1.0
 * Course: ITEC 2140 Section 9, Fall 2023
 * Written: October 24, 2023
 * Description: Program will return user's String
 * value through using instance methods
 */
import java.util.Scanner;
public class Question5 {

    /**
     * Method name: scan
     * @param input
     * @return String value from the user
     */
    public String scan(Scanner input){
        System.out.println("Enter in a String value:");
        String str = input.nextLine();
        return str;
    }

    public static void main(String[] args) {
        Question5 obj = new Question5();
        Scanner input = new Scanner(System.in);
        System.out.println(obj.scan(input));
    }

}
