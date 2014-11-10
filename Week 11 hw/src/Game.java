
public class Game {
	
	private int choice;
	
	//Constructor with one parameter
	public Game(int number)
	{ 
		choice = number;
	}
	
	public int getChoice ()
	{
		return choice;
	}

	//Static Polymorphism 
	public void displays()
	{
		System.out.println("Maybe next time");
	}
	
	public void displays(int agree)
	{
		if (agree == 1)
		{
			System.out.println("You picked Rock");
		}
		else if (agree == 2)
		{
			System.out.println("You picked Paper");
		}
		else if (agree == 3)
		{
			System.out.println("You picked Scissors");
		}
	}
}
