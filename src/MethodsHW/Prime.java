package MethodsHW;
/**
 * Class: IsPrime
 * @author Sidibaba Simpara
 * @version 1.0
 * Course: ITEC 2140 Section 9, Fall 2023
 * Written: October 24, 2023
 * Description: Program will take integer value
 * from user and return true if the value is a
 * prime or false if it's not
 */
import java.util.Scanner;
public class Prime {

    private Scanner input;

    private int value;

    /**
     * Method name: isPrime
     * @return the int value
     */
    public boolean isPrime(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter in a integer value:");
        value = input.nextInt();

        boolean number = true;

        if(value <= 1){
            number = false;
        }
        else{
            for(int i = 2; i < value; i++){
                if(value % i == 0){
                    number = false;
                    break;
                }
            }
        }
        return number;
    }

    /**
     * Method name: printPrime
     * @param number
     * Print out a statement depending on if the boolean expression is true or false
     */
    public void printPrime(boolean number){
        if(number == true){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a  prime number");
        }    }

    public static void main(String[] args){
        Prime obj = new Prime();
        obj.input = new Scanner(System.in);
        boolean pn = obj.isPrime();
        obj.printPrime(pn);
    }

}
