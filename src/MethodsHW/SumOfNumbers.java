package MethodsHW;
/**
 * Class: SumOfNumbers
 * @author Sidibaba Simpara
 * @version 1.0
 * Course: ITEC 2140 Section 9, Fall 2023
 * Written: October 24, 2023
 * Description: method named sum that takes two numbers
 * and returns the sum of these two numbers two integers
 * parameters and another two parameters (doubles). no static
 * methods. Main method calls on both int and double
 */
public class SumOfNumbers {
    /**
     * Method name: SumOfIntegers
     * @param n1 carries first integer value
     * @param n2 carries second integer value
     * @return n1 + n2
     */
    public int SumOfIntegers(int n1, int n2){
        return n1 + n2;
    }

    /**
     * Method name: SumOfDoubles
     * @param num1 carries first double value
     * @param num2 carries second double value
     * @return num1 + num2
     */
    public double SumOfDoubles(double num1,double num2){
        return num1 + num2;
    }
    public static void main(String[] args) {
        SumOfNumbers s = new SumOfNumbers();
        System.out.println(s.SumOfIntegers(8,7));
        System.out.println(s.SumOfDoubles(9.0,2.0));
        System.out.println(s.SumOfDoubles(9,5));
        System.out.println(s.SumOfDoubles(3,1.2));
    }
}
