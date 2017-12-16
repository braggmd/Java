package Day1;

public class Exercises2 {

	public static void main(String[] args) {

		/*int apples = 21;
		int bannanas = 101;
		
		if(apples <= 19){
			System.out.println("Buy more apples.");
		}else if(apples >= 20){
			System.out.println("Dont buy more apples.");
		}
		if(bannanas >= 100){
			System.out.println("STOP BUYING BANNANAS!");
		}else if(bannanas <= 19){
			System.out.println("Buy more bannanas.");
		}else if(bannanas >= 20){
			System.out.println("Dont buy more bannanas.");
		}*/

		int[] num;
		num = new int[25];
		
		num[0] = 10;
		num[1] = 5;
		num[2] = num[0] + num[1];
		num[24] = 50;
		
		System.out.println(num[0] + " " + num[2]);
		
		for(int i = 0; i<num.length; i++){
			System.out.println(num[i]);
		}
	}

}
