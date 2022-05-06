package Modele;
//import java.util.*;

public class Voiture extends Vehicule{
	
	private String numMatricule;
	private int kilometrage;

	public Voiture(String marque, String modele, String type, int NombreDePlace, String numMatricule, int kilometrage) {
		super(marque, modele, type, NombreDePlace);
		this.numMatricule = numMatricule;
		this.kilometrage = kilometrage;
		
	}

	public String getNumMatricule() {
		return numMatricule;
	}

	public void setNumMatricule(String numMatricule) {
		this.numMatricule = numMatricule;
	}

	public int getKilometrage() {
		return kilometrage;
	}

	public void setKilometrage(int kilometrage) {
		this.kilometrage = kilometrage;
	}

}
