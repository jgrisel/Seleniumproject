package projet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MaClasseDeTest2 {
	@Test
public void Enseignanttest() {
	EmployeEcole enseignant1 = new Enseignant("grisel", "jules", "enseignant");
	enseignant1.setSalaire(2000);
	enseignant1.setNb_Absences_Mois_En_Cours(2);
	enseignant1.sePresenter();
	enseignant1.demanderAugmentation();
	System.out.println("J'ai été absent pendant "+ enseignant1.getNb_Absences_Mois_En_Cours() + " jours ce mois-ci.");
	Ecole ecole = new Ecole();
	ecole.augmenterSalaireEnseignant(enseignant1, 2500);
	enseignant1.sePresenter();
}
	@Test
	public void PersonnelAdministratiftest() {
		PersonnelAdministratif PersonnelAdministratif1 = new PersonnelAdministratif("thessier", "alex", "secretaire");
		PersonnelAdministratif1.setSalaire(1500);
		PersonnelAdministratif1.setNb_Absences_Mois_En_Cours(3);
		PersonnelAdministratif1.sePresenter();
		PersonnelAdministratif1.demanderAugmentation();
		System.out.println("J'ai été absent pendant "+ PersonnelAdministratif1.nb_absences_mois_en_cours + " jours ce mois-ci.");
		Ecole ecole = new Ecole();
		ecole.augmenterSalairePersoAdmin(PersonnelAdministratif1, 2000);
		PersonnelAdministratif1.sePresenter();
	}
	@Test
	public void PolymorphismeTest() {
		Personne enseignant2 = new Personne("grisel","jules");
		System.out.println("Je m'appelle "+ enseignant2.nom+" "+ enseignant2.prenom);
	}
	//exo8
	
	@Test
	public void ClassEleveTest() {
		Eleve eleve1 = new Eleve("mathieu", "serti", AgeEleve.six);
		Ecole.assignerNiveauClasse(eleve1);
		System.out.println("Je m'appelle "+ eleve1.nom + " " + eleve1.prenom + " je suis en " + eleve1.getNiveauClasse()+" et j'ai " + eleve1.age.getAge() + " ans");
		assertEquals(NiveauClasse.CP, eleve1.getNiveauClasse());
		assertEquals(AgeEleve.six, eleve1.age);
	}
	
	//exo11
	@Test
	public void Collectiontest() {
		List<EmployeEcole> liste = new ArrayList<EmployeEcole>();
		liste.add(new Enseignant("Jules","Grisel","enseignant"));
		liste.add(new Enseignant("Joe", "Frez", "enseignant"));
		liste.add(new Enseignant("Loic", "Tanzi", "enseignant"));
		liste.add(new Enseignant("Luc", "Lego", "enseignant"));
		liste.add(new PersonnelAdministratif("Pierre", "Ego", "secretaire"));
		liste.add(new PersonnelAdministratif("Paul", "Jacques", "secretaire"));
		liste.add(new PersonnelAdministratif("Nicolas", "Clauss", "secretaire"));
		
		for (EmployeEcole s : liste) {
            s.sePresenter();
            assertTrue(liste.contains(s));
        }
	}
	
	@Test (expected=AgeEleveException.class, timeout=1000)

    public void AgeEleveTestNonPassant() throws AgeEleveException {

    try {
    	Eleve eleve1 = new Eleve("mathieu", "serti", 12);
    }
    catch(AgeEleveException exemple){
        System.out.println(" SUCCES LE CAS NON PASSANT N'EST PAS PASSE!! ");
        throw exemple;
    }
    }
}
