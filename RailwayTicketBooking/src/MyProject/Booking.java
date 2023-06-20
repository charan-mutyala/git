package MyProject;

import java.util.Scanner;

public class Booking extends Traindetails {
	public static int trainNo;
	public static String Nationality;
	public static String Aadhar;
	public static void bookMyTicket() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		name=sc.nextLine();
		System.out.println("Enter the Nationality");
		Nationality=sc.nextLine();
		System.out.println("Enter the aadharNo.");
		Aadhar=sc.nextLine();
		System.out.println("Enter the train No.");
		trainNo=sc.nextInt();
		if(trainNo==1) {
			System.out.println("Tickets are booked");
		}
		else
			if(trainNo==2){
			System.out.println("Tickets are booked");
			
		}
			else {
				System.out.println("Invalid");
			}
		
		
		
	}

}
