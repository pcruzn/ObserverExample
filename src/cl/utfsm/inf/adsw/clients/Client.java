package cl.utfsm.inf.adsw.clients;

import java.util.Random;
import cl.utfsm.inf.adsw.observables.SpeedMeter;
import cl.utfsm.inf.adsw.observers.SpeedObserver;

public class Client {
	
	public static void main (String args[]) {
		
		Random rSpeed = new Random();
		int actualSpeed;
		
		// create the observable and the observer objects, then...
		SpeedMeter testSpeedMeter = new SpeedMeter ();
		SpeedObserver testSpeedObserver = new SpeedObserver ();
		
		// ... add the observer to the observable (can be one or more)
		testSpeedMeter.addObserver(testSpeedObserver);
		
		while (true) {
			// for this example, the speed of the bus is randomly generated between 
			// 90 an 103 km/h
			actualSpeed = rSpeed.nextInt((103 - 90) + 1) + 90;
			
			System.out.println (actualSpeed);
			
			// a warning is shown if speed is above 99 km/h
			testSpeedMeter.setActualSpeed(actualSpeed);
			
			// try again after 2 seconds
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
}
