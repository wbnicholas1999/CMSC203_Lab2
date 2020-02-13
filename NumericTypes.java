import java.util.Scanner;

/**
 * 
 * @author William Nicholas
 * 
 * This program demonstrates how numeric types and operators behave in Java
 * 
*/

public class NumericTypes
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
			
			final int NUMBER; // number of scores
			int score1; // first test score
			int score2; // second test score
			final int BOILING_IN_F = 212; // boiling temperature
			double fToC; // temperature in Celsius
			double average; // arithmetic average
			String output; // line of output to print out
			
			System.out.print("Enter the first test score: ");
			score1 = input.nextInt();
			System.out.print("Enter the second test score: ");
			score2 = input.nextInt();
			System.out.print("Enter the number of scores: ");
			NUMBER = input.nextInt();
			
			average = ((float)(score1 + score2)) / NUMBER;
			output = score1 + " and " + score2 + " have an average of " + average;	
			System.out.println(output);
			
			fToC = (5*(BOILING_IN_F - 32))/9;
			output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
			System.out.println(output);
			
			System.out.print("Enter another temperature in Fahrenheit: ");
			final int fahrenheit = input.nextInt();
			double celsius = (5*(fahrenheit - 32))/9;
			output = "The temperature in Celsius is now " + celsius + "\n";
			System.out.println(output);
			
			if (score1 == 95 || score1 == 100)
			{
				if (score2 == 100 || score2 == 95)
				{
					if (celsius == 100.0)
					{
						System.out.println("Test successful!\n");
					}
					else
					{
						System.out.println("Test failed!\n");
					}
				}
				else
				{
					System.out.println("Test failed!\n");
				}
			}
			else
			{
				System.out.println("Test failed!\n");
			}
			
			System.out.println("Goodbye");
	}
}
