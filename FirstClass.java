package NextGrade;

import java.security.Permission;
import java.util.Scanner;

public class FirstClass {

	public static void main(String[] args) {

		//declare arrays
		String [] contactName = new String [12];
		String [] contactPhone = new String [12];
		String [] contactAdd1 = new String [12];
		String [] contactAdd2 = new String [12];
		
		int i=0;
		
		String name = "0";
		String phone = "0";
		String add1 = "0";
		String add2 = "0";
		
		//method of taken input
		Scanner input = new Scanner(System.in);

		//while name field is empty display prompt etc.
		while (i<11)
		{
			i++;
		System.out.println("Enter contacts name: "+ i);
		name = input.nextLine();
		name += contactName[i];
			
		}


		while (i<12)
		{
		    i++;
		System.out.println("Enter contacts addressline1:");
		add1 = input.nextLine();
		add1 += contactAdd1[i];
		}

		while (i<12)
		{
		    i++;
		System.out.println("Enter contacts addressline2:");
		add2 = input.nextLine();
		add2 += contactAdd2[i];
		}

		while (i<12)
		{
		    i++;
		System.out.println("Enter contact phone number: ");
		phone = input.nextLine();
		phone += contactPhone[i];
		}
   
		
	}
}
