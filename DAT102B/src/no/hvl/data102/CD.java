package no.hvl.data102;

public class CD {
	private int cdnummer;
	private String navn;
	private String tittel;
	private int år;
	private Sjanger sjanger;
	private String plateselskap;
	
	
	public CD () {
	}
	
	public CD (int cdnummer, String navn, String tittel, int år, Sjanger sjanger,
			String plateselskap) {
		this.cdnummer = cdnummer;
		this.navn = navn;
		this.tittel = tittel;
		this.år = år;
		this.sjanger = sjanger;
		this.plateselskap = plateselskap;
	}

	public int getCdnummer() {
		return cdnummer;
	}

	public void setCdnummer(int cdnummer) {
		this.cdnummer = cdnummer;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public String getTittel() {
		return tittel;
	}

	public void setTittel(String tittel) {
		this.tittel = tittel;
	}

	public int getÅr() {
		return år;
	}

	public void setÅr(int år) {
		this.år = år;
	}

	public Sjanger getSjanger() {
		return sjanger;
	}

	public void setSjanger(Sjanger sjanger) {
		this.sjanger = sjanger;
	}

	public String getPlateselskap() {
		return plateselskap;
	}

	public void setPlateselskap(String plateselskap) {
		this.plateselskap = plateselskap;
	}
	
	public String toString() {
		String ut = cdnummer + "\n" + navn + "\n" + tittel + "\n" + år + "\n" + sjanger + "\n" + plateselskap;
		return ut;
	}
	


}

