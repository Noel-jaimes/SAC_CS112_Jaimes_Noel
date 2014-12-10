/*
   a) Encapsulation (show code): The Encapsulation is the  
   making DoubleDice class multithread
   
   Heres the code:
    MyThread multiDice = new MyThread();
    multiDice.getClass(doubleDice);
	   
    ExecutorService threadExecutor = Executors.newCachedThreadPool();  
    threadExecutor.execute(multiDice);
    threadExecutor.shutdown();
        
    Created a thread and called it multiDice. Use Executor by importing two utilities (Executor, ExecutorService).
    Reason why I use Executor is because it makes the multithread easy to use.
    Used DoubleDice class/object (which was a subclass from Dice) as an argument for getClass method in multiDice Thread
    In the run method, I used the getClass method in  System.out.println so it can print toString information.
    It won't run until it has
    
    ExecutorService threadExecutor = Executors.newCachedThreadPool();  
    threadExecutor.execute(multiDice);
    threadExecutor.shutdown();
    without it the Executor is useless.
    
    b) Inheritance (show code): I used inheritance with DoubleDice, Dice.
    Dice is the superclass and doubleDice is the subclass.
    
    didn't have to do anything with Dice but with DoubleDice I used extend
    
    showing code:
    
    public class DoubleDice extends Dice{
 
    }
    
    by using extend  it lets me use anything (inherit) that the Dice class has. Also I can override them
    as long both class are the same. If Dice class has a parameter in the method then the subclass same method
    has to have a parameter to override.
    
    c) Polymorphism (show code):
    In DOubleDice I overiden toString and throwingDices from the original Dice class.
    
    original 
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
 	  
 	  override
 	  by change some numbers in throwingDice method 
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

 
 */


import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class Game {

	public static void main(String[] args) {

		int numberOfThrows = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many dice do you want to throw?");
		numberOfThrows = input.nextInt();
		
		Dice dice = new Dice(numberOfThrows);
		Dice doubleDice = new DoubleDice(numberOfThrows);
		
		System.out.println(dice);
		
		
	    MyThread multiDice = new MyThread();
	    multiDice.getClass(doubleDice);
	   
	    ExecutorService threadExecutor = Executors.newCachedThreadPool();  
	    threadExecutor.execute(multiDice);
        threadExecutor.shutdown();
	}

}
