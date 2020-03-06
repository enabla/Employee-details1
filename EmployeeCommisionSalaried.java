public class EmployeeCommisionSalaried extends EmployeeCommision{
	private double salary;
	
	public EmployeeCommisionSalaried(String fName, String lName, String idNo, int m, int d, int y, double commisionRate, double sales, double salary){
		super(fName, lName, idNo, m,d,y, commisionRate, sales);
		
		if(salary < 0.0){
			throw new IllegalArgumentException("Salary cannot be negative.");
		}
		this.salary = salary;
	}
	
	public void setSalary(double salary){
		if(salary < 0.0){
			throw new IllegalArgumentException("You cannot assign a negative salary.");
		}
		this.salary = salary;
	}
	
	public double getSalary(){
		return salary;
	}
	
	@Override
	public double getPaymentAmount(){
		return getSalary() + super.getPaymentAmount();
	}
	
	@Override
	public String toString(){
		return String.format("%s%s%n%s: %.2f",
							"Salaried ",super.toString(),
							"Salary",getSalary());
	}
}