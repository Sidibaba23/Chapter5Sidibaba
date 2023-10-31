package MethodsHW;
/**
 * Class: InstanceMethod
 * @author Sidibaba Simpara
 * @version 1.0
 * Course: ITEC 2140 Section 9, Fall 2023
 * Written: October 24, 2023
 * Description: The program will return String
 * from the user through using instance method
 */
import java.util.Scanner;
public class InstanceMethod {
    private Scanner input;

    /**
     * Method name: scan
     * @return the String value from the user
     */
    public String scan(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter in a String value:");
        String instance = input.nextLine();
        return instance;
    }

    public static void main(String[] args) {
        InstanceMethod obj = new InstanceMethod();
        System.out.println(obj.scan());
    }
}
