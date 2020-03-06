public class EmployeeCasual extends Employee{
	private double hours;
	private double hourlyRate;
	
	public EmployeeCasual(String fName, String lName, String idNo, int m, int d, int y, double hours, double hourlyRate){
		super(fName, lName, idNo, m,d,y);
		if(hours < 0.0 || hours > 168.0){
			throw new IllegalArgumentException("There are 0 - 168 hours per week.");
		}
		if(hourlyRate < 0.0){
			throw new IllegalArgumentException("Hourly pay cannot be negative.");
		}
		this.hours = hours;
		this.hourlyRate = hourlyRate;
	}
	
	public void setHours(double hours){
		if(hours < 0.0 || hours > 168){
			throw new IllegalArgumentException("Weekly hours range from 0 - 168.");
		}
		this.hours = hours;
	}
	
	public double getHours(){
		return hours;
	}
	
	public void setHourlyRate(double hourlyRate){
		if(hourlyRate < 0.0){
			throw new IllegalArgumentException("The hourly rate cannot be negative.");
		}
	}
	
	public double getHourlyRate(){
		return hourlyRate;
	}
	
	@Override
	public double getPaymentAmount(){
		return getHours() > 40? ((getHourlyRate()*40)+(getHourlyRate()*(getHours()-40)*1.5)) : (getHourlyRate()*getHours());
	}
	
	@Override
	public String toString(){
		return String.format("Casual Employee:%n%s%n%s: %.2f%n%s %.2f",
							super.toString(),
							"Hourly Payment",getHourlyRate(),
							"Worked for",getHours(),"hours");
	}
}