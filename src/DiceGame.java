import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {

        System.out.println("Enter Your Dice Number");
        Scanner sc = new Scanner(System.in);
        int numberOfDice = Integer.parseInt(sc.nextLine());

        System.out.println("Enter Total Round Number");
        int roundNumber = Integer.parseInt(sc.nextLine());

        System.out.println("Enter Player One Name");
        String playerOneName = sc.nextLine();

        System.out.println("Enter Player Two Number");
        String playerTwoName = sc.nextLine();

        Player playerOne = new Player(playerOneName);
        Player playerTwo = new Player(playerTwoName);
        Dice aDice = new Dice(numberOfDice);

        System.out.println("Game Start!");

        for (int i = 1; i <= roundNumber; i++) {
            playerOne.totalScore += aDice.sum();
            System.out.println("After Round " + i + " " + playerOne.name + " Total Score: " + playerOne.totalScore);
            playerTwo.totalScore += aDice.sum();
            System.out.println("After Round " + i + " " + playerTwo.name + " Total Score: " + playerTwo.totalScore);
        }

        if (playerOne.getTotalScore() > playerTwo.getTotalScore()) {
            System.out.println(playerOne.name + " Win. ");
        } else if (playerOne.getTotalScore() < playerTwo.getTotalScore()) {
            System.out.println(playerTwo.name + " Win");
        } else
            System.out.println(" Match Draw !!!");

    }
}
