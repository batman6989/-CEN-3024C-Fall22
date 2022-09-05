import java.util.Scanner;

public class CreateLoans {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Loan l[] = new Loan[5];
		double totalOfLoans=0;
		double bizTotal= 0, perTotal= 0;
		
		System.out.print("Enter the current prime interest rate: ");
		double primeRate = s.nextDouble();
		s.nextLine();
		
		for (int i=0;i<5;i++) {
			System.out.print("\nPress 1.Business Loan 2.Personal Loan \n Enter your choice:");
			int choic = s.nextInt(); 
			s.nextLine();
			int loanNum = 101 + i; 
			System.out.print("\nEnter Customer last name:");
			String custLast = s.nextLine();
			System.out.print("\nEnter loan amount:");
			double amount =s.nextDouble();
			System.out.print("\nEnter the loan term (in years):");
			int term = s.nextInt();
			s.nextLine();
			
			if(choic==1) {
				double intRate = primeRate*1.01;
				l[i] = new BusinessLoan(loanNum,custLast,amount,intRate,term);
				double sum = (l[i].amount*l[i].intRate*l[i].term)/100 + l[i].amount;
				bizTotal += sum;
			}
			if(choic==2) {
				double intRate= primeRate*1.02;
				l[i] = new PersonalLoan(loanNum, custLast, amount, intRate, term);
				double sum = (l[i].amount*l[i].intRate*l[i].term)/100 + l[i].amount;
				perTotal += sum;
			}
			
	

		
			
		} 
		for(int i=0;i<5;i++) {		
			System.out.println(l[i].toString());
			double sum = (l[i].amount*l[i].intRate*l[i].term)/100 + l[i].amount;
			totalOfLoans += sum;
			System.out.println("Amount to be payed at due: " + " $ " + sum );
		}
		System.out.println("\n Total amount of Loans JPL has loaned out:" + " $ " + totalOfLoans);
		System.out.println("\n Total amount of Business Loans JPL has loaned out: " + " $ " + bizTotal);
		System.out.println("\n Total amount of Personal Loans JPL has loaned out: " + " $ "+ perTotal);
		
		
		if (l.equals(l))
			System.out.println("There two comparable loans");
		}
	
			
			
		
	}


