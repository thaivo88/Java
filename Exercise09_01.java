/**(The Rectangle class) Following the example of the Circle class in Section 9.2, 
 * design a class named Rectangle to represent a rectangle. The class contains:
* Two double data fields named width and height that specify the width and height 
* of the rectangle. The default values are 1 for both width and height.
* A no-arg constructor that creates a default rectangle.
* A constructor that creates a rectangle with the specified width and height.
* A method named getArea() that returns the area of this rectangle.
* A method named getPerimeter() that returns the perimeter.
* Draw the UML diagram for the class and then implement the class. 
* Write a test program that creates two Rectangle objects—one with width 4 and 
* height 40 and the other with width 3.5 and height 35.9. Display the width, height, 
* area, and perimeter of each rectangle in this order.
*/

public class Exercise09_01 {
	public static void main(String[] args){
		
		rectangle r1 = new rectangle(); //create object rectangle 1
		rectangle r2 = new rectangle(); //create object rectangle 2
		
		r1.width = 4;
		r1.height = 40;
		r2.width = 3.5;
		r2.height = 35.9;
		//assigning r1 and r2
	
		System.out.println("For Rectangle r1 the width is: " + r1.width + " and height is: " + r1.height + 
				"\nThe area for r1 is: " + r1.getArea() + " and the perimeter for r1 is: " + r1.getPerimeter());
	
		System.out.printf("%20s%6.2f%20s%8.2f%20s%6.2f%20s%6.2f","\nFor Rectangle r2 the width is: " , r2.width , 
				" and height is: " , r2.height , "\nThe area for r1 is: " , r2.getArea() , 
				" and the perimeter for r1 is: " , r2.getPerimeter());
		
		}
	}
	
	
	class rectangle{ 		//create a template for rectangle class
		double width = 1; 	//the width of the rectangle
		double height = 1;	//the height of the rectangle
		
	double getArea(){			//creating a formula for area
		return width * height;
	}
	double getPerimeter(){		//creating a formula for perimeter 
		return (2*(width + height));
	}
	}



