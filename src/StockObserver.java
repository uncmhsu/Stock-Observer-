
public class StockObserver implements Observer {
	private double ibmPrice;
	private double aaplPrice;
	private double googlePrice;

	private static int observerIDTracker = 0;

	private int observerID;

	private Subject stockGrabber;

	public StockObserver(Subject stockGrabber) {
		this.stockGrabber = stockGrabber;
		this.observerID = ++observerIDTracker;

		System.out.println("New Observer " + this.observerID);
		stockGrabber.register(this);
	}

	@Override
	public void update(double ibmPrice, double aaplPrice, double googPrice) {
		// TODO Auto-generated method stub
		this.ibmPrice = ibmPrice;
		this.aaplPrice = aaplPrice;
		this.googlePrice = googPrice;

		printThePrices();

	}

	private void printThePrices() {
		// TODO Auto-generated method stub
		System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAAPL: " + aaplPrice + "\nGOOG: " + googPrice + "\n");
	}

}
