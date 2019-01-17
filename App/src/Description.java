import java.util.ArrayList;
import java.util.List;

/*
 * @author Kamal Aarab and Massi Ouldrabah
 */
public class Description {

	Annonce annonce;
	BienImmobilier bienImmobilier;
	List<Docs> doc = new ArrayList<Docs>();

	public Description(Annonce annonce, BienImmobilier bienImmo) {
		this.annonce = annonce;
		this.bienImmobilier = bienImmo;
	}
}
