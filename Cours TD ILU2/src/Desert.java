
public class Desert implements Monde{
	private int dimension;
	private String nature;
	private String animal;
	
	public Desert(int dimension, String nature, String animal) {
		this.dimension = dimension;
		this.nature = nature;
		this.animal = animal;
	}
	
	
	public String afficherDecors() {
		return "Nous sommes dans un desert de " + nature + ", s'�tendant sur plus de " +
				dimension + " km�";
	}
	
	@Override
	public String afficherDanger() {
		return "Le soleil et l'absence d'eau ne sont pas les seuls dangers, car non loin " + animal + " s'approche";
	}

}
