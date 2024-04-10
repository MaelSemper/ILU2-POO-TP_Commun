package model;

public class CalendrierAnnuel {
	Mois[] calendrier;

	public CalendrierAnnuel() {
		calendrier = new Mois[12];
		String[] nom = { "Janvier", "Fevrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre",
				"Octobre", "Novembre", "Decembre" };
		for (int i = 0; i < 12; i++) {
			if (i < 7) {
				if (i == 1) {
					calendrier[i] = new Mois(nom[i], 28);
				} else if (i % 2 == 0) {
					calendrier[i] = new Mois(nom[i], 31);
				} else {
					calendrier[i] = new Mois(nom[i], 30);
				}
			}

			else {
				if (i % 2 == 1) {
					calendrier[i] = new Mois(nom[i], 31);
				} else {
					calendrier[i] = new Mois(nom[i], 30);
				}
			}
		}
	}

	public boolean estLibre(int jour, int mois) {
		return calendrier[mois - 1].estLibre(jour);
	}

	public boolean reserver(int jour, int mois) {
		if (estLibre(jour, mois)) {
			calendrier[mois - 1].reserver(jour);
			return true;
		}
		return false;
	}

	private static class Mois {
		private String nom;
		private boolean[] jour;

		public Mois(String nom, int nbJour) {
			this.nom = nom;
			jour = new boolean[nbJour];
		}

		private boolean estLibre(int nuJour) {
			return !jour[nuJour - 1];
		}

		private void reserver(int nuJour) {
			if (estLibre(nuJour)) {
				jour[nuJour - 1] = true;
			} else {
				throw new IllegalStateException();
			}
		}
	}
}
