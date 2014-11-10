
public class TrippleDice extends Dice {
	
	
	@Override
	public double Throw()
	{
		double total = 0;
		
		total = (super.Throw() + super.Throw() + super.Throw()) / 3;
		
		return total;
	}

}
