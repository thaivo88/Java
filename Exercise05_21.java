/**(Financial application: compare loans with various interest rates) 
 * Write a pro- gram that lets the user enter the loan amount 
 * and loan period in number of years and displays the monthly and 
 * total payments for each interest rate starting from 5% to 8%, 
 * with an increment of 1/8. 
 */

import java.util.Scanner;

public class Exercise05_21 {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Loan Amount: ");
		double loan = input.nextDouble();
		
		System.out.println("Enter Number of Years: ");
		double year = input.nextDouble();
		
		System.out.println("Interest Rate \t Monthly Payment \t Total Payment");
		
		
	double rate = 5.00;
	
	for (rate = 5.00; rate <= 8.00; rate += (1/8.0)){
		// Formula PMT = (monthly rate * Principal) / (1-(1 + monthly rate) ^ -(year * 12)
		// Total Payment = Monthly payment * (year * 12)
		double monthlyRate = rate / 1200;
		double monthlyPay = (monthlyRate * loan) / (1 - Math.pow(( 1 + (monthlyRate)), (year * -12)));
		double totalPay = monthlyPay * year * 12;
		System.out.printf("%6.3f%2s%8.2f%2s%10.2f\n", rate, "\t\t", monthlyPay ,"\t\t", totalPay);
	
	}
	}
}
