import java.util.Scanner;

public class janaka{
	public static void main(String args[]){
	
		int Year = 0, Month = 0, Day = 0, Age = 0;
		String Name, ID;	
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println(" \n\n---  Age Calculator --- \n\n");
		
		System.out.print(" Enter Your ID : ");
		ID = myScanner.next();
		
		System.out.print(" Enter Your Name : ");
		Name = myScanner.next();

		
		System.out.print(" Enter Your Birth Year : ");
		Year = myScanner.nextInt();
		
		System.out.println(" \n\n---  Your Details  --- \n\n");
		
		System.out.println("ID : " + ID);
		System.out.println("Name : " + Name);
		System.out.println(" Age = " + (2019 - Year) );
		
		System.out.println(" \n\n---------------------- \n\n");
	}
}