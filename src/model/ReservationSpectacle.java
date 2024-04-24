package model;

public class ReservationSpectacle extends Reservation {
	int numeroZone;
	int numChaise;
	
	public ReservationSpectacle(int mois, int jour,int numZone,int numCh){
		super(mois,jour);
		numeroZone = numZone;
		numChaise = numCh; 
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "zone "+numeroZone+" chaise "+numChaise;
	}
}
