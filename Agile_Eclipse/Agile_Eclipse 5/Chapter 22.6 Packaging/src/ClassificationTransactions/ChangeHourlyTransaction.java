package ClassificationTransactions;

import Classifications.HourlyClassification;
import PayrollDomain.PaymentClassification;
import PayrollDomain.PaymentSchedule;
import Schedules.WeeklySchedule;

public class ChangeHourlyTransaction extends ChangeClassificationTransaction {
	private double itsRate;

	public ChangeHourlyTransaction(int empId, double rate) {
		super(empId);
		itsRate = rate;
	}

	PaymentSchedule GetSchedule() {
		return new WeeklySchedule();
	}

	PaymentClassification GetClassification() {
		return new HourlyClassification(itsRate);
	}
}
