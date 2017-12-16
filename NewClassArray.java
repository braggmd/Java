package NextGrade;

public class NewClassArray {
	
	String[] userName;
	String[] passWord;
	String[] login = new String [10];
	
	void loginArray(){
		
		NextClassPass user = new NextClassPass();
		
		String[] userName = new String[10];
		String[] passWord = new String[10];
		
	
		userName[0] = "dillon";
		userName[1] = "tara";
		userName[2] = "mike";
		userName[3] = "pam";
		userName[4] = "david";
		userName[5] = "tonya";
		userName[6] = "brison";
		userName[7] = "wyatt";
		userName[8] = "champ";
		userName[9] = "joe";
		
		passWord[0] = "1";
		passWord[1] = "2";
		passWord[2] = "3";
		passWord[3] = "4";
		passWord[4] = "5";
		passWord[5] = "6";
		passWord[6] = "7";
		passWord[7] = "8";
		passWord[8] = "9";
		passWord[9] = "0";
		
		login[0] = userName[0] + passWord[0];
		login[1] = userName[1] + passWord[1];
		login[2] = userName[2] + passWord[2];
		login[3] = userName[3] + passWord[3];
		login[4] = userName[4] + passWord[4];
		login[5] = userName[5] + passWord[5];
		login[6] = userName[6] + passWord[6];
		login[7] = userName[7] + passWord[7];
		login[8] = userName[8] + passWord[8];
		login[9] = userName[9] + passWord[9];
		

	}
	
}


