package bankapplication;

public class Savings extends Account {
		
		private int safetyDepositBoxID;
		private int safetyDepositBoxKey;
	
		public Savings(final String name, final String sSn, final double initDeposit) {
				super(name, sSn, initDeposit);
				accountNumber = "1" + accountNumber;
				setSafetyDepositBox();
			
		}
		private void setSafetyDepositBox() {
				
				safetyDepositBoxID = (int) (Math.random()* Math.pow(10, 3));
				safetyDepositBoxKey=(int) (Math.random()* Math.pow(10, 4));
				
		}
		
		
		
		
		@Override
		public void showInfo() {
			super.showInfo();
			System.out.println("YOUR SAVINGS ACCOUNT FEATURES: " +
												"\n Safety Deposit Box ID: " +safetyDepositBoxID+
												"\n Safety Deposit Box Key: " + safetyDepositBoxKey 								
												);
					
					
}
		@Override
		public void setRate() {
			rate = getBaseRate()- .25;
			
		}
}