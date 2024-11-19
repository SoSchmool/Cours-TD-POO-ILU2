package jeu.Case;
import jeu.basique.Oie;

public class Puit extends Case {
	Oie Tomb�e;
	public Puit() {
		super(31);
	}

	public Case arrivee(Oie oieEnJeu) {
		Tomb�e = oieEnJeu;
		Case caseArrivee = super.arrivee(oieEnJeu);
		return caseArrivee;
	}

	public Case depart(Oie oieEnJeu) {

		if (Tomb�e.getCouleur().equals(oieEnJeu.getCouleur())){
			oieEnJeu.ajouterMessage("L'oie " + oieEnJeu.getCouleur() + " est toujours dans le puit");
			return this;
		}
		
		else{
			return (super.depart(oieEnJeu));
		}
	}
}