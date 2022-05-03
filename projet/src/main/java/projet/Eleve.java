//exo1
package projet;

public class Eleve extends Personne {
	
	public int age;
	public boolean absent;
	public NiveauClasse niveau_classe;

public Eleve (String nom, String prenom, int a) throws AgeEleveException {
		super(nom, prenom);
		age=a;
		if (a<6 || a>10) {
			throw new AgeEleveException("Age " + a + " incorrect");
		}
} 
	
	public void apprendre() {
	}
	
	public void setAbsent(boolean ab) {
		absent=ab;
	}
	
	public boolean getAbsent() {
		return absent;
	}
	
	public void setNiveauClasse(NiveauClasse nv) {
		niveau_classe=nv;
	}
	
	public NiveauClasse getNiveauClasse() {
		return niveau_classe;
	}
	
}