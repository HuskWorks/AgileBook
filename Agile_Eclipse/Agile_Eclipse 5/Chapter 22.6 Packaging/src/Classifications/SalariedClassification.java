package Classifications;

import PayrollDomain.Paycheck;
import PayrollDomain.PaymentClassification;

public class SalariedClassification implements PaymentClassification {
	private double itsSalary;

	public SalariedClassification(double salary) {
		itsSalary = salary;
	}

	public double GetSalary() {
		return itsSalary;
	}

	public double CalculatePay(Paycheck pc) {
		return itsSalary;
	}
}
