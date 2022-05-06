package Modele;

//public enum typeVehicules{simple, prestige, utilitaire}

public class Vehicule {
	
	
	private String marque;
	private String modele;
	private String type;
	public int nombreDePlaces;
	
	public Vehicule(String marque, String modele, String type, int nombreDePlaces) {
		
		this.marque = marque;
		this.modele = modele;
		this.type = type;
		this.nombreDePlaces = nombreDePlaces;
	

	}
		
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNombreDePlaces() {
		return nombreDePlaces;
	}
	public void setNombreDePlaces(int nombreDePlaces) {
		this.nombreDePlaces = nombreDePlaces;
	}
	
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	
}
