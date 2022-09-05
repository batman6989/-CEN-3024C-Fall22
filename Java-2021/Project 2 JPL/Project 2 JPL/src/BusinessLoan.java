
public class BusinessLoan extends Loan {
	public BusinessLoan(int loanNum, String custLast, double amount, double intRate, int term) {
		super(loanNum, custLast,amount,term);
		this.intRate = intRate;
	}
}
