package shape;

public class Tetrahedron extends ThreeDimensionalShape {
	
	public double getArea()
	{
		return 0;
	}
	
	public double getVolume()
	{
		return (length * length * length)/ (6 * Math.sqrt(2));
	}
	
	public void display()
	{
		System.out.printf("Its a Three Dimensional shape, Area: %d, Volume: %d", getArea(),getVolume());
	}

}
