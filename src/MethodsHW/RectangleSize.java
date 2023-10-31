package MethodsHW;
/**
 * Class: RectangleSize
 * @author Sidibaba Simpara
 * @version 1.0
 * Course: ITEC 2140 Section 9, Fall 2023
 * Written: October 24, 2023
 * Description: Program will take the height and width of the
 * rectangle, then find the area using the height & width values.
 * Also, the program will figure out if the area is greater than
 * 300 or not. Finally, the program will print
 */

import java.util.Scanner;
public class RectangleSize {

    private Scanner input;
    private double height, width;

    /**
     * Method: getHAndW
     * print out height and width from user
     */
    public void getHAndW(){
        System.out.println("Enter the height and width:");
        height = input.nextDouble();
        width = input.nextDouble();
        System.out.println("Height: " + height + "\nWidth: " + width);
    }

    /**
     * Method: CalcArea
     * @return height times width
     */
    public double CalcArea(){
        return height * width;
    }

    /**
     * Method: isLarge
     * @param area <- height * width
     * @return true or false based on the area
     */
    public boolean isLarge(double area){
        boolean big;
        if(area > 300){
            big = true;
        }
        else{
            big = false;
        }
        return big;
    }

    /**
     * Method: printSize
     * @param big <- boolean expression from the prevoius method
     * print out statement depending on boolean expression
     */
    public void printSize(boolean big){
        if(big){
            System.out.println("This is a large rectangle.");
        }
        else{
            System.out.println("This is a small rectangle.");
        }
    }

    public static void main(String[] args) {
        RectangleSize obj = new RectangleSize();
        obj.input = new Scanner(System.in);
        obj.getHAndW();
        double area = obj.CalcArea();
        boolean big = obj.isLarge(area);
        obj.printSize(big);
    }




}
