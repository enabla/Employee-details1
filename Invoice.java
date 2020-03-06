public class Invoice implements Payable{
	private final String partNumber;
	private final String partDescription;
	private int quantity;
	private double pricePerItem;
	
	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem){
		if(quantity < 0.0){
			throw new IllegalArgumentException("The number of items cannot be negative.");
		}
		if(pricePerItem < 0.0){
			throw new IllegalArgumentException("Price cannot be negative.");
		}
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}
	
	public String getPartNumber(){
		return partNumber;
	}
	
	public String getPartDescription(){
		return partDescription;
	}
	
	public void setQuantity(int quantity){
		if(quantity < 0.0){
			throw new IllegalArgumentException("There can be no negative number of itmes");
		}
		this.quantity = quantity;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public void setPricePerItem(double pricePerItem){
		if(pricePerItem < 0.0){
			throw new IllegalArgumentException("Price cannot be less than 0.");
		}
		this.pricePerItem = pricePerItem;
	}
	
	public double getPricePerItem(){
		return pricePerItem;
	}
	
	@Override
	public double getPaymentAmount(){
		return getPricePerItem() * getQuantity();
	}
	
	@Override
	public String toString(){
		return String.format("Invoice:%n%s: %s%n%s: %s%n%s: %.2f%n%s: %d",
							"Part Number",getPartNumber(),
							"Description",getPartDescription(),
							"Price Per Item",getPricePerItem(),
							"Quantity",getQuantity());
	}
}