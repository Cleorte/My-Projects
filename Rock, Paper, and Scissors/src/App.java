import java.util.Random;
import java.util.Scanner;

public class App {

    public static String user, comp;

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your Choice: ");
        System.out.println("===================================================================================");
        user = myObj.nextLine();
        System.out.println("===================================================================================");
        comp = computerChoice();

        while (!("Rock".equalsIgnoreCase(user) || "Paper".equalsIgnoreCase(user)
                || "Scissors".equalsIgnoreCase(user))) {
            System.out.println("Invalid Choice. Try again!");
            user = myObj.nextLine();
        }

        System.out.println("Computer's move : " + comp);
        System.out.println("Your move = " + user);
        decision();

        if ("Yes".equalsIgnoreCase(playAgain())) {
            main(null);
        } else {
            System.out.println("====== Thank you for playing RPS! =======");
            System.exit(0);
        }
    }

    // getting the choice of the computer.
    public static String computerChoice() {

        String computer = "";
        Random rand = new Random();
        int number = rand.nextInt(3);

        if (number == 0) {
            computer = "Rock";
        }

        if (number == 1) {
            computer = "Paper";
        }

        if (number == 2) {
            computer = "Scissors";
        }

        return computer;
    }

    // Checking for result
    public static void decision() {

        if (user.equalsIgnoreCase("Rock") && comp.equals("Paper")) {
            System.out.println("======= You Lost! ========");
        }

        if (user.equalsIgnoreCase("Rock") && comp.equals("Scissors")) {
            System.out.println("======= You Won! =======");
        }

        if (user.equalsIgnoreCase("Paper") && comp.equals("Rock")) {
            System.out.println("======= You Won! =======");
        }

        if (user.equalsIgnoreCase("Paper") && comp.equals("Scissors")) {
            System.out.println("======= You Lost! ========");
        }

        if (user.equalsIgnoreCase("Scissors") && comp.equals("Rock")) {
            System.out.println("======= You Lost! ========");
        }

        if (user.equalsIgnoreCase("Scissors") && comp.equals("Paper")) {
            System.out.println("======= You Won! =======");
        }

        if (user.equalsIgnoreCase(comp)) {
            System.out.println(" It's a Draw!!!");
        }
    }

    // Play again?
    public static String playAgain() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Do you want to play again? (Yes/No)");
        String answer = obj.nextLine();

        while (!("Yes".equalsIgnoreCase(answer) || "No".equalsIgnoreCase(answer))) {
            System.out.println("Invalid Choice. Try again!");
            answer = obj.nextLine();
        }
        return answer;

    }

}