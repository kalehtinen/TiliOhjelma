package Viikko7;

// KOHDELUOKKA
// ASIOIDEN JÄRJESTYS ON AINA KUTEN SEURAAVASSA

public class Asiakas {

	// 1.ATRIBUUTTI ELI OMINAISUUS
	
	private String nimi;
	private String hetu;
	
	
	// 2. KONSTRUKTORIT
	
	public Asiakas() {
		super();
	}


	public Asiakas(String nimi, String hetu) {
		this.nimi = nimi;
		this.hetu = hetu;
	}
	
	// 3. GET JA SET METODIT

	public String getNimi() {
		return nimi;
	}


	public void setNimi(String nimi) {
		this.nimi = nimi;
	}


	public String getHetu() {
		return hetu;
	}


	public void setHetu(String hetu) {
		this.hetu = hetu;
	}
	
	// 4. TOSTRING-METODIT
	
	@Override
	public String toString() {
		return "Asiakas [nimi=" + nimi + ", hetu=" + hetu + "]";
	}

	
}
