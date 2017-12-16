package test.project;

public class TwoDArray {

	public static void main(String[] args) {
		
		int[][] Two = new int[4][3];
		
		Two[0][0] = 10;
		Two[1][0] = 11;
		
		int temp = 10;
		
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 3; j++){
				
				
				Two[i][j] = temp;
				temp += 10;
			}
		}
		
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 3; j++){
					
					System.out.print(Two[i][j] + " ");
					
				}
				System.out.println();
		}

	}

}
