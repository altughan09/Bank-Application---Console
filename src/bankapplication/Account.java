package bankapplication;

public abstract class Account implements IBaseRate {
			
				private  String name;
				private  String sSn;
				protected String accountNumber;
				private  double balance;
				protected double rate;
				private static int index=10000;
					
				public Account( String name,  String sSn,  double initDeposit) {
							this.name= name;
							this.sSn= sSn;
							balance=initDeposit;
							
							index++;
							accountNumber=setAccountNumber();
							
							setRate();
							
							
				}
				
				
				public abstract void setRate(); 
						
					
					
				
				
				private String setAccountNumber() {
					
							String lastTwoofSsN= sSn.substring(sSn.length()-2, sSn.length());
							int uniqueID = index;
							int randomNumber= (int) (Math.random() * Math.pow(10, 3));
							return lastTwoofSsN + uniqueID + randomNumber;
				}
				
				
				public void showInfo() {
					
							System.out.println(
									"NAME: " +name+
									"\n ACCOUNT NUMBER: " +accountNumber+
									"\n BALANCE: $ " +balance+
									"\n RATE: " + rate + "%"
									);
					
				}
}
