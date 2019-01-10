import java.util.Date;

public class Appartement extends BienImmobilier {	
	
	private int NombreDePiece;
	private int NumeroEtage;
	private int ChargesMensuelles;
	

	public Appartement(String adresse, String orientation, int prix, Date dateVente, Date dateDeDisponibilite,
			int numeroBienImmobilier) {
		super(adresse, orientation, prix, dateVente, dateDeDisponibilite, numeroBienImmobilier);
		this.ChargesMensuelles = ChargesMensuelles;
		this.NumeroEtage = NumeroEtage;
		this.NombreDePiece = NombreDePiece;
		
		// TODO Auto-generated constructor stub
	}
	


}
