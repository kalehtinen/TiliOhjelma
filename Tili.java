package Viikko7;

public class Tili {
	
	private double saldo = 0;
	
	// LISÄTÄÄN ATRIBUUTTI ASIAKAS JOKA__EI__MISSÄÄN TAPAUKSESSA SAA OLLA STRING-TYYPPI
	// KOSKA LUODAAN SUHDETTA ASIAKAS-TIEDOSTOON
	// STRING-TYYPPIIN EI SAADA TALLENNETTUA TIETOJA JOITA ASIAKKAASTA TARVITAAN
	
	// 1.ATRIBUUTTI ELI OMINAISUUS
	
	private Asiakas asiakas = new Asiakas();

	// 2. KONSTRUKTORIT
	
	public Tili() {
		super();
	}
	
	public Tili(double saldo) {
		this.saldo = saldo;
	}


	public Tili(double saldo, Asiakas asiakas) {
		this.saldo = saldo;
		this.asiakas = asiakas;
	}

	
	// 3. GET JA SET METODIT
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Asiakas getAsiakas() {
		return asiakas;
	}

	public void setAsiakas(Asiakas asiakas) {
		this.asiakas = asiakas;
	}
	
	public void setHetu(Asiakas hetu) {
	}
	
	public Asiakas getHetu(Asiakas hetu) {
		return hetu;
	}
	
	
	
	// METODIT ELI TOIMINNALLISUUS
		// METODIT KIRJOITETAAN KUTEN ENNENKIN, MUTTA ILMAN STATIC
		// SANAA, KOSKA NIITÄ EI KUTSUTA MAINITA SUORAAN KUTEN ENNEN
		// ELI TALLENNA METODI EI PALAUTA MITÄÄN JA SAA PARAMETRINÄ SUMMAN
	
	public void talleta(double summa) {
		saldo = saldo + summa;
	}
	
	
	// 4. TOSTRING METODI
	
	@Override
	public String toString() {
		return "Tili [saldo=" + saldo + ", asiakas=" + asiakas + "]";
	}


		
}

	

