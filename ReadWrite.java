// Harrison Holsinger
/* This program will allow the user to input a file of his or her choice. The user will then have the option to
 * read or to write to that file. If the user chooses to read, the contents of that file will be read and 
 * displayed. This program uses try/catch phrases to catch exceptions regarding IO issues. 
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;



public class ReadWrite 
{

	public static void main(String[] args) throws IOException 
	{
		//Create scanner object
		Scanner scan = new Scanner(System.in);
		String fileName = "", choice1, text;
		int choice;
		boolean bool = true;
		boolean goodFile = true;
		boolean goodWrite = true;
		
		while(bool)				// beginning of outer loop
		{
			goodFile = true;			// allows the program to enter the loop the second time around
			
			while(goodFile)		// start of inner loop
			{
				System.out.print("Enter a file name to read or write to: ");
				fileName = scan.next().trim();
									
				
				System.out.println("Select a 1 to read from this file. ");
				System.out.print("Select a 2 to write to this file. ");
					
				choice = scan.nextInt();
				try							// check to see if file exists
				{
					if(choice == 1)
					{
					
						File file = new File(fileName); 
						Scanner scan1 = new Scanner(file);
										
						while (scan1.hasNextLine()) // loop through file and display contents
					    {
					        String input = scan1.nextLine();
					        System.out.println(input);
					    }
						goodFile = false;
					}
					else if(choice == 2)
					{
						while(goodWrite)
						{
							System.out.print("What would you like to write to the file? ");
							try
							{
								text = scan.next().trim();     // user inputs text to write to file
								
								FileWriter fileWriter = new FileWriter(fileName); 
								fileWriter.write(text);			// text is displayed in the file
								goodWrite = false;
								goodFile = false;
							}
							catch(IllegalArgumentException e)
							{
								 System.out.println("Invalid argument type entered.");	// if incorrect input is given
								 goodWrite = true;										// an exception is thrown and 
								 goodFile = true;
							}		
						}
						
					}
				}
				catch(FileNotFoundException e)
				{
					System.out.println("File not found!");	// file not found exception
					goodFile = true;						// if so the boolean will switch to end the loop
				}
				
			}
			
		
			System.out.println();
			System.out.println("Would you like to enter another? Enter end to terminate");
			choice1 = scan.next().trim();
			if(choice1.toLowerCase().equals("end"))		// if user enters "end" the loop will break. Otherwise,
			{											// it will continue to loop
				break;
			}
		}
		scan.close();

		

		
		
				
		

	}

}
