package projet;

import java.lang.System.Logger;

import org.slf4j.LoggerFactory;

public class Enseignant extends Personne implements EmployeEcole {
	
	public double salaire;
	public double nb_absences_mois_en_cours;
	public String poste;
	
	static org.slf4j.Logger logger = LoggerFactory.getLogger(Enseignant.class);

public Enseignant (String nom, String prenom, String po) {
		super(nom, prenom);
		poste=po;
		
		}
		public void setSalaire(double s) {
		salaire=s;
}
		public void setNb_Absences_Mois_En_Cours(double nb) {
			nb_absences_mois_en_cours=nb;
}		
		public double getSalaire() {
			return salaire;
		}
		public double getNb_Absences_Mois_En_Cours() {
			return nb_absences_mois_en_cours;
		}
		public void sePresenter(){
			System.out.println("Bonjour je m'appelle " + nom +" "+ prenom + " je suis " + poste + " je gagne " + salaire+ ".");
		}
		
		public void demanderAugmentation() {
			if (nb_absences_mois_en_cours <= 4) {
				Ecole.augmenterSalaireEnseignant(this, salaire);
			logger.info("Mon salaire a été augmenté et je touche maintenant "+ salaire);
			}
			else {
			logger.info("Mon salaire n'a pas été augmenté");
			}		
		}
}
