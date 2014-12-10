
public class Dice {

	protected int throwDice = 0;
	
	public Dice (int numberOfThrows)
	{
		throwDice = numberOfThrows;
	}
	
	public int throwingDices()
	{
		if (throwDice == 1)
		{
			return 1 + (int)(Math.random() * 6);
		}
		else if (throwDice == 2)
		{
			return 2 + (int)(Math.random() * 12);
		}
		else if (throwDice == 3)
		{
			return 3 + (int)(Math.random() * 18);
		}
		return 0;
	}
	
	 @Override
	 public String toString() {
  	   
 	    System.out.printf("Number of single dice: %d\n", throwDice);
 	    System.out.printf("Dice value: " + throwingDices() );
			return "\n";
 	  }
}
