package ClassificationTransactions;

import GeneralTransactions.ChangeEmployeeTransaction;
import PayrollDomain.Employee;
import PayrollDomain.PaymentClassification;
import PayrollDomain.PaymentSchedule;

public abstract class ChangeClassificationTransaction extends ChangeEmployeeTransaction {
	public ChangeClassificationTransaction(int empId) {
		super(empId);
	}

	public void Change(Employee e) {
		e.SetSchedule(GetSchedule());
		e.SetClassification(GetClassification());
	}

	abstract PaymentSchedule GetSchedule();

	abstract PaymentClassification GetClassification();
}
