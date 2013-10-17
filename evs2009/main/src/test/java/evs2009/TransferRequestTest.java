package evs2009;

import static org.junit.Assert.*;

import java.sql.Date;
//import static org.junit.Assert.assertFalse;
//import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;


/**
 * Diese Klasse testet die Methoden der Klasse TransferRequest
 * @author Klune Schuschnig
 *
 */
public class TransferRequestTest {
	
	private TransferRequest tr;
	
//	public CautiousStreakFollowerTest(String name) {
//		super(name);
//	}
	
	/**
	 * Hier wird die ein Objekt der Klasse initialisiert das muss am Anfang passieren
	 */
	@Before
	public void setUp() {
		tr = new TransferRequest("peer","resource","token");
	}
	
	/**
	 * Hier wird die Methode getToken getestet
	 * Erwarteter Rueckgabewert: token
	 * Rueckgabewert: token
	 */
	@Test
	public void getTokenTest() {
		assertEquals(tr.getToken(),"token");
	}
	
	/**
	 * Hier wird die Methode getPeer getestet
	 * Erwarteter Rueckgabewert: peer
	 * Rueckgabewert: peer
	 */
	@Test
	public void getPeerTest() {
		assertEquals(tr.getPeer(),"peer");
	}
	
	
	/**
	 * Hier wird die Methode getResource getestet
	 * Erwarteter Rueckgabewert: resource
	 * Rueckgabewert: resource
	 */
	@Test
	public void getResourceTest() {
		assertEquals(tr.getResource(),"resource");
	}
	
	/**
	 * Hier wird die Methode setToken getestet
	 * Erwarteter Rueckgabewert: token2
	 * Rueckgabewert: token2
	 */
	@Test
	public void setTokenTest() {
		tr.setToken("token2");
		assertEquals(tr.getToken(),"token2");
	}
	
	/**
	 * Hier wird die Methode setPeer getestet
	 * Erwarteter Rueckgabewert: peer2
	 * Rueckgabewert: peer2
	 */
	@Test
	public void setPeerTest() {
		tr.setPeer("peer2");
		assertEquals(tr.getPeer(),"peer2");
	}
	
	
	/**
	 * Hier wird die Methode setResource getestet
	 * Erwarteter Rueckgabewert: resource2
	 * Rueckgabewert: resource2
	 */
	@Test
	public void setResourceTest() {
		tr.setResource("resource2");
		assertEquals(tr.getResource(),"resource2");
	}
	
}
