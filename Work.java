package NextGrade;

import java.util.Scanner;

public class Work {
	
	public static void main(String[] args){
		
		System.out.println("Please enter the following information");
		
		String name = "";
		String num = "";
		String address = "";
		
		int i = 0;
		
		Scanner input = new Scanner(System.in);
		
		//The Arrays
		String [] contactName = new String [7];
		String [] contactNum = new String [7];
		String [] contactAdd = new String [7];
		
		//I set these as the Array titles
		contactName[0] = "Name";
		contactNum[0] = "Phone Number";
		contactAdd[0] = "Address";
		
		//This asks for the information and builds an Array for each
		//i -= i resets i back to 0 so the arrays are not 7,14,21+
		while (i < 6){
			i++;
			System.out.println("Enter contact name." + i);
			name = input.nextLine();
			contactName[i] = name;	
		}

		i -= i;
		while (i < 6){
			i++;
			System.out.println("Enter contact number." + i);
			num = input.nextLine();
			contactNum[i] = num;
		}
		
		i -= i;
		while (i < 6){
			i++;
			System.out.println("Enter contact address." + i);
			num = input.nextLine();
			contactAdd[i] = num;
		}
		
		
		//Now lets print out the Arrays
		i -= i;
		i -= 1;
		
		while(i < 6){
		i++;
		System.out.print( i + " " + contactName[i] + " / " );
		}
		
		//These are set to print the array on one line so println will skip a line
		System.out.println();
		i -= i;
		i -= 1;
		
		while(i < 6){
		i++;
		
		System.out.print( i + " " + contactNum[i] + " / " );
		}
		
		System.out.println();
		i -= i;
		i -= 1;
		
		while(i < 6){
			i++;
			
		System.out.print( i + " " + contactAdd[i] + " / " );
		}
		
		System.out.println();
		
		System.out.println("End of program");
		
	}
	
}
