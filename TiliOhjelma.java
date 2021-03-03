package Viikko7;

//OHJELMALUOKKA

public class TiliOhjelma {

	public static void main(String[] args) {
		// TILI-OLION LUONTI OLION PERUSLUONTITAVALLA
		Tili tili = new Tili(10);
		// KÄYTETÄÄN TILI-OLION METODIA TALLETA
		tili.setSaldo(4000000);
		// LUODAAN ASIAKAS OLIO, JOTTA SAADAAN TILILLE OMISTAJA
		Asiakas asiakas = new Asiakas();
		asiakas.setNimi("Bill Gates");
		
		Asiakas hetu = new Asiakas();
		asiakas.setHetu("040190-1090");
		
		// SEURAAVAKSI TÄRKEIN, ELI ETTÄ ASETETAAN TILILLE
		// OMISTAJA, ELI TILILLE TULEE YHTEYS BILL GATESIIN
		tili.setAsiakas(asiakas);
		tili.setHetu(hetu);
		
		System.out.println(tili);
	}

}
