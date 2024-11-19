package association.membres;

import association.missions.Mission;

public class Restreint extends CM{
	private int nbCl�s;
	
	public Restreint(String nom, int motivation, boolean cl�, Mission responsable) {
		super(nom, motivation, cl�, responsable);
	}
	
	public void donnerCl�(Actif actif) {
		if (nbCl�s <= 0) {
			System.out.println("Il n'y a plus de cl�s");
		}else {
			actif.recevoirCl�();
		}
	}
	
	public void evaluerMotivation(Associatif membre) {
		if (membre.getMotivation() >= 50) {
			System.out.println(this.getNom() + " : " + "Continue comme �a !");
			membre.plusMotiv�();
		}else {
			System.out.println(this.getNom() + " : " + "Il va falloir �tre plus investi !");
			membre.moinsMotiv�();
		}
		/*if(membre.getMotivation() == 0) {*/
			
		
	}

}
