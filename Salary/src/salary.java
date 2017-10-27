
public class salary {
	private double annual;
	
	public salary(double salary) {
		annual=salary;
	}
	
	public salary() {
		
	}
	
	public void setAnnualSalary(double salary) {
		annual = salary;
	}
		
	public double getAnnualSalary() {
		return annual;
	}
	
	public String toString() {
		return "$" + annual;
	}
}
