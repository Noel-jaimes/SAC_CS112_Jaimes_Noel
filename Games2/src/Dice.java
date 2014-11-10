public class Dice {	

	public double Throw ()
	{
		double roll;
		double totals = 0;
		
		roll = 1 + (int)(Math.random() * 6);
		System.out.println(roll);
		totals += roll;
		return totals;
	}	
	
	@Override
	public String toString()
	{
		return String.format("Number of dices: 3"); 
	}

}
