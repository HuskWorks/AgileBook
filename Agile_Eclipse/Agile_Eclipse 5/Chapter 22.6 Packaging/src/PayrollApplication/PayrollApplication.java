package PayrollApplication;

import TextParserTransactionSource.TextParserTransactionSource;
import TransactionApplication.TransactionApplication;
import TransactionApplication.TransactionSource;

public class PayrollApplication extends TransactionApplication {
	private TransactionSource transactionSource;

	public PayrollApplication() {
		transactionSource = new TextParserTransactionSource();
	}

	public void SetSource(String source) {
		transactionSource.SetSource(source);
		transactionSource.Execute();
	}
}
