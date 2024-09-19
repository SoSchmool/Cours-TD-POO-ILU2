
public class Proie extends Animal{
	private String[] aliments = new String[100];
	private int nbAliments = 0;
	
	
	public Proie(String nom, String aliment) {
		super(nom);
		ajouterAliment(aliment);
	}
	
	public void ajouterAliment(String aliment) {
		aliments[nbAliments] = aliment;
		nbAliments++;
	}

	@Override
	public void rencontre(Animal animal) {
		System.out.print(this + " voit " +animal);
		if(animal instanceof Proie) {
			System.out.println(" et d�cide de l'approcher");
		}else {
			System.out.println(", s'affole et cours partout" + " � la recherche d'une bonne cachette");
		}
		
	}
}