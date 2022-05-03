package projet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
//exo 5
public class MacClasseDeTest {
	@Test
	public void Premiertest() {
		//instanciation de l'objet élève à partir du constructeur
		Eleve eleve1 = new Eleve("jules","grisel",AgeEleve.sept);
		//renseigne la variable absent par l'intermédiaire du setter
		eleve1.setAbsent(true);
		System.out.println("L'élève est absent :"+ eleve1.getAbsent());
		//assertion de vérification de la valeur true
		assertEquals(true,eleve1.getAbsent());
		assertTrue(eleve1.getAbsent());
	}

}
