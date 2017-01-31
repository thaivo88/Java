/**(Algebra: solve quadratic equations) The two roots of a quadratic equation 
 * ax2 + bx + c = 0 can be obtained using the following formula:
  r1 = 2a and r2 = 2a
  b2 - 4ac is called the discriminant of the quadratic equation. 
  If it is positive, the equation has two real roots. If it is zero, 
  the equation has one root. If it is negative, the equation has no real roots.
  Note that you can use Math.pow(x, 0.5) to compute 2x. Here are some sample runs.
 */

import java.util.Scanner;

public class Exercise03_01 {
	public static void main(String[] args){
			Scanner input = new Scanner(System.in);
		
			System.out.println("Enter a, b, c:");
			double a = input.nextDouble();
			double b = input.nextDouble();
			double c = input.nextDouble();
			
			double quadratic = Math.pow(b, 2) - (4 * a * c );
			
			double r1 = ((- b) + Math.sqrt(quadratic))  / (2 * a );
			double r2 = ((- b) - Math.sqrt(quadratic))  / (2 * a );
			
			if (quadratic > 0)
			System.out.println("The equation has two real roots"+ r1 + " and " + r2);
				else if (quadratic == 0)
			System.out.println("The equation has one root "+ r1);
				else if (quadratic < 0)
			System.out.println("The equation has no real roots");
				
				
	}
	
}
