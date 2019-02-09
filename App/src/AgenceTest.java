import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AgenceTest {
	Agence agence;
	BienImmobilier bien;
	Personne vendeur;
	Personne acheteur;
	Personne personne;
	Annonce annonce;
	RDV rdv;
	Terrain terrain;
	Appartement appart;
	Maison maison;
	Voeux voeux;
	
	Media Image;
	Media Html;
	Media Video;
	Media Texte;

	@Before
	
	public void setup() {
		agence = new Agence(null, null, null);
		bien = new BienImmobilier( "toulouse", "sud", 500000, "01/01/2000","01/01/2000",1, vendeur);
		annonce = new Annonce( Html, agence);
		/*
		 * vendeur =  new Personne("vendeur", "2 rue op", 0606060606, "mail", voeux);
			acheteur = new Personne("acheteur", "adr", "0000", "mail", "type");
		*/
		rdv = new RDV(agence);
		terrain = new Terrain("toulouse", "sud", 500000, "01/01/2000","01/01/2000",1, vendeur,50,50);
		appart = new Appartement("toulouse", "sud", 500000, "01/01/2000","01/01/2000",1, vendeur,5,3,140);
		maison = new Maison("toulouse", "sud", 500000, "01/01/2000","01/01/2000",1, "radiateur",5,3);
		voeux = new Voeux(500000,50,"toulouse",5,"TERRAIN",50,40,40);
		
		
	
	}

	@Test
	public void testAgence() {
		fail("Not yet implemented");
	}

	@Test
	public void testInscrireBienImmo() {
		agence.inscrireBienImmo( vendeur ,"toulouse", "nord", 3000,"01/01/2019", "01/01/2019", 2);
		assertEquals(agence.getBienImmobilier(),bien);
	}

	@Test
	public void testCheckVoeux() {
		agence.inscrireBienImmo( vendeur ,"toulouse", "nord", 3000,"01/01/2019", "01/01/2019", 2);
		assertEquals(bien, agence.checkVoeux(acheteur));
	}

	@Test
	public void testRetirerAnnonce() {
		fail("Not yet implemented");
	}


	}

	