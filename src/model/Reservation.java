package model;

public abstract class Reservation {
	private int mois;
	private int jour;
	
	public Reservation(int m, int j) {
		mois = m;
		jour = j;
	}
	
	@Override
	public String toString() {

		return "Le "+jour+"/"+mois+" : ";
	}
}
