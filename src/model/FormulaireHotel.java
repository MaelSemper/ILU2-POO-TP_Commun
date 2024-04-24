package model;

public class FormulaireHotel extends Formulaire {
	int numChambre;
	int nbLitDouble;
	int nbLitSimple;
	
	public FormulaireHotel(int jour,int mois, int numChambre, int nbLitDouble, int nbLitSimple) {
		super(jour,mois);
		this.numChambre = numChambre;
		this.nbLitDouble = nbLitDouble;
		this.nbLitSimple = nbLitSimple;
	}
}
