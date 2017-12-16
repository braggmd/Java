package ClassesClass;

public class TestBox {

	public static void main(String[] args) {
		
		BoxArea fedex = new BoxArea();
		BoxArea ups = new BoxArea();
		
		fedex.length = 3;
		fedex.width = 2;
		fedex.calculateArea();
		
		ups.length = 4;
		ups.width = 3;
		ups.calculateArea();


	}

}
