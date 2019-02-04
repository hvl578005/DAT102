package no.hvl.data102.adt;

import no.hvl.data102.CD;
import no.hvl.data102.Sjanger;

public interface CDarkivADT {
	
	/**
	 * 
	 * @return returnerer cd tabell
	 */
	
	CD[] hentCdTabell();
	
	/** 
	 * 
	 * @param legger til nyCd
	 */
	
	void leggTilCd(CD nyCd);
	
	/**
	 * 
	 * @param søker opp cdNr, hvis den finnes blir den slettet fra arkivet
	 * @returnerer slettet hvis cden finnes og er slettet
	 */
	
	boolean slettCd(int cdNr);
	
	/**
	 * 
	 * @param går gjennom alle cd-tittelene og ser om de inneholder delstrengen
	 * hvis de gjør det så blir det lagt inn i den nye tabellen
	 * @return returnerer den nye cd tabellen som inneholder alle cd titlene som inneholder delstrengen
	 */
	
	CD[] sokTittel(String delstreng);
	/**
	 * 
	 * @param søker opp cd nr ved bruk av løkke gjennom tabellen
	 * @return returnerer CD-en 
	 */
	
	CD sokCD(int nr);
	/**
	 * 
	 * @param går gjennom alle artistnavnene og ser om de inneholder delstrengen
	 * hvis de gjør det blir de lagt inn i den nye tabellen
	 * @return returnerer den nye cd tabellen som inneholder alle artistnavnene som inneholder delstrengen
	 */
	
	CD[] sokArtist(String delstreng);
	
	/**
	 * 
	 * @param søker gjennom tabellen ved å bruke .getSjanger for å finne ut antallet av den valgte sjangeren
	 * @return returnerer antall sjanger
	 */
	
	int antallSjanger(Sjanger sjanger);
	
	/**
	 * 
	 * @return returnerer antallet av cder i cd arkivet
	 */
	
	int antall();
	
	


}
