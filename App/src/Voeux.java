
public class Voeux {
	private String orientationSouhaitee;
	private int prixSouhaitee;
	private int surfaceSouhaitee;
	private String localisationSouhaitee;
	private int nbrPieceSouhaitee;
	private int typeDeBien;
	 public Voeux(String orientationSouhaitee, int prixSouhaitee , int surfaceSouhaitee, String localisationSouhaitee, int nbrPieceSouhaitee, int typeDeBien ) {
		 this.orientationSouhaitee= orientationSouhaitee;
		 this.prixSouhaitee = prixSouhaitee;
		 this.surfaceSouhaitee = surfaceSouhaitee;
		 this.localisationSouhaitee = localisationSouhaitee;
		 this.nbrPieceSouhaitee=nbrPieceSouhaitee;
		 this.typeDeBien=typeDeBien;
		 
		 
	 }
	
	 public String getorientationSouhaitee () {
		 return this.orientationSouhaitee;
	 }
	
	 public String getlocalisationSouhaitee () {
		 return this.localisationSouhaitee;
	 }
	
	 public int gettypeDeBien () {
		 return this.typeDeBien;
	 }
	
	
	
	
	
	
}
