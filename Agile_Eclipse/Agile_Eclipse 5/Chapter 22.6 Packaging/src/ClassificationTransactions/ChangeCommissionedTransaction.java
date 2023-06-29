package ClassificationTransactions;

import Classifications.CommissionedClassification;
import PayrollDomain.PaymentClassification;
import PayrollDomain.PaymentSchedule;
import Schedules.BiweeklySchedule;

public class ChangeCommissionedTransaction extends ChangeClassificationTransaction {
	private double itsSalary;
	private double itsHourlyRate;

	public ChangeCommissionedTransaction(int empId, double salary, double hourlyRate) {
		super(empId);
		itsSalary = salary;
		itsHourlyRate = hourlyRate;
	}

	PaymentSchedule GetSchedule() {
		return new BiweeklySchedule();
	}

	PaymentClassification GetClassification() {
		return new CommissionedClassification(itsSalary, itsHourlyRate);
	}
}