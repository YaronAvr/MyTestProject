package garageTest;

public class Client {

	private Lift lift;
	public String name;
	
	public Client(String name,Lift lift) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.lift = lift;
	}
	
	public void executeDoOperation(){
		this.lift.doOperation(name);
	}

}
