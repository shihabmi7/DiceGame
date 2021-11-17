import java.util.Random;

public class Dice {

    int numberOfDice;

    public Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public int sum() {
        int result = 0;
        for (int i = 0; i < numberOfDice; i++) {
            Random random = new Random();
            result = result + random.nextInt(6) + 1;
        }
        return result;
    }

}
