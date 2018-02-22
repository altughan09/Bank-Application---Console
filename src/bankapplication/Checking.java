package bankapplication;

public class Checking extends Account {
			
			private int debitCardNumber;
			private int debitCardPIN;
	
			public Checking( final String name, final String sSn, final double initDeposit) {
				super(name, sSn, initDeposit);
				accountNumber = "2" + accountNumber;
				
				setDebitCard();
			}
			
			private void setDebitCard() {
				debitCardNumber =(int)(Math.random()*Math.pow(10, 12));
				debitCardPIN = (int)(Math.random()*Math.pow(10, 4));
				
			}
			
			@Override
			public void showInfo() {
				super.showInfo();
				System.out.println("YOUR CHECKING ACCOUNT FEATURES: " +
						"\n Debit Card Number: " +debitCardNumber+
						"\n Debit Card PIN: " + debitCardPIN 								
						);
				
			}

			@Override
			public void setRate() {
					rate = getBaseRate() * .15;
			}
}
