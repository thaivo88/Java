import java.util.Date;

public class Exercise09_07 {

	public static void main(String[] args) {

//Below is given from LiveLab to use to construct the problem		
	    Account account = new Account(1122, 20000);
	    account.setAnnualInterestRate(4.5);
	    
	    account.withdraw(2500);
	    account.deposit(3000);
	    System.out.println("Balance is " + account.getBalance());
	    System.out.println("Monthly interest is " + account.getMonthlyInterest());
	    System.out.println("This account was created at " + account.getDateCreated());
	  }
	}

//Starting homework below:

//creating the class name "Account" a template for objects
//encapsulation by private  
	class Account {
		private int id;
		private double balance;
		private double annualInterestRate = 0;
		private Date dateCreated; 
	
//creating a no-arg constructor default account
	Account(){
	}

//constructor that creates an account for id and initial balance
	Account(int newId, double newBalance){
		id = newId;
		balance = newBalance;
	}

//Applying the Accessor "Getter" and Mutator "Setter" below.
//Getter = get.RefenceObjectVariable  	
//Setter = set.RefenceObjectVariable
	
	//accessor and mutator for id (the "getter" and "setter")	
		public int getId(){
			return id;
		}
		public void setId(int newId){
			id = newId;
		}
	
	
	//accessor and mutator for balance (the "getter" and "setter")		
	public double getBalance(){
		return balance;
	}
	public void setBalance(double newBalance){
		balance = newBalance;
	}
	
	
	//accessor and mutator for annualInterestRate (the "getter" and "setter")		
		public double getAnnualInterestRate(){
			return annualInterestRate;
		}
		public void setAnnualInterestRate(double newAnnualInterestRate){
			annualInterestRate = newAnnualInterestRate;
		}
	
		
	//the accessor method for dateCreated (the "getter")		
	public Date getDateCreated (){
		return dateCreated;
	}
	
//creating a method name "getMonthlyInterestRate". Interest rate is annual interest rate / 12 * 100	
	double getMonthlyInterestRate(){
		return annualInterestRate / 1200;
	}

//creating a method name "getMonthlyInterest". Monthly Interest is Balance * Monthly Interest Rate
	double getMonthlyInterest(){
		return balance * (annualInterestRate/1200);
	}
	
//creating a method name "withdraw"
	double withdraw(double amount){
		return balance -= amount;
	}
	
//creating a method name "deposit"
	double deposit(double amount){
		return balance += amount;
		
	}
	}