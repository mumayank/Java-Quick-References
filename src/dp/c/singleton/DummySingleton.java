package dp.c.singleton;

public class DummySingleton {

	private static DummySingleton INSTANCE;	
	private int count;
	
	private DummySingleton() {
		count++;
	}
	
	public synchronized static DummySingleton getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new DummySingleton();
		}
		return INSTANCE;
	}
	
	public int getCount() {
		return count;
	}
}
