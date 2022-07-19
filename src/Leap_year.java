

import java.util.Scanner;

public class Leap_year {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year;
		
		System.out.println("Enter the year");
		
		Scanner user = new Scanner(System.in);
		
		year = user.nextInt();
		
		if (year%100 == 0 && year%400==0 || year%100!=0 && year%4==0)
		{ 
			System.out.println("Year is leap year");
			
		}
		else
		{	
			System.out.println("year is not leap year");
	}
	
	}
}

