

public class Dice {
	
	private int total = Throw (int dices, boolean even);
	
	public Dice()
	{
		
	}
	
	public int Throw (int dices, boolean even)
	{
		int totals = 0;
		int roll;
		int result;
		
		for (int i = 0; i < dices; i++)
		{
			roll = 1 + (int)(Math.random() * 6);
			System.out.println(roll);
			totals += roll;
			if(even == true)
			{
				result = roll % 2;
				if(roll == 0)
					dices = 0;
			}
			else if (even == false)
			{
				result = roll % 2;
				if(roll == 1)
					dices = 0;
			}
		}
		return totals;
	}
	
	static int OneDice()
	{
		return 1 + (int)(Math.random() * 6);
	}
	
	public int Value ()
	{
		return ;
	}
}
