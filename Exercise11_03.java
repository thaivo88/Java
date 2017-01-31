public class Exercise11_03 {
  public static void main(String[] args) {
    CheckingAccount checking = new CheckingAccount(1, 35);
    SavingsAccount savings = new SavingsAccount(2, 25);
    checking.withdraw(10);
    savings.withdraw(10);
    
    System.out.println("Checking Account Balance: " + checking.getBalance());
    System.out.println("Savings Account Balanace: " + savings.getBalance());
    
  }
}
	
//create subclass name Checking from superclass name Account	
	class CheckingAccount extends Account{
		int limit = -50; //setting a overdraft limit at 50 dollars
		public CheckingAccount (int id, double balance){ //creating a CheckingAccount method with the property of id and balance
			super (id, balance); //pulling this information or inheriting from the superclass name Account class
		}	
		public void withdraw (int amount){
			if (getBalance() - amount >= limit){
				super.withdraw(amount);
				}			
			else{
				System.out.println("Overdraft Limit!!!");
			}		
	}
		}
	
	
	
//create subclass name Saving from superclass name Account	
	class SavingsAccount extends Account{
		int limit = 0;
		public SavingsAccount (int id, double balance){
			super (id, balance);
		}
			public void withdraw (int amount){
				if (getBalance() - amount >= limit){
					super.withdraw(amount);
					}
				else{
					System.out.println("Insufficient Funds!!!");
				}
					}
	}