
public class Voeux {
	 
	 int prixSouhaitee;
	 int surfaceSouhaitee;
	 String localisationSouhaitee;
	 int nbrPieceSouhaitee;
	 String typeDeBien;
	 
	public Voeux( int prixSouhaitee , int surfaceSouhaitee, String localisationSouhaitee, int nbrPieceSouhaitee, String typeDeBien ) {
		
		 this.prixSouhaitee = prixSouhaitee;
		 this.surfaceSouhaitee = surfaceSouhaitee;
		 this.localisationSouhaitee = localisationSouhaitee;
		 this.nbrPieceSouhaitee=nbrPieceSouhaitee;
		 this.typeDeBien=typeDeBien;
		 
		 
	 }
	
	 
	
	 public String getlocalisationSouhaitee () {
		 return this.localisationSouhaitee;
	 }
	
	 public String gettypeDeBien () {
		 return this.typeDeBien;
	 }
	 public int prixSouhaitee() {
		 return this.prixSouhaitee;
	 }
	 public int nbrPieceSouhaitee() {
		 return this.nbrPieceSouhaitee;
	 }
	 public int surfaceSouhaitee () {
		 return this.surfaceSouhaitee;
	 }
	 
	
	
	
	
	
	
	
}
