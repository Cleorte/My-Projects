/**
 * Anish Thapa magar
 * Java Class Assignment
 * Question 1 and 2
 */

import java.util.Random;

public class App {

    public static void main(String[] args) throws Exception {

        //Part 1
        Coin coin = new Coin();
        System.out.println("The side inittially facing up is: " + coin.getSideUp());
        System.out.println("Starting the coin toss for 20 times...");
        System.out.println("--------------------------------------------------------");

        int headsCounter = 0, tailsCounter = 0;
        for (int i = 0; i <= 19; i++) {
            coin.toss();
            if (coin.sideUp == "Heads") {
                headsCounter++;
            } else {
                tailsCounter++;
            }

        }

        System.out.println("No. of Heads = " + headsCounter);
        System.out.println("No. of Tails = " + tailsCounter);
        System.out.println("--------------------------------------------------------");
        
        //Part 2
        double balance = 0.0, nickel = 0.5, dime = 0.10, quarter = 0.25, limit = 1.00;
        Coin Nickel = new Coin();
        Coin Dime = new Coin();
        Coin Quarter = new Coin();

        while(balance<limit){
            Nickel.toss();
            if(Nickel.getSideUp().equals("Heads")){
                balance = balance + nickel;
            }

            Dime.toss();
            if(Dime.getSideUp().equals("Heads")){
                balance = balance + dime;
            }

            Quarter.toss();
            if(Quarter.getSideUp().equals("Heads")){
                balance = balance + quarter;
            }
        }
        
        System.out.println("Your score is: " + balance);

        if (balance == 1.0) {
            System.out.println("You Win!!!");
        }

        if (balance > 1.0){
            System.out.println("You Lose!!!");
        }

    }

    public static class Coin {
        private String sideUp;

        public Coin() {
            toss();
        }

        public void toss() {
            Random random = new Random();
            int num = random.nextInt(2);
            if (num == 0) {
                this.sideUp = "Heads";
            } else {
                this.sideUp = "Tails";
            }
        }

        public String getSideUp() {
            return sideUp;
        }

    }
}
