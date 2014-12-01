package shape;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double base;
		double length;
		double height;
		double radius;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter the base of the shape:");
		base = input.nextDouble();
		System.out.println("Please enter the length of the shape:");
		length = input.nextDouble();
		System.out.println("Please enter the height of the shape:");
		height = input.nextDouble();
		System.out.println("Please enter the radius of the shape:");
		radius = input.nextDouble();
		
		Shape shapes = new Shape(base,length,height,radius);
		Circle circle = new Circle();
		Square square = new Square();
		Triangle triangle = new Triangle();
		Cube cube = new Cube();
		Sphere sphere = new Sphere();
		Tetrahedron tetrahedron = new Tetrahedron();
		/*
		shapes.add(circle);
		shapes.add(square);
		shapes.add(triangle);
		shapes.add(sphere);
		shapes.add(cube);
		shapes.add(tetrahedron);
		*/
		circle.display();
		square.display();
		triangle.display();
		sphere.display();
		cube.display();
		tetrahedron.display();

	}

}
