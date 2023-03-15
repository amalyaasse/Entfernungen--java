package Entfernungen;

public class Entfernungen {

	/**
	 * @param args
	 * @return 
	 */
	public static void main(String[] args) {
		
	
	}
	
	public double kmInMeilen(double km)
	{ 	
		double meilen = km*1.609344;
		return meilen;
	}
	
	
	
	public double meilenInKilometer(double meilen)
	{
		double km = meilen/1.609344;
		return km;
		
	}
	
	

}
