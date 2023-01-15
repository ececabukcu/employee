package employee;

public class BasePlusCommissionEmployeeTest5 {
	
	public static void main (String [] args) {
		
		BasePlusCommissionEmployee5 employee5 = 
				new BasePlusCommissionEmployee5("Ece","Çabukçu",
						"777-777-777", 20000, .04, 300);
		
		employee5.setBaseSalary(1000);
		
		System.out.printf("\n%s:\n\n%s\n",
				"updated employee information obtained by toString",
				employee5.toString());
		
	}

}
