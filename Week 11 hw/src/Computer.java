
public class Computer extends Game {
	
	private int randoms = random();
	
	//constructor with one parameter. Using superclass to store choice
	public Computer (int choice)
	{
		super(choice);
	}
	
	//Generating a random number
	public int random ()
	{
		int number = 1 + (int)(Math.random() * 3);
		return number;
	}
	//using user choice and random number to see who wins the game
	public void display()
	{		
		if (super.getChoice() == randoms)
		{
			System.out.println("Tied");
		}
		else if (getChoice() == 1 )
		{
			if (randoms != 3)
			{
				System.out.println("Paper beats rock. You loose");
			}
			else 
			{
				System.out.println("Rock beats scissors. You win");
			}
		}
		else if (getChoice() == 2)
		{
			if (getChoice() < randoms)
			{
				System.out.println("Scissors beats paper. You loose");
			}
			else 
			{
				System.out.println("Paper beats rock. You win");
			}
		}
		else if (getChoice() == 3)
		{
			if (randoms == 2)
			{
				System.out.println("Scissors beats paper. You win");
			}
			else 
			{
				System.out.println("Rock beats Scissors. You loose");
			}
		}
	}

}
