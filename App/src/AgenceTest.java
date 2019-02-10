/*
 * @author Kamal Aarab and Massi Ouldrabah
 */
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
	
	
	/**
	 * teste de ma classe Agence
	 */

	@Before
	
	public void setup() {
		agence = new Agence("corpo");
		bien = new BienImmobilier( "toulouse", "sud", 500000, "01/01/2000", vendeur);
		annonce = new Annonce( Html, agence);
		
		vendeur =  new Personne("massi", "2 rue op", "mail", "06060606",voeux);
		acheteur = new Personne("kamal", "opo3100",  "mail", "06060606");
		
		/*rdv = new RDV(agence);*/
		terrain = new Terrain("toulouse", "sud", 500000, "01/01/2000", vendeur,50,50);
		appart = new Appartement("toulouse", "sud", 500000, "01/01/2000", vendeur,5,3,140);
		maison = new Maison("toulouse", "sud", 500000, "01/01/2000",vendeur,200, 7,5,"chauffage");
		voeux = new Voeux(50000,"toulouse","terrain",200,2);
		
		
	 
	}

	 

	
	/**
	 * teste la methode InscrireBienImmo
	 * verifie le bien est bien enregistrer 
	 * 
	 */
	@Test
	public void testInscrireBienImmo() {
		agence.inscrireBienImmo(vendeur ,"toulouse", "nord", 3000,"01/01/2019", "terrain");
		assertEquals(agence.getBienImmobilier(),bien);
	}
	

	
	/**
	 * teste la methode InscrireClient
	 * verifie si le Client est bien enregister
	 * 
	 */
	
	@Test
	public void testInscrireClient() {
		agence.inscrireClient(acheteur);
		assertEquals(agence.getClients(),"Index : 0 kamal Tel : 06060606");
	}
	
	
	
	
	/**
	 * teste la methode CheckVoeux
	 * verifie que le voeux est bien pris en compte
	 * 
	 */
	
	@Test
	public void testCheckVoeux() {
		agence.inscrireBienImmo(  vendeur ,"toulouse", "nord", 3000,"01/01/2019", "terrain");
		assertEquals(bien, agence.checkVoeux(acheteur));
	}
	
	
	
	
	

	
	
	


	}

	