package main;
import java.util.Scanner;
/**
 *  Testing cube class functionality
 *  result: Will base on the side length that user entered and a Cube will be created.
 *  cube.surfaceArea() will return the cube's surface area 
 *  cube.volume() will return the cube's volume
 *  print is set to only show two decimal place. 
 *
 */
public class CubeDriver {

	public static void main(String[] args) {
		System.out.println("Enter the side length of the cube: ");
		Scanner sc = new Scanner(System.in);
		double side=sc.nextDouble();
		Cube cube1 = new Cube(side);
		System.out.printf("%.2f\n",cube1.surfaceArea());
		System.out.printf("%.2f\n",cube1.volume());
	}

}
