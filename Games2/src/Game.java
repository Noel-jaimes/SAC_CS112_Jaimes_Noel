import javax.swing.JOptionPane;


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
			JOptionPane.showMessageDialog(null,"Tied");
		}
		else if (users == 1 )
		{
			if (users < randomNum && randomNum != 3)
			{
				JOptionPane.showMessageDialog(null,"Paper beats rock. You loose");
			}
			else 
			{
				JOptionPane.showMessageDialog(null,"Rock beats scissors. You win");
			}
		}
		else if (users == 2)
		{
			if (users < randomNum)
			{
				JOptionPane.showMessageDialog(null,"Scissors beats paper. You loose");
			}
			else if (users > randomNum)
			{
				JOptionPane.showMessageDialog(null,"Paper beats rock. You win");
			}
		}
		else if (users == 3)
		{
			if (randomNum == 2)
			{
				JOptionPane.showMessageDialog(null,"Scissors beats paper. You win");
			}
			else 
			{
				JOptionPane.showMessageDialog(null,"Rock beats Scissors. You loose");
			}
		}
	}
}
