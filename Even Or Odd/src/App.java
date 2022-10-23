import java.util.Random;

public class App {

    public static void main(String[] args) {
        int trueCounter = 0, falseCounter = 0;
        Random random = new Random();
        int upperbound = 100;

        for (int i = 0; i < 100; i++) {
            int number = random.nextInt(upperbound);

            System.out.println(number);

            boolean result = isEven(number);
            
            if (result == true) {
                trueCounter = trueCounter + 1;

            } else {
                if (result == false) {
                    falseCounter = falseCounter + 1;
                }
            }

            System.out.println(isEven(number));

        }
        System.out.println("Total even numbers: " + trueCounter);
        System.out.println("Total odd numbers: " + falseCounter);
    }

    public static boolean isEven(int number) {
        boolean choice = false;

        if (number % 2 == 0) {
            choice = true;
        }
        if (number % 2 != 0) {
            choice = false;
        }
        return choice;

    }
}
