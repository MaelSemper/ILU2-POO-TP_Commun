package model;

public class ReservationRestaurant extends Reservation {
	int numService;
	int numTable;
	
	public ReservationRestaurant(int jour, int mois, int numService, int numTable) {
		super(mois,jour);
		this.numService = numService;
		this.numTable = numTable;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String i = "premier";
		if(numService == 2) {
			i = "deuxieme";
		}
		StringBuilder mess = new StringBuilder();
		mess.append("table n° ");
		mess.append(numTable);
		mess.append(" Pour le ");
		mess.append(i);
		mess.append(" service."); 
		return super.toString() + mess;
	}
}
