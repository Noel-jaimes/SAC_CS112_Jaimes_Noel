package shape;

public class Sphere extends ThreeDimensionalShape {
	
	public double getArea()
	{
		return 4 * Math.PI * radius * radius;
	}
	
	public double getVolume()
	{
		return (4/3) * Math.PI * radius * radius * radius;
	}
	
	public void display()
	{
		System.out.printf("Its a Three Dimensional shape, Area: %d, Volume: %d", getArea(),getVolume());
	}

}
