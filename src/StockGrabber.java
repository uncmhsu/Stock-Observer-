import java.util.ArrayList;

public class StockGrabber implements Subject {
	private ArrayList<ObserverI> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;

	@SuppressWarnings("deprecation")
	public StockGrabber() {
		observers = new ArrayList<ObserverI>();
	}

	@Override
	public void register(ObserverI o) {
		// TODO Auto-generated method stub
		observers.add(o);

	}

	@Override
	public void unregister(ObserverI o) {
		// TODO Auto-generated method stub
		int observerIndex = observers.indexOf(o);
		System.out.println("ObserverI " + (observerIndex + 1) + " deleted");
		observers.remove(observerIndex);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (ObserverI o : observers) {
			o.update(ibmPrice, aaplPrice, googPrice);
		}
	}

	public void setIBMPrice(double newIBMPrice) {
		this.ibmPrice = newIBMPrice;
		notifyObserver();
	}

	public void setAAPLPrice(double newAAPLPrice) {
		this.aaplPrice = newAAPLPrice;
		notifyObserver();
	}

	public void setGOOGPrice(double newGOOGPrice) {
		this.googPrice = newGOOGPrice;
		notifyObserver();
	}
}
