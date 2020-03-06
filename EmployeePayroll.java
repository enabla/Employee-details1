public class EmployeePayRoll{
	public static void main(String[] args){
		EmployeeSalaried jack = new EmployeeSalaried("Jack","Maina","20768934",3,5,1989,2800.0,16000);
		EmployeeCasual mwai = new EmployeeCasual("Mwai","Mwangi","1057683",5,8,1997,72,350);
		EmployeeCommision tito = new EmployeeCommision("Tito","Okello","12785432",3,10,1983,0.05,4000000);
		EmployeeCommisionSalaried juliet = new EmployeeCommisionSalaried("Juliet","Wangui","47895613",11,14,1990,0.05,8000000,230000);
		EmployeePieceMeal symo = new EmployeePieceMeal("Simon","Warui","21901367",7,4,1979,5267,550.0);
		
		System.out.printf("%n%n%s%n","Employees' Salaries Processed Individually:");
		
		System.out.printf("%s%n%s: %.2f%n%n",jack, "Earned", jack.getPaymentAmount());
		System.out.printf("%s%n%s: %.2f%n%n",mwai, "Earned", mwai.getPaymentAmount());
		System.out.printf("%s%n%s: %.2f%n%n",tito, "Earned", tito.getPaymentAmount());
		System.out.printf("%s%n%s: %.2f%n%n",juliet, "Earned", juliet.getPaymentAmount());
		
		Employee[] marketing = new Employee[5];
		
		marketing[0] = jack;
		marketing[1] = mwai;
		marketing[2] = tito;
		marketing[3] = juliet;
		marketing[4] = symo;
		
		System.out.printf("%n%n%s%n","Employees' Salaries Processed Polymorphically:");
		
		for(Employee currentEmployee : marketing){
			System.out.println(currentEmployee);
			int m = 0;
			if(currentEmployee instanceof EmployeeCommisionSalaried){
				EmployeeCommisionSalaried salesMan = (EmployeeCommisionSalaried) currentEmployee;
				
				salesMan.setSalary(1.10*salesMan.getSalary());
				
				System.out.printf("%s's salary after 10%% increase is %.2f%n",salesMan.getFName(),salesMan.getSalary());
			}
			
			if(currentEmployee.getX() == 7){
				m+= 30000;
			}
			System.out.printf("Now Earns: %s%n%n", currentEmployee.getPaymentAmount()+m);
		}
		
		for(int i = 0; i < marketing.length; i++){
			System.out.printf("Employee %d is an %s.%n",i+1, marketing[i].getClass().getName());
		}
	}
}