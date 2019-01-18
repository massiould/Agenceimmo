/*
 * @author Kamal Aarab and Massi Ouldrabah
 */

public class Voeux {

	int prixSouhaite;
	int surfaceSouhaitee;
	String localisationSouhaitee;
	int nbPieceSouhaitee;
	String typeDeBien;

	public Voeux( int prixSouhaite , int surfaceSouhaitee, String localisationSouhaitee, int nbPieceSouhaitee, String typeDeBien ) {
		this.prixSouhaite = prixSouhaite;
		this.surfaceSouhaitee = surfaceSouhaitee;
		this.typeDeBien = typeDeBien;
		this.localisationSouhaitee = localisationSouhaitee;

		if(typeDeBien == "terrain") {
			this.nbPieceSouhaitee = 0;
		} else { 		
			this.nbPieceSouhaitee = nbPieceSouhaitee;
		}


	}

}
