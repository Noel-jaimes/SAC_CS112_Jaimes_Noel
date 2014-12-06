import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class Dice {
    public static void main(String[] args) {
     
    	int totals = 0;
    	
    	MyThread task1 = new MyThread(1);
    	MyThread task2 = new MyThread(4);
    	MyThread task3 = new MyThread(7);
    	
    	/*
    	System.out.println("Start");
    	for (int i = 1; i <= 25; i++)
    	{
    		Thread dice = new Thread(new MyThread());
    		dice.setName("Dice #"+i+" Dice");
    		dice.start();
    	}
    	*/
    	
    	ExecutorService threadExecutor = Executors.newCachedThreadPool();
    		
    	threadExecutor.execute(task1);
    	threadExecutor.execute(task2);
    	threadExecutor.execute(task3);
    	    	
    	threadExecutor.shutdown();
    
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	
    	totals += task1.getRandoms()+ task2.getRandoms() + task3.getRandoms();
    	
    	System.out.println(totals);
    }
}


