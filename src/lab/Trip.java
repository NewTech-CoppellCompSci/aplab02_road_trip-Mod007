package lab;

/*
 * Create a class so that when this code is ran,
 * you will get the following.
 * 
 * Stop #1
 *    358.4
 *    18.4
 *    19.5
 * 
 * Stop #2
 *    574.2
 *    30.9
 *    18.6
 * 
 * Trip: Maryland 2022
 *    Distance:  995.7
 *    Fuel Used: 55.2
 *    MPG:       18.0
 * 
 */



public class Trip {

	public static void main(String[] args) {
		
		/*
		 * Constructor assumes this is the start of a trip
		 * All variables should be initialized accordingly
		 */
		RoadTripLog trip = new RoadTripLog("Maryland 2022");
		
		trip.addDistance(358.4);
		trip.addFuel(18.4);
		
		System.out.println("Stop #1");
		System.out.println("   " + trip.getTotalDistance());
		System.out.println("   " + trip.getTotalFuel());
		System.out.println("   " + trip.getMPG() + "\n");
		
		
		trip.addDistance(215.8);
		trip.addFuel(12.5);
		
		System.out.println("Stop #2");
		System.out.println("   " + trip.getTotalDistance());
		System.out.println("   " + trip.getTotalFuel());
		System.out.println("   " + trip.getMPG() + "\n");
		
		trip.addDistance(312.9);
		trip.addFuel(16.8);
		
		trip.addDistance(108.6);
		trip.addFuel(7.5);
		
		System.out.println(trip);
		
	}
	
	
}
