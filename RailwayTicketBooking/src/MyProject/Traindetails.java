package MyProject;

import java.util.Scanner;

public class Traindetails extends Displaydetails {
	public static String startpoint;
	public static String endpoint;
	public static String date;
	public static int train1seats=1;
	public static int train2seats=1;
	public static int train3seats=2;
	public static void TrainDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the startpoint");
		startpoint=sc.nextLine();
		System.out.println("Enter the endpoint");
		endpoint=sc.nextLine();
		System.out.println("Enter the date");
		date=sc.nextLine();
		
		}
	
	

}
