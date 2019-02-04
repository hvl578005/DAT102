package no.hvl.data102;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import no.hvl.data102.adt.CDarkivADT;


public class Fil {
	private static final String SKILLE = "#";
	 
	public static CDarkivADT lesFraFil(String filnavn)  {
		CDarkivADT cda = null;
		
			try {
			 FileReader ansFil = new FileReader(filnavn); 			 
			BufferedReader innfil = new BufferedReader(ansFil);
			   
			String linje = innfil.readLine();
			int n = Integer.parseInt(linje);
			cda = new CDarkiv(n);
			
			for (int i = 0; i < n; i++) {
				String post = innfil.readLine();
				String[] felt = post.split(SKILLE);
				int nr = Integer.parseInt(felt[0]);
				String artist = felt[1];
				String tittel = felt[2];
				int aar = Integer.parseInt(felt[3]);
				String sjStr = felt[4];
				Sjanger sj = Sjanger.finnSjanger(sjStr);
				String plselskap = felt[5];
				CD cd = new CD(nr, artist, tittel, aar, sj, plselskap);
				cda.leggTilCd(cd);
				
			    innfil.close();
			}
			
		} catch (FileNotFoundException unntak) {
			                                    
			System.out.println("Finner ikke filen " + filnavn);
			System.exit(1); 
			
		} catch (IOException e) {
			System.out.println("Feil ved lesing av fil: " + e);
			System.exit(2); 
		}
      
	return cda;
       
	}

	
	
	
	public static void skrivTilFil(CDarkivADT cdarkiv, String filnavn)  {
		try {
			
			FileWriter ansFil = new FileWriter(filnavn, false);
			
			 
			PrintWriter utfil = new PrintWriter(ansFil);
			int antall = cdarkiv.antall();
			utfil.println(antall);
			CD[] tabell = cdarkiv.hentCdTabell();
			for (int i = 0; i < antall; i++) {
				utfil.print(tabell[i].getCdnummer());
				utfil.print(SKILLE);
				utfil.print(tabell[i].getNavn());
				utfil.print(SKILLE);
				utfil.print(tabell[i].getTittel());
				utfil.print(SKILLE);
				utfil.print(tabell[i].getÅr());
				utfil.print(SKILLE);
				utfil.print(tabell[i].getSjanger());
				utfil.print(SKILLE);
				utfil.println(tabell[i].getPlateselskap());
			} 
			utfil.close();
		} 
		
				
		catch(FileNotFoundException e) {
			System.out.print("feil ved åpning av fil: " + filnavn);
			System.exit(1); // avbryte utføringen
		}
		catch (IOException e) {
			System.out.println("Feil på skriving til fil: " + e);
			System.exit(2);// avbryte utføringen
		}
	}
}