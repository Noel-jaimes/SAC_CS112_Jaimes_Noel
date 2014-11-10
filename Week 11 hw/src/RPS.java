import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		// variables
		int userChoice;
		int result;
		
		//Menu
		System.out.println("Lets Play Rock Papers or Scissors");
		System.out.println("Press 1 for Rock\nPress 2 for Paper\nPress 3 for Scissors");
		userChoice = input.nextInt();
		
		//Creating object from subclass with one argument
		Computer winning = new Computer(userChoice);
		
		//Menu and result will lead to use Static Polymorphism
		System.out.println("If you want to see your choice press 1\nIf not Press 2");
		result = input.nextInt();
		
		if (result == 1)
		{
			winning.displays(userChoice);
		}
		else if (result == 2)
		{
			winning.displays();
		}
	
		//Result
		winning.display();
	}
}
