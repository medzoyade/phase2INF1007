package Modele;


public class EnregistrementVoiture {
	
private Boolean terminee;
	
	public Voiture creerVoiture(String marque, String modele, String type, int nbrePlace, String matricule, int km) {
		Voiture v = new Voiture(marque, modele, type, nbrePlace,  matricule, km);
		return v;
	}
	
	public void terminer() {
		terminee = true;
	}

	public Boolean getTerminee() {
		return terminee;
	}

	public void setTerminee(Boolean terminee) {
		this.terminee = terminee;
	}

}
