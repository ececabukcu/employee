package employee;

public class BasePlusCommissionEmployee5 extends CommissionEmployee4 {
	
	private double baseSalary;
	
	public BasePlusCommissionEmployee5(String first, String last, String ssn, double sales, double rate, double salary) {
		super(first, last, ssn, sales, rate);
		setBaseSalary(salary);
	}
	
	public void setBaseSalary(double salary) {
		baseSalary = (salary < 0.0 ) ? 0.0 : salary;
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}
	
	public double earnings() {
		return getBaseSalary() + super.earnings();
	}
	
	public String toString() {
		return String.format("%s %s\n%s: %.2f", "base-salaried",
				super.toString(), "base salary",
				getBaseSalary());
	}
	
}
