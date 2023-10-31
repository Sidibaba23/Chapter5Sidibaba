package MethodsHW;
/**
 * Class: EvenNumber
 * @author Sidibaba Simpara
 * @version 1.0
 * Course: ITEC 2140 Section 9, Fall 2023
 * Written: October 24, 2023
 * Description: class will ask user to enter a number.
 * Method isEven will return true/false. It'll return from
 * isEven will go to printEven method where that will
 * print "The number is even" if number is even or "The number is odd"
 * if number is odd. isEven figures out if number is even or not
 */
import java.util.Scanner;
public class EvenNumber {
    /**
     * Method name: isEven
     * @return true if the number is an even number, or false if
     * number is not an even number
     */
    public boolean isEven(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter in an integer value:");
        int number = input.nextInt();
        boolean even = true;
        if(number % 2 == 0){
            return even;
        }
        else{
            return !even;
        }
    }

    /**
     * Method name: printEven
     * @return even or odd based on the isEven() method
     */
    public String printEven(){
        if(isEven()){
            return "The number is even";
        }
        else{
            return "The number is odd";
        }
    }

    public static void main(String[] args) {
        EvenNumber eo = new EvenNumber();
       System.out.println(eo.printEven());
    }
}
