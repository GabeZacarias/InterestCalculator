import java.util.Scanner;

/**
 * 
 */

/**
 * @author GabrielZacarias
 *
 */
public class InterestCalculator 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		double start_deposit, annual_interest_rate, years_of_interest, end_value;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the starting deposit: ");
		start_deposit = input.nextDouble();
		
		System.out.print("Enter the interest rate in %: ");
		annual_interest_rate = input.nextDouble();
		
		System.out.print("Enter the number of years: ");
		years_of_interest = input.nextDouble();
		
		end_value = start_deposit * Math.pow(1 + (annual_interest_rate/100), years_of_interest);
		System.out.printf("\nThe ending value is: %.2f", end_value);
		
	}

}
