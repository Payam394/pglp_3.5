import java.time.LocalDateTime;

public class Affichage {
	
	
	public void DebutDeMethode(String nomMethode) {
		System.out.println(LocalDateTime.now() + ": Début de " + nomMethode);
		
	}
	
	public void FinDeMethode(String nomMethode) {
		System.out.println(LocalDateTime.now() + ": Fin de " + nomMethode);
		
	}
	
}
