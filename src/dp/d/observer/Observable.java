package dp.d.observer;

import java.util.ArrayList;

public class Observable {
	
	public static void main(String args[]) {
		ArrayList<Event> events = new ArrayList<>();
		Event eventA = new ObserverA();
		Event eventB = new ObserverB();
		events.add(eventA);
		events.add(eventB);
		
		for (Event event : events) {
			event.printYourName();
		}
	}

}
