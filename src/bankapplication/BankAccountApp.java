package bankapplication;

import java.util.List;

public class BankAccountApp {

	public static void main( final String[] args) {
				
			 String file = "C:\\Users\\Altug\\Desktop\\NewBankAccounts.csv";
		
		
			/*
		
			  Checking chkacc1 = new Checking("Tom Wilson", "322423322", 1500);
			  Savings savacc1 = new Savings("John Dole", "221122113", 1400);		
			 
			 savacc1.showInfo();
			 System.out.println("*****************************");
			 chkacc1.showInfo();
			 
			 */
		
			
			 List<String[ ]> newAccountHolders = utilities.CSV.read(file);
			for (final String [ ] accountHolder : newAccountHolders) {
				System.out.println("NEW ACCOUNT: ");
				System.out.println(accountHolder[0]);
				System.out.println(accountHolder[1]);
				System.out.println(accountHolder[2]);
				System.out.println(accountHolder[3]);
				
			}
		
		
	}

}
