package Modele;


public class Client {
	private String idClient;
	private String nom;
	private String prenom;
	private String adresse;
	private int telephone;
	private String numeroPermis;
	private int NumeroCarte;
	
	public Client(String nom,String idClient, String prenom, String adresse, int telephone, String numeroPermis, int numeroCarte) {
		
		this.nom = nom;
		this.idClient = idClient;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.numeroPermis = numeroPermis;
		this.NumeroCarte = numeroCarte;
		
	}
	public String getidClient() {
		return idClient;
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getNumeroPemis() {
		return numeroPermis;
	}
	public void setNumeroPermis(String numeroPermis) {
		this.numeroPermis = numeroPermis;
	}
	public int getNumeroCarte() {
		return NumeroCarte;
	}
	public void setNumeroCarte(int numeroCarte) {
		NumeroCarte = numeroCarte;
	}	

}
