package Modele;


public class Reservation {
	private Boolean terminee;
	private String numMatricule;
	private String idClient;
	private String dateLocation;
	private String dateReservation;
	public Reservation(String numMatricule, String idClient, String dateLocation,
			String dateReservation) {
		
		this.numMatricule = numMatricule;
		this.idClient = idClient;
		this.dateLocation = dateLocation;
		this.dateReservation = dateReservation;
	}

	public Reservation creerNouvelleReservation(String numMatricule, String idClient, String dateLocation,
			String dateReservation) {
		Reservation R = new Reservation(numMatricule, idClient, dateLocation, dateReservation);
		return R;
	}


	
	

	

	public String getNumMatricule() {
		return numMatricule;
	}

	public void setNumMatricule(String numMatricule) {
		this.numMatricule = numMatricule;
	}

	public String getIdClient() {
		return idClient;
	}
	public void terminer() {
		setTerminee(true);
	}
	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}

	public String getDateLocation() {
		return dateLocation;
	}

	public void setDateLocation(String dateLocation) {
		this.dateLocation = dateLocation;
	}

	public String getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(String dateReservation) {
		this.dateReservation = dateReservation;
	}


	public Boolean getTerminee() {
		return terminee;
	}


	public void setTerminee(Boolean terminee) {
		this.terminee = terminee;
	}

	











}
