
public class RandomNumber {
	
	public int randomNum;
	
    public RandomNumber ()
    {
    	randomNum = 1 + (int)(Math.random() * 10);
    }

    public RandomNumber (int lo, int hi)
    {
    	randomNum = lo + (int)(Math.random() * hi);
    }

    public int GetRandom()
    {       
        return randomNum;
    }
}
