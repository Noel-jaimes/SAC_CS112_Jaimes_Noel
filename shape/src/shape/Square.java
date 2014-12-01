package shape;

public class Square extends TwoDimensionalShape {
	
	public double getArea()
	{
		return length * length;
	}
	
	public void display()
	{
		System.out.printf("Its a Two Dimensional shape, Area: %d", getArea());
	}

}
