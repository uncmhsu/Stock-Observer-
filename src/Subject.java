public interface Subject {
	public void register(ObserverI o);

	public void unregister(ObserverI o);

	public void notifyObserver();
}
