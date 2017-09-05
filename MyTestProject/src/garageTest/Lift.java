package garageTest;

public class Lift {

	public Lift() {
		// TODO Auto-generated constructor stub
	}
	
	public synchronized void  doOperation(String name){
		
		System.out.println("doOperation() name:" + name);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
