import java.util.Objects;

public abstract class Loan implements LoanConstants 
{
	int loanNum;
	String custLast;
	double amount; 
	double intRate;
	int term;
	
	public Loan (int loanNum, String custLast,double amount, int term) {
		super(); 
		this.loanNum = loanNum; 
		this.custLast = custLast;
		
		if(amount <= LoanConstants.MAX_LOAN){
			this.amount = amount;
		}
		if(amount >LoanConstants.MAX_LOAN) {
			System.out.println("Loan amount can not exceed $" + LoanConstants.MAX_LOAN);
			System.exit(0);
		}
		if(term!=LoanConstants.SHORT_TERM && term!=LoanConstants.MEDUIM_TERM && term!=LoanConstants.LONG_TERM)
			this.term = LoanConstants.SHORT_TERM;
		else 
			this.term =term; 
	}
	
	public String toString(){
		return COMPANY_NAME + "  Loan Number = " + loanNum + "\nCustomer Lastname = " + custLast + "\nPrincipal Amount of the loan = " + " $ " + amount +
				"\nInterest Rate of the loan = "  + intRate +"% "+ "\nTerm = " + term + " Year(s)";
	}
	@Override
	public int hashCode() {
		return Objects.hash(amount, intRate, term);
	}

	@Override
	public boolean equals(Object obj) {
		Loan other = (Loan) obj;
		
		if (amount != other.amount)
			return false;
		if (intRate != other.intRate)
			return false;
		if (term != other.term)
			return false;
			
		return true;
		
		
	}

	
	

}
