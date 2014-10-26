import java.util.Scanner;

public class Games {
	public static void main(String[] args) {
		int diceRoll;
		boolean evenOrOdd;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("How many dice are you rolling?");
		diceRoll = input.nextInt();
		System.out.println("Do you want your number even or odd");
		evenOrOdd = input.nextBoolean();
		System.out.println("Rolling Dice");
		Dice userDice = new Dice ();
		
		userDice.Throw(diceRoll, evenOrOdd);
		
		System.out.printf("You rolled a %d.\n", userDice.Value());
		System.out.printf("I rolled a %d.", Dice.OneDice());
	}
}
