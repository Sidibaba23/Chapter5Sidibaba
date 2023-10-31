package MethodsHW;
/**
 * Class: IsPalindrome
 * @author Sidibaba Simpara
 * @version 1.0
 * Course: ITEC 2140 Section 9, Fall 2023
 * Written: October 24, 2023
 * Description: Program will take String value from user,
 * and it'll return true if the value is a palindrome
 * or false if it isn't
 */

import java.util.Scanner;
public class IsPalindrome {

    private Scanner input;

    /**
     * Method: palindrome
     * @return string value from user
     */
    public String palindrome(){
        System.out.println("Enter a string value:");
        String str = input.nextLine();
        return str;
    }

    /**
     * Method: isPal
     * @param str the string value from first method
     * @return true or false based on the string value
     */
    public boolean isPal(String str){
        boolean isPalindrome = true;
        int fIndex = 0;
        int lIndex = str.length() - 1;

        while(fIndex < lIndex){
            if(str.charAt(fIndex) != str.charAt(lIndex)){
                isPalindrome = false;
                break;
            }
            fIndex++;
            lIndex--;
        }
        return isPalindrome;
    }

    /**
     * Method: printPal
     * @param isPalindrome
     * @param str
     * return: print statement based on the boolean value
     */
    public void printPal(boolean isPalindrome, String str){
        if(isPalindrome){
            System.out.println(str + " is a palindrome");
        }
        else{
            System.out.println(str + " isn't a palindrome");
        }
    }

    public static void main(String[] args) {
        IsPalindrome obj = new IsPalindrome();
        obj.input = new Scanner(System.in);
        String pal = obj.palindrome();
        boolean pal2 = obj.isPal(pal);
         obj.printPal(pal2, pal);
    }

}
