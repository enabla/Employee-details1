public class EmployeeCommision extends Employee{
	private double commisionRate;
	public double sales;
	
	public EmployeeCommision(String fName, String lName, String idNo, int m, int d, int y, double commisionRate, double sales){
		super(fName, lName, idNo, m,d,y);
		
		if(commisionRate < 0.0 || commisionRate > 1.0){
			throw new IllegalArgumentException("The commision rate must lie between 0 - 100 percent.");
		}
		if(sales < 0.0){
			throw new IllegalArgumentException("Sales cannot be negative.");
		}
		
		this.commisionRate = commisionRate;
		this.sales = sales;
	}
	
	public void setCommisionRate(double commisionRate){
		if(commisionRate < 0.0 || commisionRate > 1.0){
			throw new IllegalArgumentException("Commision has to lie between 0 and 100 percent.");
		}
		this.commisionRate = commisionRate;
	}
	
	public double getCommisionRate(){
		return commisionRate;
	}
	
	public void setSales(double sales){
		if(sales < 0.0){
			throw new IllegalArgumentException("Sales cannot be negative.");
		}
		this.sales = sales;
	}
	
	public double getSales(){
		return sales;
	}
	
	@Override
	public double getPaymentAmount(){
		return getSales()*getCommisionRate();
	}
	
	@Override
	public String toString(){
		return String.format("Commisioned Employee:%n%s%n%s: %.2f %s%n%s: %.2f",
							super.toString(),
							"Commision",100*getCommisionRate(),"percent",
							"Total Sales",getSales());
	}
}