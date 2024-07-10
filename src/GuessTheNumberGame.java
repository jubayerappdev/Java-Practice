import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    private final int secretNumber;
    private final int minNum;
    private final int maxNum;
    private int noOfGuesses;

    public GuessTheNumberGame(int minNum, int maxNum) {
        this.minNum = minNum;
        this.maxNum = maxNum;
        Random random = new Random();
        this.secretNumber = random.nextInt(maxNum - minNum + 1) + minNum;
        this.noOfGuesses = 0;
    }

    public int takeUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Guess a number between %d and %d: ", minNum, maxNum);
        return scanner.nextInt();
    }

    public boolean isCorrectNumber(int guess) {
        noOfGuesses++;
        if (guess < secretNumber) {
            System.out.println("Too low! Try again.");
            return false;
        } else if (guess > secretNumber) {
            System.out.println("Too high! Try again.");
            return false;
        } else {
            System.out.printf("Congratulations! You've guessed the correct number %d in %d guesses.%n", secretNumber, noOfGuesses);
            return true;
        }
    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        if (noOfGuesses < 0) {
            System.out.println("Number of guesses cannot be negative.");
        } else {
            this.noOfGuesses = noOfGuesses;
        }
    }

    public static void main(String[] args) {
        GuessTheNumberGame game = new GuessTheNumberGame(1, 100);
        while (true) {
            int guess = game.takeUserInput();
            if (game.isCorrectNumber(guess)) {
                break;
            }
        }
    }
}

