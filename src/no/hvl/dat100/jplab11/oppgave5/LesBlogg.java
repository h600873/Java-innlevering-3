package no.hvl.dat100.jplab11.oppgave5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.*;
import no.hvl.dat100.jplab11.oppgave3.*;

import javax.swing.JOptionPane;

public class LesBlogg {

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	public static Blogg les(String mappe, String filnavn) {

		try {
			Scanner scanner = new Scanner(new File(mappe + filnavn));
			Blogg nyBlogg = new Blogg(scanner.nextInt());
			
			while(scanner.hasNextLine()) {
				String sjekk = scanner.nextLine();
				if(sjekk.contains(TEKST) || sjekk.contains(BILDE)) {
					
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
