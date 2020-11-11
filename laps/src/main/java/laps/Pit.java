package laps;

import java.util.Random;

public class Pit  {
	
	
	private Random random = new Random(System.currentTimeMillis());
	
	public synchronized long pitStop() throws InterruptedException {
		
		// takes between 4-5 seconds
		long duration = Math.abs((this.random.nextLong()) % 4000)  + 1000;
		Thread.sleep(duration);
		
		return duration;
		
		
		
	}

}
