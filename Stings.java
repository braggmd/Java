package test.project;

public class Stings {

	public static void main(String[] args) {
		
		//int=(1)  double=(1.1)  boolean=true/false
		//char=(a)  
		
		
		String first = "Dillon";
		String last = "Bragg";
		String x = first + " " + last;
		
		System.out.println("Greetings " + first);
		System.out.println(x.toUpperCase());
		System.out.println(first.substring(0,4));
		
		String age = "20";
		String salary = "30500.50";
		
		int a = Integer.parseInt(age) + 2;
		System.out.println(a += 5);
		
		double s = Double.parseDouble(salary);
		System.out.println(s);
		
		double t = 0.25;
		double o = t * s;
		double k = s - o;
		
		System.out.println();
		System.out.println("Taxes paid this year. $" + o);
		System.out.println();
		System.out.println("Taxes kept this year. $" + k);
		
	}

}
