
public class UneClasseMetier extends Affichage{
	
	String Metier;
	
	
	
	public UneClasseMetier(String metier) {
		Metier = metier;
	}



	public void uneMethodeMetier () {
		this.DebutDeMethode(Metier);
		
		/*
		 * Traitemenet metiers
		 */
		
		this.FinDeMethode(Metier);
	}

}
