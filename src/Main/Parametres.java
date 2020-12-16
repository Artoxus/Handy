package Main;

import java.util.Scanner;

public class Parametres {
	Scanner scanner = new Scanner(System.in);
	String langue;
	//String reservation;
	//String paiement;
	String aide;
	String commentaire;

	public Parametres() {
		this.langue = "francais";
		this.aide = texteAide();
		this.commentaire = "";
	}
	
	public String texteAide() {
		return "Bonjour, si vous avez besoin d'aide, merci de contacter arthur.fiquet@efrei.net, "
				+ "l'application est en cours de d�veloppement.\nMerci pour votre aide\n";
	}
	
	public void choixLangue() {
		System.out.println("Merci de bien vouloir choisir une langue parmi :");
		System.out.println("francais, anglais");
		String texte = scanner.nextLine().toLowerCase();
		if(texte.equals("francais")) {
			System.out.println("Bien, vous avez choisis la seule langue disponible.");
		}
		else {
			System.out.println("La langue francaise est la seule disponible pour le moment (application en cours de d�vloppement.");
		}
	}
	
	public void run() {
		boolean fini = false;
		String texte;
		System.out.println("\nBienvenu dans le menu des parametres.");
		while(!fini) {
			System.out.println("Que voulez vous modifier? Voici qui suit les choix que vous avez :");
			System.out.println("langue (pour la changer), aide (pour nous contacter), commentaire (pour d�crire?), non (pour quitter)");
			texte = scanner.nextLine().toLowerCase();
			if(texte.equals("non")) {
				fini = true;
			}
			
			else if(texte.equals("langue")) {
				choixLangue();
			}
			
			else if(texte.equals("aide")) {
				System.out.println(aide);
			}
			
			else if(texte.equals("commentaire")) {
				this.commentaire = scanner.nextLine().toLowerCase();
			}
		}
	}

}
