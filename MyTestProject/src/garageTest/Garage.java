package garageTest;

import java.util.LinkedList;
import java.util.Queue;

public class Garage {

	Queue<Client> clients = new LinkedList<Client>();
	private Lift lift;
	
	public Garage() {
		// TODO Auto-generated constructor stub
		this.lift = new Lift();
		
		for (int i = 0; i < 5; i++) {
			clients.add(new Client("name"+i, lift));
		}
	}
	
	public void manage(){
		
		while (!clients.isEmpty()) {
			
			Client client = clients.poll();
			System.out.println(client.name);
			
			client.executeDoOperation();
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garage garage = new Garage();
		garage.manage();
	}

}
