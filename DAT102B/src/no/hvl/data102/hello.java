package no.hvl.data102;

import java.util.Scanner;

public class hello {
	
	

	public static void main(String[] args) {
		lesCD();
		
	}
	
	public static void lesCD() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Skriv inn CD nummer:");
		int cd = sc.nextInt();
		 sc.nextLine();
		System.out.println("Artist navn:");
		String navn = sc.nextLine();
		 System.out.println("CD tittel:");
		 String tittel = sc.nextLine();
		 System.out.println("Utgivelsesår:");
		 int aar = sc.nextInt();
		 sc.nextLine();
		 System.out.println("Sjanger:");
		 System.out.println("1) POP, 2) ROCK, 3) OPERA, 4) KLASSISK");
		 int valg = sc.nextInt();
		 sc.nextLine();
		 String sjang = "";
		 if (valg == 1){
			    sjang = "POP";
			}else if(valg == 2){
			    sjang = "ROCK";
			}else if(valg == 3){
			  sjang = "OPERA";
			}else if (valg == 4){
			    sjang = "KLASSISK";
			}
		 System.out.println("Plateselskap:");
		 String plateselskap = sc.nextLine();
		 
		 System.out.println();
		 System.out.println(cd + "\n" + navn + "\n" + tittel + "\n" + aar + "\n" + sjang + "\n" + plateselskap);
		
	}

}

/*System.out.println("Skriv inn CD nummer:");
int cd = sc.nextInt();
System.out.println("Artist navn:");
String navn = sc.nextLine();
System.out.println("CD tittel:");
String tittel = sc.nextLine();
System.out.println("Utgivelsesår:");
int aar = sc.nextInt();
System.out.println("Sjanger:");
System.out.println("1) POP, 2) ROCK, 3) OPERA, 4) KLASSISK");
int valg = sc.nextInt();
sc.nextLine();
Sjanger sjanger = Sjanger.KLASSISK;
if (valg == 1){
    sjanger = Sjanger.POP;
}else if(valg == 2){
    sjanger = Sjanger.ROCK;
}else if(valg == 3){
    sjanger = Sjanger.OPERA;
}else if (valg == 4){
    sjanger = Sjanger.KLASSISK;
}
System.out.println("Plateselskap:");
String plateselskap = sc.nextLine();

return new CD(cd, navn, tittel, aar, sjanger, plateselskap);
*/