package MethodsHW;
/**
 * Class: GameScores
 * @author Sidibaba Simpara
 * @version 1.0
 * Course: ITEC 2140 Section 9, Fall 2023
 * Written: October 24, 2023
 * Description:
 */
import java.util.Scanner;
public class GameScores {

    private Scanner input = new Scanner(System.in);

    /**
     * Method: GetHighScore
     * @return integer value from user
     */
    public int GetHighScore(){
        int score;
        System.out.println("Enter the score:");
        score = input.nextInt();
        input.nextLine();
        return score;
    }
    /**
     * Method: GetName
     * @return string value from user
     */
    public String GetName(){
        String name;
        System.out.println("Enter the name:");
        name = input.nextLine();
        return name;
    }

    /**
     * Method: printScore
     * @param name
     * @param score
     * print out the name and score
     */
    public void printScore(String name,int score){
        System.out.println("name: " + name + " score: "+ score);
    }


    public static void main(String[] args) {
        GameScores gs = new GameScores();
        String gName ;
        int hScore = 0;
        while(true){
            gName = gs.GetName();
            if(gName.equals(""))
                break;
            hScore = gs.GetHighScore();
            gs.printScore(gName,hScore);
        }
    }
}
