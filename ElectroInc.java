package Day1;

import java.util.Scanner;

public class ElectroInc {
	
	String name;//name
	int item;//amount
	int need;//minimum amount
	int total;//after
	
	Scanner sc = new Scanner(System.in);
	
	void weeklyInventory(){
		
		System.out.println("How many " + name + " was sold this week?");
		
		int sold = sc.nextInt();
		int total = item - sold;
		int buy = need - total;
		
		if(total < 0){
			System.out.println("Incorrect entry, try again or contact IT rep for more info.");
		}else if(total >= need){
			System.out.println("In stock");
			System.out.println("Currently have " + total + " " + name + " instock");
		}else if(total <= need){
			System.out.println("Purchase " + buy + " more.");
			System.out.println("Currently have " + total + " " + name + " instock");
		}
		
	}

}
