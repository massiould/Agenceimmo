package classes;

import java.io.Serializable;

public class Voeux implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5144550241808695443L;
	int prixSouhaitee;
	int surfaceSouhaitee;
	String localisationSouhaitee;
	int nbrPieceSouhaitee;
	String typeDeBien;
	int surfaceSolSouhaitee;
	int longueurFacadeSouhaiteeTERR;
	int nombreDePieceAPP;

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
}

