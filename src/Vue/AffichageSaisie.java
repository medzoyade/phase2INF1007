package Vue;


import java.util.Scanner;

import Controleurs.*;
import Modele.*;


public class AffichageSaisie {
	
	static Scanner scan = new Scanner(System.in);
	persistanceManager p = new persistanceManager();
	static AffichageSaisie a = new AffichageSaisie();
	
	public static void main(String[] args) {
		
		a.menu();
		
		}	

	public void menu() {
		
		clearScreen();
		
		System.out.println("GESTION PARC AUTO\n");
		System.out.println("****MENU****\n");
		System.out.println("1: Effectuer une location");
		System.out.println("2: Effectuer une reservation");
		System.out.println("3: Effectuer un retour");
		System.out.println("4: Consulter dossiers clients");
		System.out.println("5: Enregistrer un client");
		System.out.println("6: Consulter liste voitures");
		System.out.println("7: Enregistrer une voiture");
		System.out.println("8: Retrait voiture");
		
		int choix;
		choix=scan.nextInt();
		
		while (choix!=0) {
			switch(choix) {
			case 1:
				break;
			case 2:
				a.saisirReservation();
				System.out.println("Reservation enregistre avec succes!");
				menu();
				break;
			case 3:
				a.saisirRetour();
				System.out.println("Retour enregistre avec succes!");
				menu();
				break;
			case 4:
				a.AfficheListeDossier();
				System.out.println("Voulez vous effectuer !");
				System.out.println("Saisir 1 pour location, 2 pour retour 3 pour reservation ou 0 poour revenir au menu !");
				choix=scan.nextInt();
				if (choix==1) {
					
					
				}
				if (choix==2) {
					
				}
				if (choix==3) {
	
				}
				else {
				menu();
				}
				break;
			case 5:
				a.enregistrerClient();
				System.out.println("Client enregistre avec succes!");
				menu();
				break;
			case 6:
				a.AfficheListeVoiture();
				System.out.println("fin liste\n");
				p.getListVoiture().remove(0);
				a.AfficheListeVoiture();
				break;
			case 7:
				a.saisirVoiture();
				a.AfficheListeVoiture();
				a.AfficheListeVehicule();
				menu();
				break;
			case 8:
				a.AfficheListeVoiture();
				System.out.println("fin liste\n");
				a.retirerVoiture(p);
				a.AfficheListeVoiture();
				
				menu();
				break;
			}
		}
	}
	
	public static void clearScreen() {  
		try
		{	
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		}catch(Exception E)
			{
				System.out.println(E);
			}
	} 
	  
	
	public void AfficheListeVehicule() {
		
		for(Vehicule elem: p.getListVehicule())
		{
      	 System.out.println (elem.getMarque()+"\t"+ elem.getModele()+"\t"+ elem.getType()+"\t"+elem.getNombreDePlaces());
		}
	}
	
	
	public void AfficheListeVoiture() {
		
		for(Voiture elem: p.getListVoiture())
		{
      	 System.out.println (elem.getMarque()+"\t\t\t\t"+ elem.getModele()+"\t\t\t\t"+ elem.getType()+"\t\t\t\t"+elem.getNombreDePlaces()+"\t\t\t\t"+elem.getNumMatricule()+"\t\t\t\t"+elem.getKilometrage());
		}
	}
	
	public void AfficheListeDossier() {
		
		System.out.println ("Nom	Prenom	Locations	Reservations	Copilote\n");
		for(Dossier elem: p.getListDossier())
		{
      	 System.out.println (elem.getClient().getNom()+ "\t"+ elem.getClient().getPrenom()+"\t"+ elem.getLocation()+"\t\t"+elem.getReservation()+"\t\t"+elem.getCopilote().getNom());
		}
	}
	
	public void affiche() {
		System.out.println ("Ca marche");
		System.out.println(p.getListVehicule().isEmpty());
	}
	
	public void saisirVoiture() {
		
		String marque; String modele; String type; int place; String matricule; int km;
		
		System.out.println("Enregistrer une nouvelle voiture\n");		
		System.out.println("Entrer la marque");
		marque = scan.next();
		
		System.out.println("Entrer le modele");
		modele = scan.next();
		
		System.out.println("\nEntrer le type");
		type = scan.next();
		
		System.out.println("\nEntrer le nombre de place");
		place = scan.nextInt();
		
		System.out.println("\nEntrer le matricule");
		matricule = scan.next();
		
		System.out.println("\nEntrer le kilometragee");
		km = scan.nextInt();
		
		ControleurEnregistrementVoiture c = new ControleurEnregistrementVoiture();	
		EnregistrementVoiture E = c.creerEnregistrementVoiture();					
		
		Voiture v11 = E.creerVoiture( marque, modele, type, place, matricule, km);									
		E.setTerminee(true); 
		
		p.ajouterVoiture(v11);										
		p.ajouterVehicule(v11);				
		
	}

	public void enregistrerClient() {
		
		String nom; String prenom; String adresse; int tel; String numPermis; String idClient; int numCarte;
		Copilote copilote;
		
		System.out.println("Enregistrer une nouveau client\n");		
		System.out.println("Entrer le nom");
		nom = scan.next();
		System.out.println("Entrer l'idClient");
		idClient = scan.next();
		System.out.println("\nEntrer le prenom");
		prenom = scan.next();
		System.out.println("\nEntrer l'adresse");
		adresse = scan.next();
		System.out.println("\nEntrer le cellulaire");
		tel = scan.nextInt();
		System.out.println("\nEntrer le permis");
		numPermis = scan.next();
		System.out.println("\nEntrer la carte");
		numCarte = scan.nextInt();
		
		ControleurEnregistrementClient c = new ControleurEnregistrementClient();	
		EnregistrementClient E = c.creerEnregistrementClient();					
		
		Client client = E.enregistrerClient(nom, prenom, adresse, idClient , tel, numPermis, numCarte);
		
		System.out.println("\nAvez vous un copilote ?");
		String choix = scan.next();
		if (choix.equals("oui")||choix.equals("OUI")) {
			String pnom; String pprenom; String pnumPermis;
			
			System.out.println("Entrer le nom du copilote");
			pnom = scan.next();
			System.out.println("\nEntrer le prenom du copilote");
			pprenom = scan.next();
			System.out.println("\nEntrer le permis du copilote");
			pnumPermis = scan.next();
			
			copilote = E.enregistrerCopilote(pnom, pprenom, pnumPermis);
		}
		else{
			copilote = E.enregistrerCopilote();
		}
		E.setTerminee(true); 
		
		Dossier dossier = E.creerDossier(client, copilote, true, 0, 0);
		
		p.ajouterDossier(dossier);												

	}

	public void retirerVoiture(persistanceManager p) {
		ControleurRetraitVehicule c = new ControleurRetraitVehicule();
		int id; String date; String motifRetrait; String matricule;
		
		System.out.println("Effectuer un retrait\n");		
		System.out.println("Entrer l'id");
		id = scan.nextInt();
		System.out.println("\nEntrer la date");
		date = scan.next();
		System.out.println("\nEntrer le motif");
		motifRetrait = scan.next();
		
		Retrait R = c.creerRetrait(id, date, motifRetrait);
		System.out.println("Entrer le matricule du vehicule a retirer\n");	
		matricule = scan.next();
		int i = c.saisirVoitureARetirer(matricule,p);
		if(c.isExiste()==true) {
			R.creerListeRetrait(i,p);
		}
		else {
			System.out.println("\nLa voiture que vous voulez suppimer n'exixte pas !");
		}
	}
	public void saisirReservation() {
		String numMatricule; String idClient; String  dateLocation; String dateReservation;
		

		System.out.println("Enregistrer une nouvelle reservation\n");		
		System.out.println("Entrer le numero de matricule");
		numMatricule = scan.next();

			
		System.out.println("Entrer l'idClient");
		idClient = scan.next();
		System.out.println("Entrer la date de location");
		dateLocation = scan.next();
		System.out.println("Entrer la date de reservation");
		dateReservation = scan.next();
		ControleurReservavtion c = new ControleurReservavtion();	
		Reservation r = c.creerNouvelleReservation();	
		Reservation r1 = r.creerNouvelleReservation( numMatricule, idClient, dateLocation, dateReservation);									
		r.setTerminee(true);
		p.ajouterReservation(r1);	
	}
	public void saisirRetour() {
		String numMatricule; int numeroLocation; String idCLient;
		

		System.out.println("Enregistrer un nouveau retour\n");		
		System.out.println("Entrer le numero de matricule");
		numMatricule = scan.next();
		System.out.println("Entrer l'idClient");
		idCLient = scan.next();

		System.out.println("Entrer le numero de location");
		numeroLocation = scan.nextInt();
		
		ControleurRetour c = new ControleurRetour();	
		Retour r = c.creerRetour(numMatricule, numeroLocation, idCLient);	
		Retour r1 = r.creerRetour( numMatricule, numeroLocation, idCLient);									
		r.setTerminee(true);
		p.ajouterRetour(r1);	
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}