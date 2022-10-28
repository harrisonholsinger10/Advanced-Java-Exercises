import java.util.Scanner;

public class TestScoresDemo
{
    public static void main(String[] args) throws Exception
    {
    	int score = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of test scores: ");
        score = scan.nextInt();

        double[] scoreArray = new double[score];

        for (int i = 0; i <= score - 1; i++)
        {    
            System.out.print("Enter test score " + (i + 1)+ ":");
            scoreArray[i] = scan.nextDouble();  
            if(scoreArray[i] > 0 && scoreArray[i] < 100)
            {
            	
            }
            else
            {
            	System.out.println("Test scores must have a value less than 100 and greater than 0.");
            }
        }  

       TestScores TestScore = new TestScores(scoreArray);
       System.out.print(TestScore.getAverage());
        
        scan.close();
        
    }
}