package association.membres;

public class Actif extends Associatif{
	private boolean cl�=false;

	
	public Actif(String nom, int motivation, boolean cl�) {
		super(nom, motivation);
		this.cl�=cl�;
	}
	
	public boolean avoirCl�() {
		return this.cl�;
	}
	
	public boolean recevoirCl�() {
		return this.cl�=true;
	}
	
	
	
}
