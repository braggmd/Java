package Day1;

import java.net.StandardSocketOptions;
import java.util.Scanner;//required for this class to read input

public class ElectroIncData {

	public static void main(String[] args) {
		// item == current  sold == sold this week
		/*//current inventory
		int sanUsb = 17;
		int hdmi = 24;
		int ethNet = 4;
		int computer = 8;
		
		//sold this week
		int sanUsbS = 7;
		int hdmiS = 3;
		int ethNetS = 1;
		int computerS = 0;*/
		
		//name id's
		ElectroInc san = new ElectroInc();
		ElectroInc hd = new ElectroInc();
		ElectroInc eth = new ElectroInc();
		ElectroInc com = new ElectroInc();
		
		//variable int's
		ElectroInc sanUsb = new ElectroInc();
		ElectroInc hdmi = new ElectroInc();
		ElectroInc ethNet = new ElectroInc();
		ElectroInc computer = new ElectroInc();
		
		Scanner sc = new Scanner(System.in); //makes a new scanner
		
		sanUsb.name = "USB's";
		sanUsb.item = 17;
		sanUsb.need = 25;
		sanUsb.weeklyInventory();
		System.out.println();
		
		hdmi.name = "HDMI Cables";
		hdmi.item = 34;
		hdmi.need = 20;
		hdmi.weeklyInventory();
		System.out.println();
		
		ethNet.name = "Ethernet Cables";
		ethNet.item = 24;
		ethNet.need = 15;
		ethNet.weeklyInventory();
		System.out.println();
		
		computer.name = "Computers";
		computer.item = 120;
		computer.need = 16;
		computer.weeklyInventory();
		System.out.println();
		
		
		/*//new total inventory
		int sanUsbT = sanUsb - sanUsbS;
		int hdmiT = hdmi - hdmiS;
		int ethNetT = ethNet - ethNetS;
		int computerT = computer - computerS;
		//USB/*
		/*if(sanUsbT <= 15){
			System.out.print("Purchase more USB Flashdrives."); System.out.println("  Currently in stock - " + sanUsbT);
		}else if(sanUsbT >= 16){
			System.out.println("USB Flashdrives = OK"); System.out.println("  Currently in stock - " + sanUsbT);
		}
		System.out.println();
		//HDMI	
		if(hdmiT <= 15){
			System.out.print("Purchase more HDMI Cables."); System.out.println("  Currently in stock - " + hdmiT);
		}else if(hdmiT >= 16){
			System.out.print("HDMI Cables = OK"); System.out.println("  Currently in stock - " + hdmiT);
		}
		System.out.println();
		//ethNet
		if(ethNetT <= 15){
			System.out.print("Purchase more Ethernet Cables."); System.out.println("  Currently in stock - " + ethNetT);
		}else if(ethNetT >= 16){
			System.out.println("Ethernet Cables = OK"); System.out.println("  Currently in stock - " + ethNetT);
		}
		System.out.println();
		//Computers
		if(computerT <= 15){
			System.out.print("Purchase more Computers."); System.out.println("  Currently in stock - " + computerT);
		}else if(computerT >= 16){
			System.out.println("Computers = OK"); System.out.println("  Currently in stock - " + computerT);
		}
		
		Scanner sc = new Scanner(System.in); //makes a new scanner
		
		
		System.out.println("How are you?");
			String you = sc.nextLine();
		if(you.equalsIgnoreCase("good")){
			System.out.println("nice");
		}else if(you.equalsIgnoreCase("bad")){
			System.out.println("not nice");
		}else
			System.out.println("I'm not programmed with that response, please try another.");
		System.out.println("name?");
		
		String input = sc.nextLine();
		System.out.println("Enter age");
		
		int age = sc.nextInt();
		System.out.println("Welcome " + input + " age " + age);
		
		System.out.println("How often do you code? (1) Less than an hour a day  (2) 1-3 hours a day  (3) 3 or more hours a day");
		int an = sc.nextInt(); sc.nextLine();
		if(an == 1){
			System.out.println("Good job, keep it up.");
		}else if(an == 2){
			System.out.println("Thats great, go get em!");
		}else if(an == 3){
			System.out.println("Outstanding, you'r a real prodigy!");
		}else System.out.println("Please enter a valid answer.");
		*/

		
			

	}

}
