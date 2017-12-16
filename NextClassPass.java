package NextGrade;

import java.util.Scanner;

public class NextClassPass {
	
	String[] info = new String[2];
	
	void passwordArray(){
	
	NewClassArray enter = new NewClassArray();
	enter.loginArray();
	
	Scanner input = new Scanner(System.in);
	
	//An array for the saved passwords & one for input ones
	
	String[] password = new String[1];
	String[] total = new String[1];	
	
	
	//Asks for userName
	System.out.println("Enter Username");
	info[0] = input.nextLine();
	
	//Asks for password
	System.out.println("Enter Password");
	info[1] = input.nextLine();
	
	password[0] = info[0] + info[1];
	
	int i = 0;
	
	//Checks to see if the input login matches the ones saved
	if(password[0] .equals(enter.login[i])){
		System.out.println("Access Granted");
		System.out.println("Welcome " + info[0]);
			}
	else {
		System.out.println("Wrong Entry, Try again");
		passwordArray();
	}
	
	
	
	
	}
	
}
//remember to figure out the links you did on the employee classes