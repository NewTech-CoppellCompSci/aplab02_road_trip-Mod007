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

//mpg is DELTA-miles/DELTA-gallons for that stop

public class RoadTripLog {
	
	private String tripname;
	private double totaldistance;
	private double totalfuel;
	private double mpg;

	public RoadTripLog(String nameTrip) {
		tripname = nameTrip;
		totaldistance = 0;
		totalfuel = 0;
		mpg = 0;
	}
	
	public void addDistance(double addedDist) {
		totaldistance += addedDist;
	}
	
	public void addFuel(double addedFuel) {
		totalfuel += addedFuel;
	}
	
	public double getMPG() {
		mpg = totaldistance/totalfuel;
		mpg = Math.round(mpg*10);
		mpg = mpg/10;
		return mpg;
	}
	
	public double getTotalFuel() {
		return totalfuel;
	}
	
	public double getTotalDistance() {
		return totaldistance;
	}
	
	public String toString() {
		return "Trip: "+tripname+"\n   Distance: "+totaldistance+"\n   Fuel Used: "+totalfuel+"\n   MPG: "+getMPG();
	}
	
	
	
}
