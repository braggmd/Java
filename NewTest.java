package test.project;

public class NewTest {

	public static void main(String[] args) {
		
		/* original value; if value less than value
		*  value plus 1
		*/
		
		// ++increment  --decrement
		
		/*for(int i = 0; i <= 10; i++){
		*	System.out.println("i = " + i);
		*}
		*for(int i = 10; i <= 0; i--){
		*	System.out.println("i = " + i);
		}*/

		// set value+= value == x+value   set value-= value == x-value
		
		System.out.println("Using alot of math!?!");
		
		int x = -10;
		
		while(x <= 0){
			System.out.println("x = " + x);
			//x++;
			//x = x + 3;
			x += 2;
		}
		
        int y = 2;
		
		while(y <= 10){
			System.out.println("y = " + y);
			//y++;
			//y = x + 3;
			y *= 2;
			if(y >= 10){
				System.out.println("y = " + y);
			}
				if(y >= 10){
				System.out.println("End");
			}
		}
	}

}
