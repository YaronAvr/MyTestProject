package garageTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;


public class Garage {

	
	protected  Set<Lift> lifts;
	protected Set<Vehicle> vehicles;
	private Semaphore sem;
	private final int  maxLift;
	private final int maxVehicle;
	
	
	private final Object lock;
	
	public Garage() {
		// TODO Auto-generated constructor stub
		
		this.lock = new Object();
		this.maxLift = 2;
		this.maxVehicle = 10;
		this.sem = new Semaphore(maxLift);
		this.lifts = new HashSet<Lift>();
		
		for (int i = 0; i < maxLift; i++) {
			
			lifts.add(new Lift(i));
		}
		
		this.vehicles = new HashSet<Vehicle>();
		
		for (int i = 1; i <= 5; i++) {
			
			this.vehicles.add(new Car(i));
			this.vehicles.add(new Bus(i+5));
		}
		
		
	}
	
	public void manage(){
		
		ExecutorService executor = Executors.newFixedThreadPool(maxVehicle);
		for (Iterator iterator = vehicles.iterator(); iterator.hasNext();) {
			final Vehicle vehicle = (Vehicle) iterator.next();
			
			executor.submit(new Thread(){
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					doRun(vehicle);
				}
			});
			
			
			
		}
		
		executor.shutdown();
		
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doRun(Vehicle vehicle){
		
		try {
			sem.acquire();
			
			
			
			System.out.println(vehicle.toString());
			Thread.currentThread().sleep(2000);
			
			
		
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			sem.release();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garage garage = new Garage();
		garage.manage();
	}

}
