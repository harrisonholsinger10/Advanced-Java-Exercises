import java.util.Scanner;

// Harrison Holsinger
// This program will ask the user to input a string and the computer will divide up the statement and checks
// for capitals at the beginning of the sentence and a period at the end. It will then check for any other
// capitals, periods, or parentheses and display them as names, abbreviations, and product codes. 


public class StringParsing 
{

	public static void main(String[] args) 
	{
		//Create scanner object
		Scanner scan = new Scanner(System.in);
		String product, choice;		// declare variables
		
		do
		{			
			System.out.println("Hello, please enter a product description:");
			System.out.println("If you would like to terminate, press enter or type end.");
			
			product = scan.nextLine();		// read input using scanner object
			
			if(product.equals(""))		// if the user presses enter, program will terminate
			{
				break;
			}
			else if(product.toLowerCase().equals("end"))	// if the user types end, program will terminate
			{												// is case insensitive
				break;
			}
			System.out.println();

			String[] tokens = product.split(" ");		// split statement up into words

			// checking to see if the first character is upper case
			if (!Character.isUpperCase(tokens[0].charAt(0)))
			{
				System.out.println("The first letter of the product description is not upper case.");
			}
			// checking to see if the statement ends with a period
			if (tokens[tokens.length - 1].charAt(tokens[tokens.length - 1].length() - 1) != '.')
			{
				System.out.println("The product description does not end with a period.");
			}
			System.out.println();

			System.out.println("Names: ");

			// checking to see if any of the words begin with an upper case letter excluding the first word
			for(int i = 1; i < tokens.length; i++)
			{
				if(Character.isUpperCase(tokens[i].charAt(0)))
				{
					System.out.println(tokens[i]);
				}
			}
			
			System.out.println();
			System.out.println("Abbreviations: ");
			
			// checking to see if any of the words end with a period excluding the last
			for(int i = 0; i < tokens.length - 1; i++)
			{
				if((tokens[i].charAt(tokens[i].length() - 1)) == '.')
				{
					System.out.println(tokens[i]);
				}
			}
			
			System.out.println();
			System.out.println("Product Codes: ");
			
			// checking to see if any of the words are inside of parentheses 
			for(int i = 0; i < tokens.length; i++)
			{
				if((tokens[i].charAt(0)) == '(' && tokens[i].charAt(tokens[i].length() - 1) == ')')
				{
					System.out.println(tokens[i]);
				}
			}
			
			System.out.println();
			System.out.println("Would you like to enter another? Press Enter or type end to terminate");
			choice = scan.nextLine();
			
			// if user presses enter, the program will terminate
			if(choice.equals(""))
			{
				break;
			} 
		}while(!choice.toLowerCase().equals("end"));		// The program will only loop if the user does
		scan.close();										// not press enter or type end

		
	}

	

}
