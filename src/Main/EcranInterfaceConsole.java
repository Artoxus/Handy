package Main;

import java.util.Scanner;

public class EcranInterfaceConsole {
	Scanner scanner = new Scanner(System.in);
	Carte carte;
	Compte compte;
	Parametres parametres;
	AssistantHandy handy; // aide vocal
	
	
	public EcranInterfaceConsole() {
		this.carte = new Carte();
		this.compte = new Compte();
		this.parametres = new Parametres();
		this.handy = new AssistantHandy();
	}
	
	
}
