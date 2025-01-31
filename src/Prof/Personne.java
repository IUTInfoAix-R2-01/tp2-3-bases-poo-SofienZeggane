package Prof;

public class Personne {
		String Nom;
		String Prenom;
		
		public Personne(String Nom, String Prenom) {
			this.Prenom = Prenom;
			this.Nom = Nom;
		}
		
		public Personne(String Prenom) {
			this.Prenom = Prenom;
		}
		
		public String getNom() {
			return Nom;
		}
		
		public void setNom(String nom) {
			this.Nom = nom;
		}
		
		public String getPrenom() {
			return Prenom;
		}
		
		public void setPrenom(String prenom) {
			this.Prenom = prenom;
		}
		
		@Override
		public String toString() {
			if (this.Nom == null) {
				return "Personne [prenom = " + Prenom + "]";
			}
			return "Personne[nom= " + Nom + " prenom = " + Prenom + "]";
		}
			
}
