import java.util.Date;

public class Maison extends BienImmobilier{
		private int surfaceHabitable;
		private int nombrePiece;
		private int nombreEtage;
		private String moyenDeChauffage;
		
	public Maison(String adresse, String orientation, int prix, String dateVente, String dateDeDisponibilite,
			int numeroBienImmobilier, String moyenDeChauffage, int nombreEtage, int nombrePiece) {
		super(adresse, orientation, prix, dateVente, dateDeDisponibilite, numeroBienImmobilier, getVendeur());
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
		return nombrePiece;
	}

	/**
	 * @param nombrePiece the nombrePiece to set
	 */
	public void setNombrePiece(int nombrePiece) {
		this.nombrePiece = nombrePiece;
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
