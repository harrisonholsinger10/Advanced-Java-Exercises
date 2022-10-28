public class TestScores
{
    private double[] scores;
    double total = 0.0;
 
    public TestScores(double array[])
    {
        for (int i = 0; i < array.length; i++)
        {
            scores = new double[array.length];
            if (array[i] < 0 || array[i] > 100)
            {
                throw new IllegalArgumentException("Bad scores" + "\n\tInvalid score found." + "\n\tElement: " 
            + i + " Score: " + array[i]);
            }
            else
            {
                scores[i] = array[i];
                total += array[i];
            }
        }
    }
 
    public double getAverage()
    {
   
        double average = (total / scores.length);
        
        return average;
    }
}
 
