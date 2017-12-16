package test.project;

public class HelloWorld {

	public static void main(String[] args) {
		
		System.out.println("hello world");
		
		// ; is put in to end a segment 
		
		// +addition  -subtraction  *multiplication  /division  %remainder
		
		/*
		*int result = x + y;
		*int result1 = x - y;
		*int result2 = x * y;
		*int result3 = x / y;
		*int result4 = x % y;
		*
		*System.out.println("10 + 3 = " + result);
		*System.out.println("10 - 3 = " + result1);
		*System.out.println("10 * 3 = " + result2);
		*System.out.println("10 / 3 = " + result3);
		*System.out.println("10 % 3 = " + result4);
		*/
		
		// = sets a value  int title = value;
		
		// ==equal to  !=not equal to  <less than  >greater than
		// <=less than or equal to  >=greater than or equal to

		int x = 10;
		int y = 10;
		
		if(x == y){
			System.out.println("x = y");
		}else if(x < y){
			System.out.println("x < y");
		}else if(x > y){
			System.out.println("x > y");
		}
	}

}
