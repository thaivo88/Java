/** (Financial application: calculate future investment value) 
Write a program that reads in investment amount, 
annual interest rate, and number of years, and displays the future investment value using the following formula:
futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)numberOfYears*12
FV = IA * (1+ (IR / 12))^(YR*12)
For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1, the future investment 
value is 1032.98.
Here is a sample run: 
Enter investment amount: 1000.56
Enter annual interest rate in percentage: 4.25
Enter number of years: 1
Accumulated value is $1043.92 **/

import java.util.Scanner;

public class Exercise02_21 {
 public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		System.out.println("Enter investment amount:");
			double investmentAmount = input.nextDouble();
			
		System.out.println("Enter annual interest rate in percentage:");
			double interestRate = input.nextDouble();
				/*annual interest rate needs to be transform into decimal form then divided on a monthly base 
				 * ((interestRate / 100) /12)
				 */
		System.out.println("Enter number of years:");
			double yearInvestment = input.nextDouble();
			
			double futureInvestment = investmentAmount * (Math.pow((1 + ((interestRate / 100) / 12)), (yearInvestment * 12)));
		System.out.println("Accumulated value is $" + futureInvestment);
 }
 }