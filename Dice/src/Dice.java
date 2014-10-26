import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        int diceRoll;
       
        Scanner input = new Scanner (System.in);
       
        System.out.println("How many dice are you rolling?");
        diceRoll = input.nextInt();
        System.out.print("You throwing ");
        System.out.print(diceRoll);
        System.out.println(" dices");
        System.out.println("Your Rolling History:");
        Game userDice = new Game (diceRoll);
       
        System.out.printf("All together you rolled a %d.\n", userDice.Value());
    }
}


