package Modele;

public class Dossier { 
	
	private Client client;
	private Copilote copilote;
	private boolean dossierActif;
	private int location;
	private int reservation;
	
	public Dossier (Client client, Copilote copilote, boolean dossierActif, int location, int reservation) {
		this.client = client;
		this.copilote=copilote;
		this.dossierActif = dossierActif;
		this.location = location;
		this.reservation = reservation;
		
	}
	
	public void setDossierActif(boolean dossierActif) {
		this.dossierActif = dossierActif;
	}
	public int getLocation() {
		return location;
	}
	
	public void setLocation(int location) {
		this.location = location;
	}
	
	public int getReservation() {
		return reservation;
	}
	
	public void setReservation(int reservation) {
		this.reservation = reservation;
	}
	
	public boolean isDossierActif() {
		return dossierActif;
	}
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}

	public Copilote getCopilote() {
		return copilote;
	}

	public void setCopilote(Copilote copilote) {
		this.copilote = copilote;
	}

}
