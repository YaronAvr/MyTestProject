package garageTest;

public class Bus extends Vehicle{

	public Bus(long num) {
		// TODO Auto-generated constructor stub
		this.num = num;
		
	}
	
	public void doOpenDoor() {
		// TODO Auto-generated method stub
		System.out.println("Bus Open Door");
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (num ^ (num >>> 32));
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
		Car other = (Car) obj;
		if (num != other.num)
			return false;
		return true;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Bus: " + this.num;
	}

	


}
