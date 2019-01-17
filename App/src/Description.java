import java.util.ArrayList;
import java.util.List;

/*
 * @author Kamal Aarab
 */
public class Description {

	private Annonce annonce;
	private BienImmobilier bienImmobilier;
	private List<Docs> doc = new ArrayList<Docs>();

	public Description(Annonce annonce, BienImmobilier bienImmo) {
		this.annonce = annonce;
		this.bienImmobilier = bienImmo;
	}
}
