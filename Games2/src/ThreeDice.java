
public class ThreeDice {
	
	Dice D1 = new Dice();
	Dice D2 = new Dice();
	Dice D3 = new Dice();
	
	
	public double Throw()
	{
		double total = 0;
		
		total = (D1.Throw() + D2.Throw() + D3.Throw()) / 3;
		
		return total;
	}
	
	@Override
	public String toString()
	{
		return String.format("Your total number is: %f", Throw());
	}
}

