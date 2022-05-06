package Modele;
import java.util.*;


public class Retrait {
	private int id;
	private String date;
	private String motifRetrait;
	private List<Voiture> voiture = new ArrayList<>();
	
	public Retrait( int id, String date, String motifRetrait) {
		
		this.id=id;
		this.date=date;
		this.motifRetrait=motifRetrait;
	}
	
	public Retrait() {
		
	}
	
	public void creerListeRetrait(int index, persistanceManager p) {
		
		System.out.println("moi");
		List<Voiture> ll = new ArrayList<>();
		ll=p.getListVoiture();
		voiture.add(ll.get(index));
		p.listVoiture.remove(index);
		p.listVehicule.remove(index);
		p.retraitVoiture(index);
		
	}
	
	public void Affich() {
		
		for(Voiture elem: voiture)
		{
      	 System.out.println (elem.getMarque()+"\t"+ elem.getModele()+"\t"+ elem.getType()+"\t"+elem.getNombreDePlaces()+"\t"+elem.getNumMatricule()+"\t"+elem.getKilometrage());
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getMotifRetrait() {
		return motifRetrait;
	}

	public void setMotifRetrait(String motifRetrait) {
		this.motifRetrait = motifRetrait;
	}

	public List<Voiture> getVoiture() {
		return voiture;
	}

	public void setVoiture(List<Voiture> voiture) {
		this.voiture = voiture;
	}

}
