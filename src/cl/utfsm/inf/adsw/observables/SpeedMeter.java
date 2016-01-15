package cl.utfsm.inf.adsw.observables;

import java.util.Observable;

// this is the observable class (in other words, the class being observed by the observers)
public class SpeedMeter extends Observable {
	
	private int actualSpeed;
	
	public void setActualSpeed (int speed) {
		actualSpeed = speed;
		
		// when a new speed is set, confirm change and notify observers
		setChanged();
		notifyObservers();
	}
	
	public int getActualSpeed () {
		return actualSpeed;
	}

}
