package jeu.Case;

import jeu.basique.Oie;

public class Jardin extends Case {
	
	public Jardin() {
		super(63);
	}
	
	public Case arrivee(Oie oieEnJeu){
		oieEnJeu.ajouterMessage("F�licitations ! Vous avez gagn� la partie. ");
		return null;
	}
}
