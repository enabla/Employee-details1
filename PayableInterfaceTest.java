public class PayableInterfaceTest{
	public static void main(String[] args){
		Payable[] payments = new Payable[4];
		
		payments[0] = new Invoice("Toyota","R4 2353",218,2000000);
		payments[1] = new Invoice("Dell","d560",3214,75000);
		payments[2] = new EmployeeSalaried("John","Mutua","147624",58000,17);
		payments[3] = new EmployeeSalaried("Flashia","Wanjiku","34856",52000,16);
		
		System.out.println("Invoices and Employees payments processed polymorphically:");
		for(Payable payment: payments){
			System.out.printf("%n%s %n%s: %.2f%n",
								payment.toString(),
								"AmountDue",
								payment.getPaymentAmount());
		}
	}
}