/*
 * @author Kamal Aarab and Massi Ouldrabah
 */

import java.util.Date;

public class Maison extends BienImmobilier{
		int surfaceHabitable;
		int nombreDePiece;
		int nombreEtage;
		String moyenDeChauffage;
		

	public Maison(String adresse, String orientation, int prix, String dateDeDisponibilite,Personne vendeur,
			int surfaceHabitable, int nombrePiece, int nombreEtage,String moyenDeChauffage) {
		super(adresse, orientation, prix, dateDeDisponibilite, vendeur);
		this.setMoyenDeChauffage(moyenDeChauffage);
		this.setNombreEtage(nombreEtage);
		this.setNombrePiece(nombrePiece);
		// TODO Auto-generated constructor stub

	}

	/**
	 * @return the surfaceHabitable
	 */
	public int getSurfaceHabitable() {
		return surfaceHabitable;
	}

	/**
	 * @param surfaceHabitable the surfaceHabitable to set
	 */
	public void setSurfaceHabitable(int surfaceHabitable) {
		this.surfaceHabitable = surfaceHabitable;
	}

	/**
	 * @return the nombrePiece
	 */
	public int getNombrePiece() {
		return nombreDePiece;
	}

	/**
	 * @param nombrePiece the nombrePiece to set
	 */
	public void setNombrePiece(int nombrePiece) {
		this.nombreDePiece = nombrePiece;
	}

	/**
	 * @return the nombreEtage
	 */
	public int getNombreEtage() {
		return nombreEtage;
	}

	/**
	 * @param nombreEtage the nombreEtage to set
	 */
	public void setNombreEtage(int nombreEtage) {
		this.nombreEtage = nombreEtage;
	}

	/**
	 * @return the moyenDeChauffage
	 */
	public String getMoyenDeChauffage() {
		return moyenDeChauffage;
	}

	/**
	 * @param moyenDeChauffage the moyenDeChauffage to set
	 */
	public void setMoyenDeChauffage(String moyenDeChauffage) {
		this.moyenDeChauffage = moyenDeChauffage;
	}
	

}
