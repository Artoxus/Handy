package Main;

import java.util.Scanner;

public class AssistantHandy {
	Scanner scanner = new Scanner(System.in);
	boolean utilise;
	
	public AssistantHandy() {
		System.out.println("Initialisation de l'assistant vocal.");
		activationVocal();
	}
	
	public void activationVocal() {
		System.out.println("Voulez vous activer l'assistant vocal? (oui ou non)");
		if(scanner.nextLine().toLowerCase().equals("oui")) {
			this.utilise = true;
		}
		else {
			this.utilise = false;
		}
	}
	
	public void run() {
		boolean fini = false;
		String texte;
		System.out.println("\nBienvenu dans le menu de Handy, votre assistant vocal.");
		while(!fini) {
			System.out.println("Que voulez vous modifier? Voici qui suit les choix que vous avez :");
			System.out.println("handy (pour choisir si vous voulez l'activez ou non), non (pour quitter)");
			texte = scanner.nextLine().toLowerCase();
			if(texte.equals("non")) {
				fini = true;
			}
			else if(texte.equals("handy")) {
				activationVocal();
			}
		}
	}
}
