package Modele;


public class EnregistrementClient {
	
	private Boolean terminee;
	
	public Client enregistrerClient(String nom, String idClient,  String prenom, String adresse, int tel, String numPermis, int numCarte) {
		Client c = new Client(nom, idClient, prenom, adresse,tel, numPermis, numCarte);
		return c;
	}
	
	public Copilote enregistrerCopilote(String nom, String prenom, String numPermis) {
		Copilote c = new Copilote(nom, prenom, numPermis);
		return c;
	}
	
	public Copilote enregistrerCopilote() {
		Copilote c = new Copilote();
		return c;
	}
	
	public void terminer() {
		terminee = true;
	}
	
	public Dossier creerDossier(Client client, Copilote copilote, boolean dossierActif, int location, int reservation) {
		Dossier dossier = new Dossier(client ,copilote, dossierActif, location, reservation);
		return dossier;
	}

	public Boolean getTerminee() {
		return terminee;
	}

	public void setTerminee(Boolean terminee) {
		this.terminee = terminee;
	}

}
