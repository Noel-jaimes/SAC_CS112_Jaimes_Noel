package shape;

public class Cube extends ThreeDimensionalShape {
	
	public double getArea()
	{
		return 6 * length;
	}
	
	public double getVolume()
	{
		return length * length * length;
	}
	
	public void display()
	{
		System.out.printf("Its a Three Dimensional shape, Area: %d, Volume: %d", getArea(),getVolume());
	}
}
