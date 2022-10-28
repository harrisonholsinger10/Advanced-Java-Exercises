// Harrison Holsinger

public class rentalRatesDemo 
{

	public static void main(String[] args) 
	{		
		rentalRates renter = new rentalRates();
		
		try 
		{
			renter.setDailyRentalRates();
		}
		catch(IllegalArgumentException e)
		{
			 System.out.println("Invalid argument type entered.");	
		}
	
		try 
		{
			renter.setWeeklyRentalRate();
		}
		catch(IllegalArgumentException e)
		{
			 System.out.println("Invalid argument type entered.");	
		}
		
		try 
		{
			renter.setMonthlyRentalRate();
		}
		catch(IllegalArgumentException e)
		{
			 System.out.println("Invalid argument type entered.");
		}
		
		renter.setRentalRates();
		
		System.out.println(renter.getTotal());
	 
	}

}
