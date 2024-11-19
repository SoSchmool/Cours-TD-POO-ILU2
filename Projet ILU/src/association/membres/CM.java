package association.membres;
import association.missions.*;


public class CM extends Actif{
	private Mission responsable;
	
	public CM (String nom, int motivation, boolean cl�, Mission responsable) {
		super(nom, motivation, cl�);
		this.responsable=responsable;
	}
	
	public void afficherMissionCM() {
		responsable.afficherMission();
	}
	
	
	

}
