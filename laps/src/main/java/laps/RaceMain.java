package laps;

public class RaceMain {
	
	public static void main(String[] args) throws InterruptedException{
		
		Race race = new Race();
		Pit pit = new Pit();
		
		new Thread(new Car("Ford Mustang Shelby",race,pit)).start();
		new Thread(new Car("Dodge Viper",race,pit)).start();
		new Thread(new Car("Hennessey Venom",race,pit)).start();
		new Thread(new Car("Tesla Roadster",race,pit)).start();
		new Thread(new Car("Toyota Corolla Hybrid",race,pit)).start();
		
		
		System.out.print("Get Ready ....");
		Thread.sleep(2000);
		
		System.out.print("Get Set ....");
		Thread.sleep(2000);
		
		System.out.print("GO GO GO");
		System.out.println("");
		race.startRace();
		
	}

}
