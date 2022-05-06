package Modele;



public class Retour {
	private Boolean terminee;
	private int numeroLocation;
	private String numMatricule;
	private String idClient;
	private Boolean disponibilite;
	
	
public Retour(String numMatricule,int numeroLocation, String idClient) {
		
		this.numMatricule = numMatricule;
		this.numeroLocation = numeroLocation;
		this.idClient = idClient;
	
}
public Retour creerRetour(String numMatricule, int numeroLocation, String idClient) {
	Retour R = new Retour(numMatricule, numeroLocation,  idClient);
	return R;
}
public void terminer() {
	setTerminee(true);
}


	public int getNumeroLocation() {
		return numeroLocation;
	}

	public void setNumeroLocation(int numeroLocation) {
		this.numeroLocation = numeroLocation;
	}

	public String getNumMatricule() {
		return numMatricule;
	}

	public void setNumMatricule(String numMatricule) {
		this.numMatricule = numMatricule;
	}

	public Boolean getDisponibilite() {
		return disponibilite;
	}

	public void setDisponibilite(Boolean disponibilite) {
		this.disponibilite = disponibilite;
	}
	public Boolean getTerminee() {
		return terminee;
	}
	public void setTerminee(Boolean terminee) {
		this.terminee = terminee;
	}
	public String getIdClient() {
		return idClient;
	}
	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}

}
