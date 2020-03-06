public class EmployeePieceMeal extends Employee{
	private int carsWashed;
	private double ratePerCar;
	
	public EmployeePieceMeal(String fName, String lName, String idNo, int m, int d, int y, int carsWashed, double ratePerCar){
		super(fName, lName, idNo, m, d, y);
		if(carsWashed < 0){
			throw new IllegalArgumentException("There cannot be negative number of cars.");
		}
		if(ratePerCar < 0.0){
			throw new IllegalArgumentException("The charge of car washing cannot be negative.");
		}
		this.carsWashed = carsWashed;
		this.ratePerCar = ratePerCar;
	}
	
	public void setCarsWashed(int carsWashed){
		if(carsWashed < 0){
			throw new IllegalArgumentException("Number of cars cannot be less than zero.");
		}
		this.carsWashed = carsWashed;
	}
	
	public int getCarsWashed(){
		return carsWashed;
	}
	
	public void setRatePerCar(double ratePerCar){
		if(ratePerCar < 0.0){
			throw new IllegalArgumentException("You cannot charge money a negative figure.");
		}
	}
	
	public double getRatePerCar(){
		return ratePerCar;
	}
	
	@Override
	public double getPaymentAmount(){
		return getCarsWashed() * getRatePerCar();
	}
	
	@Override
	public String toString(){
		return String.format("%s%n%s%n%s: %s%n%s: %.2f%n",
							"Paid per unit work:",super.toString(),
							"Cars Washed",getCarsWashed(),
							"Cost per Car",getRatePerCar());
	}
}