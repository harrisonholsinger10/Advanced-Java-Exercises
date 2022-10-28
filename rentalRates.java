import java.util.Scanner;

// Harrison Holsinger

public class rentalRates extends rentalRatesDemo
{
	Scanner scan = new Scanner(System.in);

	double dailyRentalRate = 0;
	double weeklyRentalRate = 0;
	double monthlyRentalRate = 0;
	int days;
	boolean goodDay = false;
	
	public void setDailyRentalRates() 
	{
		System.out.print("Enter the daily rental rate: ");
	    dailyRentalRate = Double.parseDouble(scan.next());
	}
	    
	public void setWeeklyRentalRate()
	{
	    System.out.print("Enter the weekly rental rate: ");
	    weeklyRentalRate = Double.parseDouble(scan.next());
	}
	     
	public void setMonthlyRentalRate()
	{
		System.out.print("Enter the monthly rental rate: ");
	    monthlyRentalRate = Double.parseDouble(scan.next());
	}
	public int setRentalRates()
	{
		while(goodDay == false)
		{
			try
			{
				System.out.print("How many days is the rental? Enter -1 to end the program: ");
				days = Integer.parseInt(scan.next());
				goodDay = true;
			}
			catch(IllegalArgumentException e)
			{
				 System.out.println("Invalid argument type entered.");
				 goodDay = false;
			}
			if(days == -1)
			{
				System.exit(0);
			}
			
			if(days > 90 || days <=0)
			{
				System.out.println("A number 1-90 must be entered.");
				goodDay = false;
			}
			
		}
		return days;
	}
	
	public double getDailyRentalRate()
	{
		return dailyRentalRate;
	}
	
	public double getWeeklyRentalRate()
	{
		return weeklyRentalRate;
	}
	
	public double getMonthlyRentalRate()
	{
		return monthlyRentalRate;
	}
	
	public int getrentalRates()
	{
		return days;
	}
	
	public double getTotal()
	{
		double total = days * dailyRentalRate;
		
		return total;
	}
	
}
