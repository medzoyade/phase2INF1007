package Controleurs;

import Modele.Retrait;
import Modele.Voiture;
import Modele.persistanceManager;

import java.util.*;

public class ControleurRetraitVehicule { 
	
	
	private boolean existe;
	private int index;
	
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public boolean isExiste() {
		return existe;
	}

	public void setExiste(boolean existe) {
		this.existe = existe;
	}


    public Retrait creerRetrait(int id, String date, String motifRetrait) {
		Retrait R = new Retrait(id,date,motifRetrait);
		return R;
	}
	
	public int saisirVoitureARetirer(String matricule, persistanceManager p) {
		
		List<Voiture> liste = new ArrayList<>();
		liste = p.getListVoiture();
		for (Voiture i : liste){
			
			if(i.getNumMatricule().equals(matricule)) {
				setIndex(liste.indexOf(i));
				setExiste(true);
				System.out.println(liste.indexOf(i));
			}
			else {
				setExiste(false);
			}

		}
		return getIndex();
	}

}
