package AtmFunctioning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.*;


public class DbConnection {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/atm";
		String user="root";
		String psw="mysql123";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,user,psw);
			Statement s=con.createStatement();


			System.out.println("Welcome to Axis Bank ATM");
			System.out.println("Enter your pin number to proceed");
			int pin=sc.nextInt();
			//String Sql="SELECT *from details WHERE ac_no="+pin;
			PreparedStatement pstm=con.prepareStatement("SELECT *from details WHERE ac_no="+pin+";");
			ResultSet rs= pstm.executeQuery();
			//ResultSet rs=s.executeQuery("SELECT *from details WHERE ac_no="+pin);
			String name= null;
			int balance=0;
			int count=0;
			while(rs.next()){
				 name = rs.getString(3);
				balance = rs.getInt(4);
				count++;
				
			}
                 int choice;
                 int amount = 0;
				 int withdrawl = 0;
			
			if(count>0) {
				//String name = null;
				 //int balance = 0;
//				 int amount = 0;
//				 int withdrawl = 0;
				 System.out.println(" Hello " + name);
				 while(true)
				 {
					 System.out.println("choose 1 for Balance Check");
				    	System.out.println("Choose 2 for Add Amount");
				    	System.out.println("Choose 3 for AMount Withdrawl");
				    	System.out.println("Choose 4 for Recipt Printing");
				    	System.out.println("Choose 5 for Exit or Quit");
				    	System.out.println(" ");
				    	System.out.println("Enter your choice");
				    	choice=sc.nextInt();
				    	switch(choice) {
				    	case 1:
				    		System.out.println("Your balance is: "+balance);
				    		System.out.println("   ");
				    		break;
				    	case 2:
				    		System.out.println("How much amount u want to add in your account");
				    		amount=sc.nextInt();
				    		balance=balance+amount;
				    		PreparedStatement s1 =  con.prepareStatement("UPDATE details set balance=? WHERE ac_no= ?;");
				    		s1.setInt(1, balance);
				    		s1.setInt(2,pin);
				    		s1.executeUpdate();				    	
				    		System.out.println("Money has been successfully added into your account");
				    		//System.out.println("Your Current Balance is : "+balance);
				    		System.out.println("  ");
				    		break;
				    	case 3:
				    		System.out.println("How much amount u want to Withdrawl");
				    		withdrawl=sc.nextInt();
				    		if(balance<withdrawl) {
				    			System.out.println("your balance is insufficent");
				    		}
				    		else {
				    		balance=balance-withdrawl;
				    		PreparedStatement s2 =  con.prepareStatement("UPDATE details set balance=? WHERE ac_no= ?;");
				    		s2.setInt(1, balance);
				    		s2.setInt(2,pin);
				    		s2.executeUpdate();
				    		

				    		//int bal1=s.executeUpdate("UPDATE details SET balance="+balance+"WHERE ac_no= "+pin);

				    		System.out.println(withdrawl+"is succesfully debited from your account");
				    		System.out.println("Your Current Balance is : "+balance);
				    		}
				    		System.out.println(" ");
				    		break;
				    	case 4:
				    		System.out.println("  ");
				    		System.out.println("Thanks for coming ");
				    		System.out.println("your Current balanse is :"+balance);
				    		System.out.println("added amount is:"+amount);
				    		System.out.println("Withdrawl amount is:"+withdrawl);
				    		break;
				    	case 5:
				    		System.exit(choice);
				    		break;
				    	}
				 }
				 
				
			}
			else {
				System.out.println("You have entered wrong pin number");
			}
		}
		catch(Exception t) {
			System.out.println(t);
		}

	}

}
