package shape;

public class Circle extends TwoDimensionalShape{
	
	public double getArea()
	{
		return Math.PI * radius;
	}
	
	public void display()
	{
		System.out.printf("Its a Two Dimensional shape, Area: %d", getArea());
	}

}
