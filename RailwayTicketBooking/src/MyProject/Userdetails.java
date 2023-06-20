package MyProject;
import java.util.*;

public class Userdetails {
	public static String name;
	public static String mailid;
	public static String mobile;
	public static int age;
    public static char gender;
    public static void getDetails() {
    	System.out.println("*****************");
    	System.out.println("Welcome to the Registration");
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the name");
    	name=sc.nextLine();
    	System.out.println("Enter the mailid");
    	mailid=sc.nextLine();
    	System.out.println("Enter your mobile No.");
    	mobile=sc.nextLine();
    	System.out.println("Enter your Age");
    	age=sc.nextInt();
    	System.out.println("Enter your Gender");
    	gender=sc.next ().charAt (0); 
    	
    	
    }
}
