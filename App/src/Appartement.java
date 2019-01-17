/*
 * @author Kamal Aarab and Massi Ouldrabah
 */

import java.util.Date;

public class Appartement extends BienImmobilier {	

	int nombreDePiece;
	int numeroEtage;
	int chargesMensuelles;


	public Appartement(String adresse, String orientation, int prix, Date dateVente, Date dateDeDisponibilite,
			int numeroBienImmobilier, Personne vendeur, int nombreDePiece, int numeroEtage, int chargesMensuelles) {
		super(adresse, orientation, prix, dateVente, dateDeDisponibilite, numeroBienImmobilier, vendeur);
		this.setChargesMensuelles(chargesMensuelles);
		this.setNumeroEtage(numeroEtage);
		this.setNombreDePiece(nombreDePiece);
	}


	/**
	 * @return the nombreDePiece
	 */
	public int getNombreDePiece() {
		return nombreDePiece;
	}


	/**
	 * @param nombreDePiece the nombreDePiece to set
	 */
	public void setNombreDePiece(int nombreDePiece) {
		this.nombreDePiece = nombreDePiece;
	}


	/**
	 * @return the numeroEtage
	 */
	public int getNumeroEtage() {
		return numeroEtage;
	}


	/**
	 * @param numeroEtage the numeroEtage to set
	 */
	public void setNumeroEtage(int numeroEtage) {
		this.numeroEtage = numeroEtage;
	}


	/**
	 * @return the chargesMensuelles
	 */
	public int getChargesMensuelles() {
		return chargesMensuelles;
	}


	/**
	 * @param chargesMensuelles the chargesMensuelles to set
	 */
	public void setChargesMensuelles(int chargesMensuelles) {
		this.chargesMensuelles = chargesMensuelles;
	}
}
