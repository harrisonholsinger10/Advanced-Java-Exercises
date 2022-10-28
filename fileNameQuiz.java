// Harrison Holsinger
// Determines whether a file exists or not
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileNameQuiz 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String fileName = "";
				
		System.out.print("Enter a file name to read or write to: ");
		fileName = scan.next().trim();
		
		try							
		{
				File file = new File(fileName); 
				Scanner scan1 = new Scanner(file);
								
				while (scan1.hasNextLine()) 
				{
			        String input = scan1.nextLine();
			        System.out.println(input);
			    }
			System.out.println("File found!");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found!");	// file not found exception
		}
	}

}
