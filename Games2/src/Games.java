public class Games {
	public static void main(String[] args) {
		
		
		System.out.println("Rolling Dice");
		
		//Dice one = new Dice();
		//ThreeDice average = new ThreeDice ();
		TrippleDice averages = new TrippleDice();
		
		System.out.println("Your total average is: " + averages.Throw());
		//System.out.println(one);
		//System.out.println(average);
		
	}
}
