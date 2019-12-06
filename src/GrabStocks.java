
public class GrabStocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockGrabber stockGrabber = new StockGrabber();

		StockObserver observer1 = new StockObserver(stockGrabber);

		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setAAPLPrice(677.00);

		stockGrabber.setGOOGPrice(676.40);

	}

}
