/**(Game: scissor, rock, paper) Write a program that plays the popular 
 * scissor-rock- paper game. (A scissor can cut a paper, a rock can 
 * knock a scissor, and a paper can wrap a rock.) The program randomly 
 * generates a number 0, 1, or 2 representing scissor, rock, and paper. 
 * The program prompts the user to enter a number 0, 1, or 2 and 
 * displays a message indicating whether the user or the computer 
 * wins, loses, or draws. Here are sample runs:
 */

import java.util.Scanner;

public class Exercise03_17 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("scissor (0), rock (1), paper (2):");
		int guess = input.nextInt();
		
		int computer = (int)(Math.random()*3);
		
		if (computer == 0 && guess == 1)
		System.out.println("The computer is scissor. You are rock. You Win");
		else if (computer == 0 && guess == 2)
		System.out.println("The computer is scissor. You are paper. You lose");
		else if (computer == 0 && guess == 0)
		System.out.println("The computer is scissor. You are scissor. Both tie");
		else if (computer == 1 && guess == 1)
		System.out.println("The computer is rock. You are rock. Both tie");
		else if (computer == 1 && guess == 2)
		System.out.println("The computer is rock. You are paper. You win");
		else if (computer == 1 && guess == 0)
		System.out.println("The computer is rock. You are scissor. Both lose");
		else if (computer == 2 && guess == 1)
		System.out.println("The computer is paper. You are rock. You lose");
		else if (computer == 2 && guess == 2)
		System.out.println("The computer is paper. You are paper. Both tie");
		else if (computer == 2 && guess == 0)
		System.out.println("The computer is paper. You are scissor. You win");	
		else if (guess > 2)
		System.out.println("error");
	}
	
}