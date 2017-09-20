package dp.c.singleton;

public class Test {
	public static void main(String args[]) {
		System.out.println(DummySingleton.getInstance().getCount());
		System.out.println(DummySingleton.getInstance().getCount());
		System.out.println(DummySingleton.getInstance().getCount());
	}
}
