package test.project;

public class Arrays {

	public static void main(String[] args) {
		
		// Arrays are multiple stored data
		
		int[] a = {10, 20, 30, 40, 50};
		System.out.println(a[1] + " " + a[4]);
		System.out.println("------------");
		// enhance for
		
		for(int temp : a){
			System.out.println(temp);
		}
		
		System.out.println("------------");
			
		int[] x = new int[5];
		
		x[3] = 25;
		x[0] = 12;
		
		for(int and : x){
			System.out.println(and);
		
		}
		
		System.out.println("------------");
		
		String[] num = {"one", "two", "three"};
		
		for(String temp : num){
			System.out.println(temp);
		}
		
		System.out.println("------------");
		
		String[] numx = new String[5];
		
		numx[2] = "88";
		numx[4] = "34";
		numx[0] = "29";
		
		for(String temp2 : numx){
			System.out.println(temp2);
		}
		System.out.println("------------");
		{
		System.out.println(numx[2] + " " + numx[1]);
		}
		

	}

}
