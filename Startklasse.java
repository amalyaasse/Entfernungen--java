package Entfernungen;

import java.util.Scanner;

public class Startklasse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner einleser = new Scanner(System.in);
		
		
		Entfernungen entfernungen = new Entfernungen();
		Temperaturrechner temp = new Temperaturrechner();
		
		System.out.println("geben Sie Anzahl der km an:");
		double km = einleser.nextDouble();
		System.out.println(km+" km in meilen sind:" + entfernungen.kmInMeilen(km));
		
		System.out.println("---------------------------------------------------------");
		System.out.println(" und jetzt geben Sie Anzahl der meilen an : ");
		double meilen = einleser.nextDouble();
		System.out.println(meilen+" meilen in km sind:" +entfernungen.meilenInKilometer(meilen));
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("Die Temperatur in Celsius eingeben: ");
		double celsius = einleser.nextDouble();
		System.out.println("Die Temperatur in Fahrenheit ist: "+temp.celsiusInFahrenheit(celsius));
		
		
	}

}
