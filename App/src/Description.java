/*
 * @author Kamal Aarab
 */
public class Description {

	Annonce annonce;
	BienImmobilier bienImmobilier;
	ArraList<Docs> doc;
	
	public Description(Annonce annonce, BienImmobilier bienImmo) {
		this.annonce = annonce;
		this.bienImmobilier = bienImmo;
		
	}
}
