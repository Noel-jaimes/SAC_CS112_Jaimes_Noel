
public class DoubleDice extends Dice  {

	public DoubleDice(int numberOfThrows) {
		super(numberOfThrows);
	
	}
	
	public int throwingDices()
	{
		if (throwDice == 1)
		{
			return 2 + (int)(Math.random() * 12);
		}
		else if (throwDice == 2)
		{
			return 2 + (int)(Math.random() * 24);
		}
		else if (throwDice == 3)
		{
			return 3 + (int)(Math.random() * 36);
		}
		return 0;
	}
	
	 @Override 
	 public String toString() {
	  	   
	 	    System.out.printf("Number of double dices: %d\n", super.throwDice);
	 	    System.out.printf("Dice value: " + throwingDices() );
				return "\n";
	 	  }
}
