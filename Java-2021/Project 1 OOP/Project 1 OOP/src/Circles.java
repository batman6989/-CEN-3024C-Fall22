/*
 * File: Rectangle.java 
 * Author: Johnny Bienaime 
 * Description: 
 * Holds variables with the use of setters and getters 
 *  calculate area of the circles
 */
public class Circles //Class header 
{					// Begin class body 
	public static double radius; // object variable 
	public static double areap;	// object variable
	
	public Circles() //overloaded 0-arg constructor 
	{
		radius = 0;// sets radius field to zero 
		}
	
	public Circles(double radius) // constructor that accepts radius as a parameter
	{
		this.radius = radius; // assigns the object variable to the parameter 
		}
	

	public double getRadius() // get method for radius 
	{
		return radius; // return statement
		}

	public void setRadius(double radius) //set method for radius
	{
		this.radius = radius; // return statement
		}
	public static void computeArea()  // method that calculates the circle area 
	{
		areap = Math.PI * radius * radius; // calculate  area 
		System.out.println(areap); // returns the result of the area 
		}
} //end class body