package Main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Bonjour et bienvenu dans Handy.");
		System.out.println("Cette application va vous aider à trouver un lieu approprié.");
		System.out.println("\n"+"Que voulez vous?");
		boolean fini = false;
		Scanner scanner = new Scanner(System.in);
		EcranInterfaceConsole eic = new EcranInterfaceConsole();
		while(!fini) {
			System.out.println("Voici le menu :");
			System.out.println("1) Rechercher un lieu");
			System.out.println("2) Carte");
			System.out.println("3) Compte");
			System.out.println("4) Parametres");
			System.out.println("5) Handy");
			String texte = scanner.nextLine();
			if(texte == "1" || texte == "Rechercher un lieu") {
				boolean fini2 = false;
				while(!fini2) {
					texte = scanner.nextLine();
					String cherche = eic.barreRecherche(texte);
					System.out.println("Voici " + cherche);
				}
				System.out.println("Voulez vous une autre recherche de lieu?");
				texte = scanner.nextLine();
				if(texte == "non") {
					fini2 = true;
				}
			}
			else if(texte == "2" || texte == "Carte") {
				boolean fini2 = false;
				while(!fini2) {
					
				}
				System.out.println("Voulez vous autre chose sur la carte?");
				texte = scanner.nextLine();
				if(texte == "non") {
					fini2 = true;
				}
			}
			else if(texte == "3" || texte == "Compte") {
				boolean fini2 = false;
				while(!fini2) {
					
				}
				System.out.println("Voulez vous modifier autre chose sur le compte?");
				texte = scanner.nextLine();
				if(texte == "non") {
					fini2 = true;
				}
			}
			else if(texte == "4" || texte == "Parametres") {
				boolean fini2 = false;
				while(!fini2) {
					
				}
				System.out.println("Voulez vous autre chose?");
				texte = scanner.nextLine();
				if(texte == "non") {
					fini2 = true;
				}
			}
			else if(texte == "5" || texte == "Handy") {
				boolean fini2 = false;
				while(!fini2) {
					
				}
				System.out.println("Voulez vous autre chose?");
				texte = scanner.nextLine();
				if(texte == "non") {
					fini2 = true;
				}
			}
			else {
				System.out.println("Le texte entré n'est pas valable, merci d'entrer un chiffre la prochaine fois.");
			}
			

			System.out.println("Voulez vous autre chose?");
			texte = scanner.nextLine();
			if(texte == "non") {
				fini = true;
			}
		}
		
		
		scanner.close();
	}

}
