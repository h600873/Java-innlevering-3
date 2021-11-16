package no.hvl.dat100.jplab11.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.oppgave3.Blogg;

public class SkrivBlogg{

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		String melding = "";
		Boolean test = false;
		
		try {
			
			File fil = new File(mappe +filnavn);
			PrintWriter skriver = new PrintWriter(filnavn);
			skriver.println(samling.toString());
			test = true;
			
			skriver.close();
			
		} catch (FileNotFoundException e) {
			melding = "Filen er ikke funnet";
		}
		return test;
		
		
		
		
	}
}
