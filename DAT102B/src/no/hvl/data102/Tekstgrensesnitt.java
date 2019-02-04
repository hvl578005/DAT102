package no.hvl.data102;

import java.util.Scanner;

import no.hvl.data102.adt.CDarkivADT;

public class Tekstgrensesnitt {
	
	private Scanner sc = new Scanner(System.in);
	
	// lese opplysningene om en CD fra tastatur 
	
	public CD lesCD() {
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
		sc.close();
		
		return new CD(cd, navn, tittel, aar, sjanger, plateselskap);
	
	}

	
	// vise en CD med alle opplysninger på skjerm (husk tekst for sjanger)
	public void visCD (CD cd) {
		System.out.println("CD-nummer: " + cd.getCdnummer());
		System.out.println("Artist navn: " + cd.getNavn());
		System.out.println("Tittel: " + cd.getTittel());
		System.out.println("År: " + cd.getÅr());
		System.out.println("Sjanger: " + cd.getSjanger().toString());
		System.out.println("Plateselskap: " + cd.getPlateselskap());
		System.out.println();
		
	}
	
	//Skrive ut alle cder med en spesiell delstreng i tittelen
	public void skrivUtCdDelstrengITittel (CDarkivADT cda, String delstreng) {
		CD[] cdTab = cda.sokTittel(delstreng);
		
		for (int i = 0; i< cdTab.length; i++) {
			visCD(cdTab[i]);
		} 
		
	}
	
	//skriver ut alle cder av en artist / en gruppe
	public void skrivUtCdArtist (CDarkivADT cda, String delstreng) {
		CD[] cdTab = cda.sokArtist(delstreng);
		
		for (int i = 0; i< cdTab.length; i++) {
			visCD(cdTab[i]);
	}
	}
	
	// Skrive ut en enkel statistikk som inneholder antall CD-er totalt 
	// og hvor mange det er i hver sjanger
	public void skrivUtStatistikk (CDarkivADT cda) {
		System.out.println("Antall cder totalt:");
		System.out.println();
		cda.antall();
		System.out.println("Antall POP-cder:");
		System.out.println();
		cda.antallSjanger(Sjanger.POP);
		System.out.println();
		System.out.println("Antall ROCK-cder:");
		System.out.println();
		cda.antallSjanger(Sjanger.ROCK);
		System.out.println();
		System.out.println("Antall KLASSISK-cder:");
		System.out.println();
		cda.antallSjanger(Sjanger.KLASSISK);
		System.out.println();
		System.out.println("Antall OPERA-cder:");
		System.out.println();
		cda.antallSjanger(Sjanger.OPERA);
		System.out.println();
		
	}

	

}
