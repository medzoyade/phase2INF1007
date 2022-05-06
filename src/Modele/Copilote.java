package Modele;


public class Copilote {
	
	private String nom;
	private String prenom;
	private String numPermis;
	
	public Copilote(String nom, String prenom, String numPermis) {
	
		this.nom = nom;
		this.prenom =prenom;
		this.numPermis = numPermis;
	}
	public Copilote() {
		this.nom="Aucun";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNumPermis() {
		return numPermis;
	}

	public void setNumPermis(String numPermis) {
		this.numPermis = numPermis;
	}	

}
