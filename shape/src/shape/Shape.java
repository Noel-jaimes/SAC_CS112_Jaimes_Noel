package shape;

public class Shape {
	protected double base;
	protected double length;
	protected double height;
	protected double radius;
	private int number = 0;
	
	private Shape[] list = new Shape[6];
	
	public Shape() 
	{
		
	}
	public Shape(double based,double lengthed,double heighted,double radiused)
	{
		base = based;
		length = lengthed;
		height = heighted;
		radius = radiused;
	}

	public void add(Shape a)
	{
		if (number < list.length)
		{
			list[number] = a;
			number++;
		}
	}
	
	

}
