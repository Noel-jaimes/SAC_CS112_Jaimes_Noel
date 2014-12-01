package shape;

public class Triangle extends TwoDimensionalShape {
	
	public double getArea()
	{
		return (height * base)/2 ;
	}
	
	public void display()
	{
		System.out.printf("Its a Two Dimensional shape, Area: %d", getArea());
	}

}
