/*
 * @author Kamal Aarab and Massi Ouldrabah
 */
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VoeuxTest {

	Voeux voeux;
	Voeux voeux1;
	/**
	 * teste de ma classe Voeux
	 */

	 
	@Before
	public void setUp()  {
		voeux = new Voeux(50000,"toulouse","terrain",200,2);
		voeux1 = new Voeux(2000,"toulouse",500,"maison",6);
	}
	
	/**
	 * test de la methode equals
	 */
	@Test
	public void testEqualsObject() {
		assertTrue(voeux.equals(new Voeux(50000,"toulouse","terrain",200,2)));
		assertTrue(voeux1.equals(new Voeux(2000,"toulouse",500,"maison",6)));
	}
} 
