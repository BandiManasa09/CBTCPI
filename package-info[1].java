package GuessTheNumberGame;
import java.util.Scanner;

public class GuessTheNumberGame {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int numberToGuess = 1 + (int) (100 * Math.random());

int maxAttempts = 5;

System.out.println("Welcome to the Guess the Number game!");

System.out.println("I have chosen a number between 1 and 100.\nTry to guess it within " + maxAttempts + " attempts.");

for (int attempt = 1; attempt <= maxAttempts; attempt++) {

System.out.print("Attempt " + attempt + ": Enter your guess: ");

int userGuess = sc.nextInt();

if (userGuess == numberToGuess) {

System.out.println("Congratulations! You have guessed the number.\n");

break;

} else if (userGuess < numberToGuess) {

System.out.println("The number is greater than " + userGuess);

} else {

System.out.println("The number is less than " + userGuess);

}

}

if (numberToGuess!= userGuess) {

System.out.println("You have run out of " + maxAttempts + " attempts.\nThe correct number was: " + numberToGuess);

}

}

}