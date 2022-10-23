/**
 * Anish Thapa Magar
 * Fishing Game (Question 3)
 */

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String userInput;
        int score = 0;

        do {

            Random random = new Random();
            int die = random.nextInt(6) + 1;

            if (die == 1) {
                System.out.println("You caught an Old Shoe!");
                score = -5;
            }

            if (die == 2) {
                System.out.println("You caught a Red Handfish!");
                score = 20;
            }

            if (die == 3) {
                System.out.println("Your fishing hook is broken!");
                score = -20;
            }

            if (die == 4) {
                System.out.println("You caught a Kissing Loach!");
                score = 40;
            }

            if (die == 5) {
                System.out.println("You caught a Plastic Bag!");
                score = -10;
            }

            if (die == 6) {
                System.out.println("You caught a Devils Hole PupFish!");
                score = 90;
            }

            Scanner obj = new Scanner(System.in);
            System.out.println("Do you want to play again?(Yes/No)");
            userInput = obj.nextLine();
        }

        while (userInput.equalsIgnoreCase("Yes"));

        System.out.println("===============================================================");
        System.out.println("Your score is: " + score);
        System.out.println("===============================================================");
        System.out.println("Thank you for playing!!!");
    }
}
