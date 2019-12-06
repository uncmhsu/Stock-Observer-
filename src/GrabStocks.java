
public class GrabStocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockGrabber stockGrabber = new StockGrabber();

		StockObserver observer1 = new StockObserver(stockGrabber);

		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setAAPLPrice(677.00);

		stockGrabber.setGOOGPrice(676.40);

		Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
		Runnable getAAPL = new GetTheStock(stockGrabber, 2, "AAPL", 667.60);

		Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 676.40);

		new Thread(getIBM).start();
		new Thread(getAAPL).start();
		new Thread(getGOOG).start();

	}

}
