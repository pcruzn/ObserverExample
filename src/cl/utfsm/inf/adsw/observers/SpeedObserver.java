package cl.utfsm.inf.adsw.observers;

import java.util.Observable;
import java.util.Observer;

import cl.utfsm.inf.adsw.observables.SpeedMeter;

public class SpeedObserver implements Observer {

	// the "observer" class implements the update() method
	@Override
	public void update(Observable speedMeter, Object arg) {
		SpeedMeter spMeter = (SpeedMeter) speedMeter;
		
		// in this example, the update method shows a warning if speed limit (99 km/h) is exceeded
		if (spMeter.getActualSpeed() > 99)
			System.out.println ("Speed limit exceeded: " + spMeter.getActualSpeed());
	}

}
