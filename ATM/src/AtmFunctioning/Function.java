package AtmFunctioning;

import java.util.Scanner;

public class Function {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Please Place your card");
	    System.out.println("   ");
	    System.out.println("ENter your pin");
	    int pin=sc.nextInt();
	    
	    if(pin==12345) {
	    
	    int Balance=100000,Withdrawl,Deposit;
	    System.out.println("Your Account Balance is:"+Balance);
	    
	    //Balance =sc.nextInt();
	    
	    //Withdrawl=sc.nextInt();
	    //Deposit=sc.nextInt();
	    
	    while(true)
	    {
	    	System.out.println("Welcome to Axis Bank Atm");
	    	System.out.println("choose 1 for the withdrawl");
	    	System.out.println("Choose 2 for the deposit");
	    	System.out.println("Choose 3 for the Balance Check");
	    	System.out.println("Choose 4 for the exit");
	    	
	    	int choice=sc.nextInt();
	    	switch(choice) {
	    	case 1:
	    		System.out.println("Enter money that u want to Withdraw");
	    	    Withdrawl=sc.nextInt();
	    	    
	    	    if(Balance>=Withdrawl) {
	    	    	Balance=Balance-Withdrawl;
	    	    	
	    	    	System.out.println("Please collect your Cash");
	    	    	
	    	    }
	    	    else
	    	    {
	    	    	System.out.println("You are having insufficent Funds");
	    	    }
	    	    System.out.println(" ");
	    	    
	    	    
	    	    break;
	    	
	    	    
	    	case 2:
	    		System.out.println("Enter the money that u want to deposit");
	            Deposit=sc.nextInt();    
	            Balance=Balance+Deposit;
	            System.out.println("Your money has been deposited Succesfully");
	            System.out.println(" ");
	            break;
	    	case 3:
	    		System.out.println("Your Account Balance is:"+Balance);
	    		System.out.println(" ");
	    		break;
	    	case 4:
	    		System.exit(0);
	    		break;
	    	}
	    	
	    }
	    
	}
	    else {
	    	System.out.println("You entered wrong pin");
//	    	System.out.println("Please Enter the Correct Pin:");
//	    	sc.nextInt();
	    }
	}
	
	String sql = "INSERT INTO users(name,id,cash,email,creditcard,cnic,number) VALUES(?,?,?,?,?,?,?)";

	

}
