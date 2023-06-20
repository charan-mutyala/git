package MyProject;
import java.util.*;

public class Execute {

	public static void main(String[] args) {
		System.out.println("Railway Ticket Booking");
		System.out.println("***********************");
		System.out.println(" Welcome to Indian Railway Ticket Reservation ");
		int i=1;
		int option=0;
		//Userdetails ud=new Userdetails();
		while(i!=0) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Press 1 to 5 to enter details ");
			System.out.println("1.UserDetails");
			System.out.println("2.display details");
			System.out.println("3.Train Details");
			System.out.println("4.Ticket Booking");
			System.out.println("5.Exit");
			option=sc.nextInt();
			Userdetails ud=new Userdetails();
			Displaydetails dd=new Displaydetails();
			Traindetails td=new Traindetails();
			Booking bd=new Booking();
			switch(option) {
			case 1:ud.getDetails();
			        break;
			case 2:dd.displayDetails();
			        break;
			case 3: td.TrainDetails();
			         break;
			case 4: bd.bookMyTicket();
			         break;
			case 5: 
				i = 0;
				
			}
			
		}
	}

}
