package projet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
//exo 5
public class MacClasseDeTest {
	@Test
	public void Premiertest() {
		//instanciation de l'objet �l�ve � partir du constructeur
		Eleve eleve1 = new Eleve("jules","grisel",AgeEleve.sept);
		//renseigne la variable absent par l'interm�diaire du setter
		eleve1.setAbsent(true);
		System.out.println("L'�l�ve est absent :"+ eleve1.getAbsent());
		//assertion de v�rification de la valeur true
		assertEquals(true,eleve1.getAbsent());
		assertTrue(eleve1.getAbsent());
	}

}
