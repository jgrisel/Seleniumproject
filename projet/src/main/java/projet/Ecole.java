package projet;

public final class Ecole {
	
	public static void augmenterSalaireEnseignant(EmployeEcole enseignant1, double new_salaire) {
		enseignant1.setSalaire(new_salaire);
	}
	public static void augmenterSalairePersoAdmin(PersonnelAdministratif PA, double new_salaire) {
		PA.setSalaire(new_salaire);
	}
	public static void assignerNiveauClasse(Eleve eleve) {
		switch(eleve.age.getAge()) {
		case 6 : eleve.setNiveauClasse(NiveauClasse.CP);
			System.out.println(" l'élève a "+ eleve.age.getAge()+ " ans et est au " + eleve.getNiveauClasse());break;
		case 7 : eleve.setNiveauClasse(NiveauClasse.CE1);
		System.out.println(" l'élève a "+ eleve.age.getAge()+ " ans et est au " + eleve.getNiveauClasse());break;
		case 8 : eleve.setNiveauClasse(NiveauClasse.CE2);
		System.out.println(" l'élève a "+ eleve.age.getAge()+ " ans et est au " + eleve.getNiveauClasse());break;
		case 9 : eleve.setNiveauClasse(NiveauClasse.CM1);
		System.out.println(" l'élève a "+ eleve.age.getAge()+ " ans et est au " + eleve.getNiveauClasse());break;
		case 10 : eleve.setNiveauClasse(NiveauClasse.CM2);
		System.out.println(" l'élève a "+ eleve.age.getAge()+ " ans et est au " + eleve.getNiveauClasse());break;
		}
	}
}
