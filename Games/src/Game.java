
public class Game {
	private int users;
	public int randomNum = randoms();
	
	public Game( int number)
	{
		users = number;
	}
	
	public int randoms()
	{
		return randomNum = 1 + (int)(Math.random() * 3);
	}
	
	public void display()
	{
		System.out.println(randomNum);
		
		if (users == randomNum)
		{
			System.out.println("Tied");
		}
		else if (users == 1 )
		{
			if (users < randomNum && randomNum != 3)
			{
				System.out.println("Paper beats rock. You loose");
			}
			else 
			{
				System.out.println("Rock beats scissors. You win");
			}
		}
		else if (users == 2)
		{
			if (users < randomNum)
			{
				System.out.println("Scissors beats paper. You loose");
			}
			else if (users > randomNum)
			{
				System.out.println("Paper beats rock. You win");
			}
		}
		else if (users == 3)
		{
			if (randomNum == 2)
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

// Please help explain the logic behind the code
