
public class RandomNumber {
	
	private int randomNum;
	
    public RandomNumber ()
    {
    	randomNum = 1 + (int)(Math.random() * 3);
    }

    public int GetRandom()
    {       
        return randomNum;
    }
}
