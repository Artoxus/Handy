package Main;

import java.util.Scanner;

public class Compte {
	Scanner scanner = new Scanner(System.in);
	String identifiant;
	String[] favoris;
	boolean[] handicaps;
	
	public Compte() {
		this.favoris = new String[0];
		nouvPseudo();
		choixHandicaps();
	}
	
	private void nouvPseudo() {
		System.out.println("Quel identifiant voulez vous choisir? (nom)");
		this.identifiant = scanner.nextLine().toLowerCase();
		System.out.println();
	}
	
	private void choixHandicaps() {
		this.handicaps = new boolean[4];
		System.out.println("Nous classons le handicaps dans 4 cat�gories, merci de dire si oui ou non elles vous concernent.");
		System.out.println("Avez vous un handicap moteur? (oui ou non)");
		String texte1 = scanner.nextLine().toLowerCase();
		if( texte1.equals("oui") ) {
			this.handicaps[0] = true;
		}
		System.out.println("Avez vous un handicap mental? (oui ou non)");
		String texte2 = scanner.nextLine();
		if( texte2.toLowerCase().equals("oui") ) {
			this.handicaps[1] = true;
		}
		System.out.println("Avez vous un handicap visuel? (oui ou non)");
		String texte3 = scanner.nextLine();
		if( texte3.toLowerCase().equals("oui") ) {
			this.handicaps[2] = true;
		}
		System.out.println("Avez vous un handicap auditif? (oui ou non)");
		String texte4 = scanner.nextLine();
		if( texte4.toLowerCase().equals("oui") ) {
			this.handicaps[3] = true;
		}
		System.out.println();
	}
	
	public void run() {
		boolean fini = false;
		String texte;
		System.out.println("\nBienvenu dans le menu du compte.");
		while(!fini) {
			System.out.println("Que voulez vous modifier? Voici qui suit les choix que vous avez :");
			System.out.println("pseudo (pour le changer), handicap (pour choisir le(s)quel(s) activer), non (pour quitter)");
			texte = scanner.nextLine().toLowerCase();
			if(texte.equals("non")) {
				fini = true;
			}
			
			else if(texte.equals("pseudo")) {
				nouvPseudo();
			}
			
			else if(texte.equals("handicaps")) {
				choixHandicaps();
			}
		}
	}
}
