package Controleurs;


import Modele.Retour;

public class ControleurRetour {

	public Retour creerRetour (String numMatricule,int numeroLocation, String idClient) {
		Retour R = new Retour(numMatricule, numeroLocation, idClient );
		return R;
	}

}

