package jeu.basique;

public class JeuOie {  
	  private Oie[] oies;  
	  private int nbOie = 0;  
	  private Plateau plateau = new Plateau();
	  private De des = new De();
	  
	  public JeuOie(int nbOieMax) {    
	    oies = new Oie[nbOieMax];
	  }

	  public void ajouterOie(String couleur) {  
	    if (nbOie < oies.length) {
	      oies[nbOie] = new Oie(couleur, plateau, des);
	      nbOie++;
	    }
	  }

	  
		public void jouer() {
			boolean Fin = nbOie < 2;
			while (!Fin){
				for (int i = 0 ; !Fin && i < nbOie  ; i++){
					Fin = oies[i].action();
				}
			}
		}
}
