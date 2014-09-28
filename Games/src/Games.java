import java.util.Scanner;

public class Games {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
	
		int user;
		
		System.out.println("Lets Play Rock Papers or Scissors");
		System.out.println("Press 1 for Rock");
		System.out.println("Press 2 for Paper");
		System.out.println("Press 3 for Scissors");
		
		user = input.nextInt();
		
		Game games = new Game(user);
		
		games.display();
		
	}
}
