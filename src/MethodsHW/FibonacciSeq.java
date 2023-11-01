package MethodsHW;
/**
 * Class: FibonacciSeq
 * @author Sidibaba Simpara
 * @version 1.0
 * Course: ITEC 2140 Section 9, Fall 2023
 * Written: October 24, 2023
 * Description: method takes only integer value.
 * Depending on the user to continue printing
 */

import java.util.Scanner;
public class FibonacciSeq {
    private Scanner input;

    /**
     * Method name: Fib
     * Holds the sequence
     */
    public int Fib(){
        int Fib = (1 + 1 + 2 + 3 + 5 + 8 + 13 + 21);
        return Fib;
    }
    /**
     * Method name: printFib
     * prints the sequence
     */
    public void printFib() {
        System.out.println("The Fibonacci Sequence is: " + Fib());
    }

    public static void main(String[] args) {
        FibonacciSeq obj = new FibonacciSeq();
        obj.input = new Scanner(System.in);
        obj.printFib();
        while (obj.input.equals("yes")) {
            System.out.println("Do you want to repeat it?");
            obj.input.nextLine();
            if (obj.input.equals("no")) {
                break;
            }
            else{
                obj.printFib();
            }
        }
    }
}

