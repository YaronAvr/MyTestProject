package garageTest;

public class Lift {

	private long id;
	
	
	public Lift(long id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lift other = (Lift) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
