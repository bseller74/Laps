package laps;

import java.util.Random;

public class Car implements Runnable {
	
	
	private String name;
	private Race race;
	private Pit pit;
	private Random random = new Random(System.currentTimeMillis());
	
	public Car(String name, Race race, Pit pit) {
		this.name = name;
		this.race = race;
		this.pit = pit;
	}
	
	public long runLap() throws InterruptedException {
		long duration = Math.abs((this.random.nextLong()))% 5000  + 3000;
		Thread.sleep(duration);
		return duration;
	}
	
	
	public void run() {
	
		try {
			this.race.getReadyToRace();
			System.out.println(this.name + " is off!");
			
			for(int i =1; i <=3; i++) {
				long time = this.runLap();
				System.out.println(name + " completes lap " + "in " + (double)time/(double)1000.00 + " seconds");
				
				time = this.pit.pitStop();
				System.out.println(name + " stops at pit for " + (double)time/(double)1000.00 + " seconds");
				
				long time2 = this.runLap();
				System.out.println(name + " completes lap " + "in " + (double)time2/(double)1000.00 + " seconds");
				
				// its in seconds for visual
 			}
			
			int place = this.race.crossFinishLine();
			System.out.println("******* " + name + " finished in position " + place + " *******");
			
		
		}catch(InterruptedException e){
			System.out.println(name + "got a flat or crashed");
		}
		
		
		
		
	}






}
