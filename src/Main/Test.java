package Main;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("Bonjour et bienvenu dans Handy.");
		System.out.println("Cette application va vous aider à trouver un lieu approprié.");
		boolean fini = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nNous allons commencer par configurer votre compte.");
		EcranInterfaceConsole eic = new EcranInterfaceConsole();
		System.out.println("\n"+"Que voulez vous?");
		while(!fini) {
			String texte = "";
			System.out.println("Voici le menu :");
			System.out.println("1) Rechercher un lieu");
			System.out.println("2) Carte");
			System.out.println("3) Compte");
			System.out.println("4) Parametres");
			System.out.println("5) Handy");
			texte = scanner.nextLine();
			if(texte.toLowerCase().equals("1") || texte.toLowerCase().equals("Rechercher un lieu")) {
				boolean fini2 = false;
				while(!fini2) {
					String cherche = eic.carte.barreRecherche();
					System.out.println("Voici " + cherche);
					System.out.println("Voulez vous une autre recherche de lieu?");
					texte = scanner.nextLine();
					if(texte.toLowerCase().equals("non")) {
						fini2 = true;
					}
				}
			}
			else if(texte.toLowerCase().equals("2") || texte.toLowerCase().equals("Carte")) {
				boolean fini2 = false;
				while(!fini2) {
					eic.carte.run();
					System.out.println("Voulez vous autre chose sur la carte?");
					texte = scanner.nextLine();
					if(texte.toLowerCase().equals("non")) {
						fini2 = true;
					}
					
				}
			}
			else if(texte.toLowerCase().equals("3") || texte.toLowerCase().equals("Compte")) {
				boolean fini2 = false;
				while(!fini2) {
					eic.compte.run();
					System.out.println("Voulez vous modifier autre chose sur le compte?");
					texte = scanner.nextLine();
					if(texte.toLowerCase().equals("non")) {
						fini2 = true;
					}
					
				}
			}
			else if(texte.toLowerCase().equals("4") || texte.toLowerCase().equals("Parametres")) {
				boolean fini2 = false;
				while(!fini2) {
					eic.parametres.run();
					System.out.println("Voulez vous modifier d'autres parametres?");
					texte = scanner.nextLine();
					if(texte.toLowerCase().equals("non")) {
						fini2 = true;
					}
				}
					
			}
			else if(texte.toLowerCase().equals("5") || texte.toLowerCase().equals("Handy")) {
				boolean fini2 = false;
				while(!fini2) {
					eic.handy.run();
					System.out.println("Voulez vous que Handy fasse autre chose?");
					texte = scanner.nextLine();
					if(texte.toLowerCase().equals("non")) {
						fini2 = true;
					}
					
				}
			}
			else {
				System.out.println("Le texte entré n'est pas valable, merci d'entrer un chiffre la prochaine fois.");
			}
			

			System.out.println("Voulez vous autre chose dans le menu?");
			texte = scanner.nextLine();
			if(texte.toLowerCase().equals("non")) {
				fini = true;
			}
		}
		
		
		scanner.close();
	}
}
