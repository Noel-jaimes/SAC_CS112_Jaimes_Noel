import java.util.Scanner;
//Midterm test
public class OddEven {

	public static void main(String[] args) {
		// variables 
		Scanner input = new Scanner(System.in);
		boolean again = true;
		boolean userGuess = false;
		int guess;
		int countingWins = 0;
		int countingLost = 0;
		
		//using a do while loop so the first guess can be a free one. 
		do{
			//Ask the user to enter even or Odd
			System.out.println("Guess whether the number is Odd or Even:");
			System.out.println("Type 1 for Even or 2 for Odd. To quit type -1");
		
			// input the user  number to system
			guess = input.nextInt(); 
			// using user responds to see if its odd or even or quit
			if ( guess == 1)
				userGuess = true;
			else if (guess == 2)
				userGuess = false;
			else 
				again = false;
		
			// creating a object RandomNumber.
			RandomNumber numbers = new RandomNumber();
		
			//Showing the random number
			
			
			//Using a if statement.  if user decides to quit it'll skip nested if and end do while.
			if (again != false)
			{
				numbers.getRandom();
				//nested if statement. checking if the random and user are correct
				if (numbers.testNum() == true && userGuess == true)
				{
					System.out.println("You guessed it\n");
					countingWins++;
				}
				else if (numbers.testNum() == true && userGuess == false)
				{
					System.out.println("Wrong\n");
					countingLost++;
				}
				else if (numbers.testNum() == false && userGuess == false)
				{
					System.out.println("You guessed it\n");
					countingWins++;
				}
				else if (numbers.testNum() == false && userGuess == true)
				{
					System.out.println("Wrong\n");
					countingLost++;
				}
			}
		}while(again );
		
		// shows results how many wins and looses user has
		System.out.printf("You had %d wins and %d losses", countingWins, countingLost);

	}

}
