
public class RandomNumber {
	
	private int randomNumber = setRandom();
	
	//using RandomNumber class to generate random number
	public int setRandom()
	{
		return randomNumber = 1 + (int)(Math.random() * 100);
	}
	
	// using RandomNumber class to have the number print to show the user if its even or odd
	public void getRandom()
	{
		System.out.println(randomNumber);
	}
	
	// using RandomNumber class to test the random number. If there is no remainders then its even
	public boolean testNum()
	{
		if (randomNumber % 2 == 0)
			return true;
		else
			return false;
	}
}
