public class EmployeeSalaried extends Employee{
	private double weeklySalary;
	private int weeks;
	
	public EmployeeSalaried(String fName, String lName, String idNo, int m, int d, int y, double weeklySalary, int weeks){
		super(fName, lName, idNo, m,d,y);
		if(weeklySalary < 0.0){
			throw new IllegalArgumentException("Salary cannot be negative.");
		}
		if(weeks < 0){
			throw new IllegalArgumentException("Weeks cannot be less than 0.");
		}
		this.weeklySalary = weeklySalary;
		this.weeks = weeks;
	}
	
	public void setWeeklySalary(double weeklySalary){
		if(weeklySalary < 0.0){
			throw new IllegalArgumentException("Salary cannot be negative.");
		}
		this.weeklySalary = weeklySalary;
	}
	
	public double getWeeklySalary(){
		return weeklySalary;
	}
	
	public void setWeeks(int weeks){
		if(weeks < 0){
			throw new IllegalArgumentException("Weeks cannot be negative.");
		}
	}
	
	public int getWeeks(){
		return weeks;
	}
	
	@Override
	public double getPaymentAmount(){
		return getWeeklySalary()*getWeeks();
	}
	
	@Override
	public String toString(){
		return String.format("Salaried Employee:%n%s%nWeekly Salary: %.2f%nWorked for:%d weeks",super.toString(),getWeeklySalary(),getWeeks());
	}
}