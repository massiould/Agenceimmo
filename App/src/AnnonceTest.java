/*
 * @author Kamal Aarab and Massi Ouldrabah
 */
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AnnonceTest {
	BienImmobilier bien;
	Annonce annonce;
	Personne vendeur;
	Description description;
	/**
	 * teste de ma classe Voeux
	 */
	@Before
	public void setUp() throws Exception {
		
		bien = new BienImmobilier( "toulouse", "sud", 500000, "01/01/2000", vendeur);
		
	}

	
	/**
	 * teste la methode Ajouterannonce
	 * verifie que l annonce est prise en compte
	 */
	@Test
	public void testAjouterAnnonce() {
		annonce.ajouterAnnonce(bien);
		assertEquals(annonce.bienImmobilier,bien);
	}



}
