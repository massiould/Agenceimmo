/*
 * @author Kamal Aarab and Massi Ouldrabah
 */
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonneTest {
	Personne vendeur;
	Personne acheteur;
	Voeux voeux;
	
	/**
	 * teste de ma classe Personne
	 */


	
	
	
	

	@Before
	public void setUp() throws Exception {
		vendeur = new Personne( "nom",  "adressePersonne",  "mail",  "numeroDeTelephone");
		acheteur = new Personne("nom",  "adressePersonne",  "mail",  "numeroDeTelephone",voeux);
		voeux = new Voeux( 50000 , "toulouse", 25, "Appartement",6);
	}

	@After
	public void tearDown() throws Exception {
	}


	/**
	 * test de la methode toString
	 */


	@Test
	public void testToString() {
		assertEquals("nom Tel : numeroDeTelephone",vendeur.toString());
	}

	

}
