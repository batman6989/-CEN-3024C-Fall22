
public class PersonalLoan extends Loan {
	public PersonalLoan(int loanNum, String custLast, double amount, double intRate, int term) {
		super(loanNum, custLast,amount,term);
		this.intRate = intRate;
	}
}