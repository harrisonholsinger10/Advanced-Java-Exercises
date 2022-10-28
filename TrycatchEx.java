import java.util.Scanner;

// Harrison Holsinger
// This program will input a product code, price, and quantity. 
// It will thrown an exception for any invalid input data 
// and then output the total price(quantity*price).

public class TrycatchEx 
{

	public static void main(String[] args) throws Exception
	{

		//Create scanner object
		Scanner scan = new Scanner(System.in);
		
		String choice;		// declare variables
		int code, quantity = 0;
		double price = 0;
		boolean goodCode = false;
		boolean goodPrice = false;
		boolean goodQuan = false;
		
		do
		{	
			do
			{
			
				System.out.print("Please enter a product code: ");
							
				try
				{
					code = Integer.parseInt(scan.next());		// check if input can be converted to an int
					goodCode = true;							// if so the boolean will switch to end the loop
				}
				catch(IllegalArgumentException e)
				{
					 System.out.println("Invalid argument type entered.");	// if incorrect input is given
					 goodCode = false;										// an exception is thrown and 
				}															// the boolean is switched to 
																			// continue the loop
			}while(goodCode == false);
			
			do
			{
			
				System.out.print("Please enter the price of the product: ");
				try
				{
					price = Double.parseDouble(scan.next());	// check if input can be converted to a double
					goodPrice = true;							// if so the boolean will switch to end the loop
				}
				catch(IllegalArgumentException e)
				{
					 System.out.println("Invalid argument type entered.");	// if incorrect input is given
					 goodPrice = false;										// an exception is thrown and 
				}															// the boolean is switched to 
																			// continue the loop
				if(price < 0)		
				{
				     goodPrice = false;
				     throw new IllegalArgumentException("Only Positive Numbers"); // an exception is thrown if
				}																  // if price is negative
			}while(goodPrice == false);
			
			do
			{
			
				System.out.print("Please enter the quantity of the product: ");
				try
				{
					quantity = Integer.parseInt(scan.next());	// check if input can be converted to an int
					goodQuan = true;							// if so the boolean will switch to end the loop
				}
				catch(IllegalArgumentException e)
				{
					 System.out.println("Invalid argument type entered.");	// if incorrect input is given
					 goodQuan = false;										// an exception is thrown and 
				}															// the boolean is switched to 
																			// continue the loop
				if(quantity < 0)
				{
				     goodQuan = false;
				     throw new IllegalArgumentException("Only Positive Numbers");  // throw an exception if 
				}																	// quantity is less than zero	
			}while(goodQuan == false);
			
			System.out.print("The total is $");
			System.out.printf("%.2f", getTotal(price, quantity)); // function call with formating
			
			
			System.out.println();
			System.out.println("Would you like to enter another? Enter end to terminate");
			choice = scan.next();
			
		}while(!choice.toLowerCase().equals("end"));		// The program will only loop if the user does
		scan.close();										// not type end
		
	}
	/* getTotal takes in quantity and price,
	 * multiplies them together and returns the
	 * total price
	 */ 
	public static double getTotal(double num1, int num2)
	{
		return num1 * num2;
	}


}
