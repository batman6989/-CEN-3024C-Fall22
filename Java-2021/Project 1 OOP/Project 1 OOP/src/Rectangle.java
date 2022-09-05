/*
 * File: Rectangle.java 
 * Author: Johnny Bienaime 
 * Description: 
 *  Holds variables with the use of setters and getters 
 *  calculate area of the rectangles
 */
public class Rectangle // Class header 
{                      // Start class body 
	public static double length; // object variable
	public static double width; //  object variable
	public static double area; //   object variable
	
	
	public Rectangle() // overloaded 0-arg constructor set fields to zero.
	{
		width = 0; // sets variable to zero 
		length = 0; // sets variable to zero
		}
	public Rectangle(double length,double width) // constructor that accepts (length, width) as a parameter
	{
		this.length = length; //assigns the object variable to the parameter 
	
		this.width = width; //assigns the object variable to the parameter 
		}
	

	
	public double getLength() //get method for length variable
	{
		return length; //returns length
		}

	public void setLength(double length) // set method for length variable
	{
		this.length = length;// assigns the object variable to the parameter 
	
		}

	public double getWidth() //get method for width variable 
	{
		return width; // returns width 
		}

	public void setWidth(double width) //set method for width variable
	{
		this.width = width; //assigns the object variable to the parameter 
	
		}



	public static void computeArea() //method for calculating area of the rectangles 
{
	area = length * width; // formula for area 
	System.out.println(area); //returns area 
	}


}//end class body 
