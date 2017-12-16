package Day2;

import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {

	    //declare arrays
	        String [] contactName = new String [12];
	        String [] contactPhone = new String [12];
	        String [] contactAdd1 = new String [12];
	        String [] contactAdd2 = new String [12];

	    //inputs
	    String name = "";
	    String phone = "";
	    String add1 = "";
	    String add2 = "";

	    //method of taken input
	    Scanner input = new Scanner(System.in);

	    //while name field is empty display prompt etc.
	    while (name.equals(""))
	    {
	    System.out.println("Enter contacts name: ");
	    name = input.nextLine();
	    name += contactName[];
	    }


	    while (add1.equals(""))
	    {
	    System.out.println("Enter contacts addressline1:");
	    add1 = input.nextLine();
	    add1 += contactAdd1[];
	    }

	    while (add2.equals(""))
	    {
	    System.out.println("Enter contacts addressline2:");
	    add2 = input.nextLine();
	    add2 += contactAdd2[];
	    }

	    while (phone.equals(""))
	    {
	    System.out.println("Enter contact phone number: ");
	    phone = input.nextLine();
	    phone += contactPhone[];
	    }

	}

}
