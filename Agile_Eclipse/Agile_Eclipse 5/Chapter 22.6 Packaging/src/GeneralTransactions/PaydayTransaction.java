package GeneralTransactions;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Affiliations.PaycheckImplementation;
import PayrollDatabase.GlobalDatabase;
import PayrollDomain.Employee;
import PayrollDomain.Paycheck;
import TransactionApplication.Transaction;

public class PaydayTransaction implements Transaction {
	private Calendar itsPayDate;
	private Map<Integer, Paycheck> itsPaychecks = new HashMap<Integer, Paycheck>();

	public PaydayTransaction(Calendar payDate) {
		itsPayDate = payDate;
	}

	public void Execute() {
		List<Integer> empIds = GlobalDatabase.payrollDB.GetAllEmployeeIds();
		for (int empId : empIds) {
			Employee e = GlobalDatabase.payrollDB.GetEmployee(empId);
			if (e.IsPayDate(itsPayDate)) {
				Paycheck pc = new PaycheckImplementation(e.GetPayPeriodStartDate(itsPayDate),
						itsPayDate);
				itsPaychecks.put(empId, pc);
				e.Payday(pc);
			}
		}
	}

	public Paycheck GetPaycheck(int empId) {
		return itsPaychecks.get(empId);
	}
}
