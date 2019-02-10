

public class Voeux {
	 
	 int prixSouhaitee;
	 int surfaceSouhaitee;
	 String localisationSouhaitee;
	 int nbrPieceSouhaitee;
	 String typeDeBien;
	 int surfaceSolSouhaitee;
	 int longueurFacadeSouhaiteeTERR;
	 int nombreDePieceAPP; 
	
	 public Voeux( int prixSouhaitee , String localisationSouhaitee, String typeDeBien, int surfaceSolSouhaitee,int longueurFacadeSouhaiteeTERR) {
		
		 this.prixSouhaitee = prixSouhaitee;
		 this.surfaceSouhaitee = surfaceSouhaitee;
		 this.localisationSouhaitee = localisationSouhaitee;
		 this.nbrPieceSouhaitee=nbrPieceSouhaitee;
		 this.typeDeBien=typeDeBien;
		 this.surfaceSolSouhaitee=surfaceSolSouhaitee;
		 this.longueurFacadeSouhaiteeTERR=longueurFacadeSouhaiteeTERR;
		 this.nombreDePieceAPP=nombreDePieceAPP;
		 
		  
	 }
	 public Voeux( int prixSouhaitee ,String localisationSouhaitee, int surfaceSouhaitee, String typeDeBien,int nombreDePieceAPP) {
			
		 this.prixSouhaitee = prixSouhaitee;
		 this.surfaceSouhaitee = surfaceSouhaitee;
		 this.localisationSouhaitee = localisationSouhaitee;
		 this.nbrPieceSouhaitee=nbrPieceSouhaitee;
		 this.typeDeBien=typeDeBien;
		 this.surfaceSolSouhaitee=surfaceSolSouhaitee;
		 this.longueurFacadeSouhaiteeTERR=longueurFacadeSouhaiteeTERR;
		 this.nombreDePieceAPP=nombreDePieceAPP;
		 
		 
	 }
	
	 public Voeux( int prixSouhaitee , int surfaceSouhaitee, String localisationSouhaitee, int nbrPieceSouhaitee, String typeDeBien, int surfaceSolSouhaitee,int longueurFacadeSouhaiteeTERR,int nombreDePieceAPP ) {
			
		 this.prixSouhaitee = prixSouhaitee;
		 this.surfaceSouhaitee = surfaceSouhaitee;
		 this.localisationSouhaitee = localisationSouhaitee;
		 this.nbrPieceSouhaitee=nbrPieceSouhaitee;
		 this.typeDeBien=typeDeBien;
		 this.surfaceSolSouhaitee=surfaceSolSouhaitee;
		 this.longueurFacadeSouhaiteeTERR=longueurFacadeSouhaiteeTERR;
		 this.nombreDePieceAPP=nombreDePieceAPP;
		 
		 
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

