package no.hvl.data102;
import no.hvl.data102.adt.*;
import static javax.swing.JOptionPane.*;


public class Meny {
	private Tekstgrensesnitt tekstgr; 
	private CDarkivADT cda;
	private boolean run;
	
	public Meny(CDarkivADT cda){
		tekstgr = new Tekstgrensesnitt();
		   this.cda = cda;
		   run = true;
	}
	
	public void start() { 
		String ut = "1) Ønsker å jobbe med eksisterende arkiv. \n2) Ønsker å opprette et nytt arkiv";
		String input = showInputDialog(ut);
		int valg = Integer.parseInt(input);
		
		if (valg == 1) {
			String filnavn = showInputDialog("Skriv inn filnavn");
			Fil.lesFraFil(filnavn);
			while (run) {
				menyValg(cda);
			}
			
			
		} else if (valg == 2) {
			String tall = showInputDialog("Hvor mange CD-plasser ønsker du i arkivet?");
			int tallvalg = Integer.parseInt(tall);
			
			CDarkivADT cd1 = new CDarkiv(tallvalg);
			while (run) {
			menyValg(cd1);
			}
				
			
		} else {
			System.out.println("Ikke gyldig svar.");
		}
		
	}
	
	
	public void menyValg(CDarkivADT cda) {
		String meny = "1) Legg til en CD \n2) Slett en CD \n3) Vis CD \n4) Søk tittel \n5) Søk artist \n6) Vis statistikk for antall sjangre og cd-er \n7) Lagre filen \n8) Avslutt programmet";
		String menyUt = showInputDialog(meny);
		int menyvalg = Integer.parseInt(menyUt);
		
		switch (menyvalg) {
		case 1: 
			CD nyCd = tekstgr.lesCD();
			cda.leggTilCd(nyCd);
			break;
		case 2: 
			String slett = ("Skriv inn CD nummeret du ønsker å slette.");
			String sletti = showInputDialog(slett);
			int sletta = Integer.parseInt(sletti);
			cda.slettCd(sletta);
			break;
		case 3:
			String cd = showInputDialog("Skriv inn cd nummer.");
			int cdl = Integer.parseInt(cd);
			CD nyCdd = cda.sokCD(cdl);
			tekstgr.visCD(nyCdd);
			break;
		case 4:
			String tittel = showInputDialog("Skriv inn CD tittel.");
			tekstgr.skrivUtCdDelstrengITittel(cda, tittel);
			break;
		case 5:
			String navn = showInputDialog("Skriv inn artist navn.");
			tekstgr.skrivUtCdArtist(cda, navn);
			break;
		case 6:
			tekstgr.skrivUtStatistikk(cda);
			break;
		case 7:
			String filnav1 = showInputDialog("Hva vil du kalle filen?");
			Fil.skrivTilFil(cda, filnav1);
			break;
		case 8: 
			String avslutt = "Avslutter programmet.";
			showMessageDialog(null, avslutt);
			run = false;
			break;
			
		default:
			String ut1 = "Ikke gyldig svar.";
			showMessageDialog(null, ut1);
		}
		
		
		
	}
	
	

}

/*Når vi starter programmet, skal vi få spørsmål om vi ønsker å jobbe med 
 * et eksisterende arkiv eller om vi vil opprette et nytt. Mellom hver gang 
 * vi bruker programmet, lagrer vi arkivet på fil, dvs. også når vi avslutter
 *  programmet. Du behøver i denne oppgaven ikke sortere tabellen av CD-er.
 */