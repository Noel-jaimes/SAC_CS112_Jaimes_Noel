
public class MyThread implements Runnable {
	

	public void getClass(Dice dice)
	{
		System.out.println(dice);
	}
		
		public void run()
		{
			System.out.println(getClass());
		}


}
