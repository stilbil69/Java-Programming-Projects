//Filename DemoCabinRental.java
//Written by William Bartel
//Written on 09/29/2016

public class DemoCabinRental
{
   public static void main(String[] args)
   {
      // Creating objects and setting data values for different cabin numbers
	   CabinRental cabin1 = new CabinRental(1);
		CabinRental cabin2 = new CabinRental(4);
		HolidayCabinRental cabin3 = new HolidayCabinRental(1, 1234);
		HolidayCabinRental cabin4 = new HolidayCabinRental(4, 5678);
		
      // Output displaying cabin number, weekly rate, room number values
		System.out.println("Cabin Number 1");
		System.out.println(" Cabin number: " + cabin1.getCabinNumber());
		System.out.println(" Weekly rate: $" + cabin1.getWeeklyRate());
		System.out.println();
		
		System.out.println("Cabin Number 2");
		System.out.println(" Cabin number: " + cabin2.getCabinNumber());
		System.out.println(" Weekly rate: $" + cabin2.getWeeklyRate());
		System.out.println();
		
		System.out.println("Cabin Number 3");
		System.out.println(" Cabin number: " + cabin3.getCabinNumber());		
		System.out.println(" Weekly rate: $" + cabin3.getWeeklyRate());
		System.out.println();
		
		System.out.println("Cabin Number 4");
		System.out.println(" Cabin number: " + cabin4.getCabinNumber());
		System.out.println(" Room number: " + cabin4.getRoomNumber());
		System.out.println(" Weekly rate: $" + cabin4.getWeeklyRate());
		System.out.println();
	}
}