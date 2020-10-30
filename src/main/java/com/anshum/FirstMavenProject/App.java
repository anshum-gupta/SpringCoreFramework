package com.anshum.firstMavenProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	
    public static void main( String[] args ) {
    	
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
    	
    	
    	// rather than changing the source code
    	// why don't we get the context from an xml file
    	// in that xml file, we can specify if it is a car or a bike
    	// the advantage is that we don't have to modify source code
    	// so we don't have to recompile it
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	Vehicle vehicleObjectUsingBeanId = (Vehicle) context.getBean("vehicle");
    	vehicleObjectUsingBeanId.drive();
    	
    	
    	Vehicle vehicleObjectUsingComponent = (Vehicle) context.getBean("car");
    	vehicleObjectUsingComponent.drive();
    	
    	
    	// using property tag from spring.xml file
    	// since property tag is being used, value is set using the "setter"
    	
    	Tyre tyre = (Tyre) context.getBean("tyre");
    	System.out.println(tyre);
    	
    }
    
}
