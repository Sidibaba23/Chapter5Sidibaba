package MethodsHW;
/**
 * Class: GetAddress
 * @author Sidibaba Simpara
 * @version 1.0
 * Course: ITEC 2140 Section 9, Fall 2023
 * Written: October 24, 2023
 * Description: Program will take name and address through the
 * nameAddress() method. Also, have city and state from the user pass
 * through cityState() method. It'll print through main method
 */
import java.util.Scanner;
public class GetAddress {

    /**
     * Method name: nameAddress
     * @return the name and the address from the user
     */
    public String nameAddress(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter in your name:");
        String name = input.nextLine();
        System.out.println("Enter in your address:");
        String address = input.nextLine();
        return name + address;
    }

    /**
     * Method name: cityState
     * @return the state and city from the user
     */
    public String cityState(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter in your city:");
        String city = input.nextLine();
        System.out.println("Enter in your state:");
        String state = input.nextLine();
        return city + state;
    }

    public static void main(String[] args){
        GetAddress obj = new GetAddress();
       String str = obj.nameAddress();
        String str1 = obj.cityState();
        System.out.println(str + str1);
    }








}
