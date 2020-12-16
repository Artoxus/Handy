package Main;

import java.util.Scanner;

public class Carte {
	Scanner scanner = new Scanner(System.in);
	String recherche; // database
	String[] map; // database
	String[] routesImpraticables; // database
	
	public Carte() {
		this.recherche = "";
		this.map = mapVierge();
		this.routesImpraticables = new String[0];
		
	}
	public String[] mapVierge() {
		String[] carte = new String[0];
		
		return carte;
	}
	
	public String[] mauvaisesRoutes() {
		String[] routes = new String[0];
		
		return routes;
	}
	
	public String[] parametresBase() {
		String[] parametres = new String[0];
		
		return parametres;
	}
	
	public String[] trouve() {
		String[] reponses = new String[0];
		
		return reponses;
	}
	
	public String barreRecherche() {
		boolean fini = false;
		int num;
		String[] rep;
		while(!fini) {
			System.out.println("Que cherchez vous?");
			this.recherche = scanner.nextLine();
			rep = this.trouve();
			System.out.println("Ou voulez vous aller (donnez un nombre)? Dites '0' pour chercher autre chose, et '-1' pour quitter.");
			String entree = scanner.nextLine().toLowerCase();
			if(!entree.equals("0") && !entree.equals("-1") && !fini) {
				try {
					num = Integer.parseInt(entree);
					return rep[num +1];
				}
				catch(Exception e) {
					System.out.println("Donnez un nombre pour avoir une réponse");
					entree = scanner.nextLine().toLowerCase();
				}
			}
			else if(entree.equals("-1")) {
				fini = true;
			}
			
		}
		return "Recherche terminée";

	}
	
	public void run() {
		boolean fini = false;
		String texte;
		System.out.println("\nBienvenu dans le menu de la Carte.");
		while(!fini) {
			System.out.println("Que voulez vous modifier? Voici qui suit les choix que vous avez :");
			System.out.println("recherche (pour trouver un lieu), non (pour quitter)");
			texte = scanner.nextLine().toLowerCase();
			if(texte.equals("non")) {
				fini = true;
			}
			else if(texte.equals("recherche")) {
				barreRecherche();
			}
		}
		
	}

}
