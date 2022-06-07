import java.util.Random;

public class Game {

    private final int answer;

    public Game() {

        this.answer = randomNumberGenerator();
    }

    public int randomNumberGenerator() {
        Random random = new Random();

        return random.nextInt(899) + 100;
    }
}