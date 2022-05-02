package main;
/**
 * Create a class called Cube that represents a cube. It should know the length of its sides (all equal
 *since it is a cube) and how to calculate its surface area and volume
*/
public class Cube {
	
	double sideLength;
	
	/**
	 * @param sideLength Sets the width of the cube object
	 */
	public Cube(double sideLength) {
		this.sideLength=sideLength;
	}
	
	/**
	 * @return Surface area of the cube
	 */
	public double surfaceArea() {
		return sideLength*sideLength*6;
	}
	/**
	 * @return Volume of the cube
	 */
	public double volume() {
		return sideLength*sideLength*sideLength;
	}


}
