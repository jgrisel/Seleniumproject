package projet;

public interface EmployeEcole {
	
	public void sePresenter();

    public void setSalaire(double d);

    public void setNb_Absences_Mois_En_Cours(double i);
    
    public double getSalaire();
    
    public double getNb_Absences_Mois_En_Cours();
    
    public void demanderAugmentation();

}
