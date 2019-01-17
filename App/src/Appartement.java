import java.util.Date;

public class Appartement extends BienImmobilier {	

	private int nombreDePiece;
	private int numeroEtage;
	private int chargesMensuelles;


	public Appartement(String adresse, String orientation, int prix, Date dateVente, Date dateDeDisponibilite,
			int numeroBienImmobilier, Personne vendeur, int nombreDePiece, int numeroEtage, int chargesMensuelles) {
		super(adresse, orientation, prix, dateVente, dateDeDisponibilite, numeroBienImmobilier, vendeur);
		this.chargesMensuelles = chargesMensuelles;
		this.numeroEtage = numeroEtage;
		this.nombreDePiece = nombreDePiece;
	}



}
