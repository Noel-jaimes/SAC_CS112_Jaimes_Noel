
public class MyThread implements Runnable{
	
	int number;
	int random[] = new int[3];
	int total = 0;
	
	public MyThread(int numbers)
	{
		number = numbers;
	}
	
	public int throwDice() 
	{
		int i = 1 + (int)(Math.random() * 6);
		return i;
	} 
	
	public void run()
	{
		for (int i = 0; i < 3 ; i++)
    	{
			random[i] = throwDice();
    	}
		for (int i = 0; i < 3 ; i++)
    	{
			System.out.printf("Dices %d rolled a %d \n", number + i, random[i]);	
			total += random[i];
    	}
	
		//System.out.println(Thread.currentThread().getName() + " " + random);
	}
	
	public int getRandoms()
	{
		return total;
	}
		
}
