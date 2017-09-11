package garageTest;

public abstract class Vehicle {

	float weight;
	long num;
	User user;
	Report report;
	
	
	
	public abstract int hashCode();
	public abstract boolean equals(Object arg0);
	public abstract String toString();

	
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public long getNum() {
		return num;
	}
	public void setNum(long num) {
		this.num = num;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Report getReport() {
		return report;
	}
	public void setReport(Report report) {
		this.report = report;
	}
	
	
	

}
