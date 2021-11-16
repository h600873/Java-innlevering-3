package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {
	
	private Innlegg[] samling;
	private int antall;

	// TODO: objektvariable 

	public Blogg() {
		
		samling = new Innlegg[20];
		antall = 0;
	}

	public Blogg(int lengde) {
		samling = new Innlegg[lengde];
		antall = 0;
	}

	public int getAntall() {
		return antall;
	}
	
	public Innlegg[] getSamling() {
		return samling;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		boolean funnet = false;
		int pos = 0;
		while (pos < antall && !funnet) {
			if(samling[pos].getId() == innlegg.getId()) {
				funnet = true;
			} else
				pos++;
		}
		if (funnet) {
			return pos;
		} else return -1;
	
	}

	public boolean finnes(Innlegg innlegg) {
		
		for(int i = 0; i<antall; i++){
			if(samling[i].erLik(innlegg)) {
				return true;
			}
		}
		return false;
	}

	public boolean ledigPlass() {
		
		if(antall < samling.length) {
			return true;
		}else return false;

	}
	
	public boolean leggTil(Innlegg innlegg) {

		boolean ny = finnInnlegg(innlegg) == -1;
		if(ny && antall < samling.length) {
			samling[antall] = innlegg;
			antall++;
			return true;
		}
		else return false;
	}
	
	public String toString() {
		
		String tekst = antall + "\n";
		for(int i = 0; i < antall; i++) {
			tekst += samling[i].toString();
		}
		return tekst;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		
		Innlegg [] nySamling = new Innlegg[antall * 2];
		for(int i = 0; i<antall; i++) {
			nySamling[i] = samling[i];
		}
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		return true;
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		int i = 0;
		while (i<antall) {
			if(samling[i] == innlegg) {
				antall--;
				samling[i] = samling[antall];
				samling[antall] = null;
				return true;
			}else
				i++;
		}
		return false;
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}