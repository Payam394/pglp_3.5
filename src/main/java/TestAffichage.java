import org.junit.Test;
import static org.junit.Assert.*;

public class TestAffichage {
	
	UneClasseMetier m = new UneClasseMetier("m");
	
	@Test
	public void TestDebut() {
		m.uneMethodeMetier();
	}

}
