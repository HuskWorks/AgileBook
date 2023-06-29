package AffiliationTransactions;

import GeneralTransactions.ChangeEmployeeTransaction;
import PayrollDomain.Affiliation;
import PayrollDomain.Employee;

public abstract class ChangeAffiliationTransaction extends ChangeEmployeeTransaction {
	public ChangeAffiliationTransaction(int empId) {
		super(empId);
	}

	public void Change(Employee e) {
		RecordMembership(e);
		e.SetAffiliation(GetAffiliation());
	}

	abstract void RecordMembership(Employee e);

	abstract Affiliation GetAffiliation();
}
