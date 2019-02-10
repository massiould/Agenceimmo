/*
 * @author Kamal Aarab and Massi Ouldrabah
 */

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppartementTest {
	Appartement appartement;
	Personne vendeur;
	/**
	 * teste de ma classe Appartement
	 */

	@Before
	public void setUp() throws Exception {
		vendeur = new Personne( "nom",  "adressePersonne",  "mail",  "numeroDeTelephone");
		appartement = new Appartement("toulouse", "sud", 500000, "01/01/2000", vendeur,5,3,140);
	}
 
	

	

	

	

}
