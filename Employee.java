public abstract class Employee implements Payable{
	private final String fName;
	private final String lName;
	private final String idNo;
	private final int x;
	private final int y;
	private final int z;
	private final TimeDate dob;
	
	public Employee(String fName, String lName, String idNo, int m, int d, int y){
		this.fName = fName;
		this.lName = lName;
		this.idNo = idNo;
		this.x = m;
		this.y = d;
		this.z = y;
		dob = new TimeDate(m,d,y);
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public int getZ(){
		return z;
	}
	
	
	public String getFName(){
		return fName;
	}
	
	public String getLName(){
		return lName;
	}
	
	public String getIdNo(){
		return idNo;
	}
	
	@Override
	public String toString(){
		return String.format("%s %s%nId Number: %s%nDate of Birth: %s", getFName(), getLName(), getIdNo(), dob);
	}
	
	//public abstract double earnings();
}