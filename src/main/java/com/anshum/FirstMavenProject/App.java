package com.anshum.FirstMavenProject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// creating object of class car 
    	Car car = new Car();
    	car.drive();
    	
    	
    	// creating object of class bike
    	Bike bike = new Bike();
    	bike.drive();
    	
    	// Now if I create a vehicle and make it point to a car or a bike
    	// that would do the same thing
    	Vehicle vehicle = new Car();
    	vehicle.drive();
    }
}
