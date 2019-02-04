package no.hvl.data102;

import no.hvl.data102.adt.CDarkivADT;

public class CDarkiv implements CDarkivADT {
	private CD[] cdTabell;
	private int antall;
	
	public CDarkiv (int n) {
		cdTabell = new CD[n];
		antall = 0;
	}

	public CD[] hentCdTabell() {
		return cdTabell;
	}

	public void leggTilCd(CD nyCd) {
		 if (antall == cdTabell.length) {
			 utvidKapasitet();
		 	}
		 cdTabell[antall] = nyCd;
		 antall++;
		 
	}
	
	
	private void utvidKapasitet() {
		CD[] hjelpetabell = new CD[(int)Math.ceil(1.1 * cdTabell.length)];
		for (int i = 0; i < cdTabell.length; i++){
		      hjelpetabell[i] = cdTabell[i];
		      }
		cdTabell = hjelpetabell;
	}

	public boolean slettCd(int cdNr) {
		boolean slettet = false;
		for (int i = 0; i<antall && !slettet; i++) {
			if (cdNr == cdTabell[i].getCdnummer()) {
				cdTabell[i] = cdTabell[antall];
				antall--;
				slettet = true;
			} 
		}
		trimTab(cdTabell, antall);
		return slettet;
		
		}

	public CD[] sokTittel(String delstreng) {
		int k = 0;
		CD cdtab[] = new CD[antall];
		for (int i = 0; i<antall; i++) {
			if (cdTabell[i].getTittel().contains(delstreng)) {
				cdTabell[i] = cdtab[k];
				k++;
			}
		}
		
		trimTab(cdtab, k);
		
		return cdtab;
	}
	
	public CD sokCD(int nr) {
		CD cd = null;
		for (int i = 0; i<antall; i++) {
			if (nr == cdTabell[i].getCdnummer()) {
				cd = cdTabell[i];
			}
		} return cd;
	}

	public CD[] sokArtist(String delstreng) {
		int k = 0;
		CD cdtab[] = new CD[antall];
		for (int i = 0; i<antall; i++) {
			if (cdTabell[i].getNavn().contains(delstreng)) {
				cdTabell[i] = cdtab[k];
				k++;
			}
		}
		trimTab(cdtab, k);
		return cdtab;
	}

	public int antallSjanger(Sjanger sjanger) {
		int sjang = 0;
		for (int i = 0; i<antall; i++) {
			if (sjanger == cdTabell[i].getSjanger()) {
				sjang++;
			}
		}
		return sjang;
	}

	public int antall() {
		return antall;
	}
	
	private CD[] trimTab(CD[] tab, int n) { 
		CD[] cdtab2 = new CD[n];
		int i = 0;
		while (i < n) {
		         cdtab2[i] = tab[i];
		         i++;
		   }//while
		return cdtab2; 
		}//
	
	
	
}

