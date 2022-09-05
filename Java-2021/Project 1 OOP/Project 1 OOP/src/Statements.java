/*
 * File: Rectangle.java 
 * Author: Johnny Bienaime 
 * Description: 
 * To output the rectangle sides, circle radius , and the area of rectangles and circles.
 */
public class Statements 
{

	public static void main (String[] args) //main method header 
	{
			
			
		Rectangle rect1 = new Rectangle(4,5);	//create new object 	
			System.out.println("Rectangle 1 has sides " + rect1.getLength() + " and " + rect1.getWidth() + " has a area of:"); //output the sides and area 
			Rectangle.computeArea(); // calculating method 
		
		Rectangle rect2 = new Rectangle(); // create new object 
			 double length = 5.7; //object field 
			double width = 8.1;  // object field
			double area= length * width; //formula for area 
			System.out.println("Rectangle 2 has sides " + length +" and " + width + " has a area of: " + area); //output the sides and area of the rectangle
			
			
			
		Circles cir1= new Circles(3.2); // create new object  
			System.out.println("Circle 1 with radius " + cir1.getRadius() + " has a area of: "); // output the radius 
			Circles.computeArea();// calculating method for area and output area 
			
			
		
		Circles cir2 = new Circles(); // create new object
			double radius = 4; // object field 
			area = Math.PI * radius * radius; // formula for area 
			System.out.println("Circle 2 with radius " + radius + " has a area of: " + area ); //outputs the radius and area 
			

		}
}
