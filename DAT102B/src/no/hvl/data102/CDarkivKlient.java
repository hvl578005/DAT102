package no.hvl.data102;
import no.hvl.data102.adt.*;

public class CDarkivKlient {

	public static void main(String[] args) {
		int n = 0;
		
		CDarkivADT cda = new CDarkiv(n); 
		Meny meny = new Meny(cda);
		meny.start();

	}

}
