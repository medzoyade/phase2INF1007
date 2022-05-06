 package Modele;
import java.util.*;

public class persistanceManager {
	
	List<Client> listClient = new ArrayList<>();
	List<Vehicule> listVehicule = new ArrayList<>();
	static List<Voiture> listVoiture = new ArrayList<>();
	List<Location> listLocation = new ArrayList<>();
	List<Reservation> listReservation = new ArrayList<>();
	List<Retour> listRetour = new ArrayList<>();
	List<Dossier> listDossier = new ArrayList<>();
	
	
	public persistanceManager() {
		initialiserVoiture();
		initialiserClient();
	}
	
	public void ajouterDossier(Dossier d) {
		listDossier.add(d);		
	}

	public void ajouterVoiture(Voiture v) {
		listVoiture.add(v);
	}
	
	public void ajouterClient(Client c) {
		listClient.add(c);
	}

	public void ajouterLocations(Location l) { 
		listLocation.add(l);
	}
	
	public void ajouterRetour(Retour r) {
		listRetour.add(r);
	}
	
	public void ajouterVehicule(Vehicule v) {
		listVehicule.add(v);
	}
	
	public void ajouterReservation(Reservation r) {
		listReservation.add(r);
	}
	
	public static void retraitVoiture(int index) {
		listVoiture.remove(index);
	}

	public List<Voiture> getListVoiture() {
		return listVoiture;
	}

	public List<Vehicule> getListVehicule() {
		return listVehicule;
	}


	public List<Dossier> getListDossier() {
		return listDossier;
	}
	
	public void initialiserVoiture() {
		Voiture v= new Voiture("Mitsubishi","Outlander","utilitaire",7, "Z",145);
		ajouterVoiture(v);
		ajouterVehicule(v);
		
		Voiture v1= new Voiture("FORD     ","F150     ","Camion   ",5, "NKI562J",257);
		ajouterVoiture(v1);
		ajouterVehicule(v1);
		
		Voiture v2= new Voiture("Mazda    ","3GT       ","simple   ",5, "UH78JI",288);
		ajouterVoiture(v2);
		ajouterVehicule(v2);
		/*int i = listVoiture.indexOf(v2);
		listVoiture.remove(i);*/
		
		Voiture v3= new Voiture("Porsche  ","Cayenne   ","prestige",5, "POI15k",145);
		ajouterVoiture(v3);
		ajouterVehicule(v3);
	}
	
	public void initialiserClient() {
		Client c = new Client ("Ngalani", "S23", "Russel", "3105 Rue du pere", 819944, "X331", 4445558);
		Copilote copilote = new Copilote();
		Dossier d = new Dossier(c,copilote,true,0,0);
		ajouterDossier(d);
		
		Client c1 = new Client ("Alioune", "S45", "Badara", "55 pere marquette", 819944, "X331", 4445558);
		Copilote copilote1 = new Copilote("jeremy","mathieu", "BG455");
		Dossier d1 = new Dossier(c1,copilote1,true,1,0);
		ajouterDossier(d1);
	}

}
