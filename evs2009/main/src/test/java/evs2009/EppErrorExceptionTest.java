package evs2009;

import static org.junit.Assert.*;

import java.sql.Date;
//import static org.junit.Assert.assertFalse;
//import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;


/**
 * Diese Klasse testet die Methoden der Klasse EppErrorException
 * @author Klune Schuschnig
 *
 */
public class EppErrorExceptionTest {
	
	EppErrorException error;
	
//	public CautiousStreakFollowerTest(String name) {
//		super(name);
//	}
	
	/**
	 * Kein setUp notwendig bei diesem Test
	 */
	@Before
	public void setUp() {
	}
	
	/**
	 * Erzeugen einer Fehlermeldung EppErrorException. 
	 * Diese anschliesend werfen.
	 * Erwartetes Ergebnis: Die Exception mit einem Paramter
	 * Ergebnis: Die Exception mit einem Parameter
	 */
	@Test (expected = EppErrorException.class)
	public void eppException1ClauseTest() {
		EppErrorException error = new EppErrorException(EppErrorCode.LOGIN_FAILED);
		throw(error);
	}
	
	/**
	 * Erzeugen einer Fehlermeldung EppErrorException. 
	 * Diese anschliesend werfen.
	 * Erwartetes Ergebnis: Die Exception mit zwei Paramter
	 * Ergebnis: Die Exception mit zwei Parameter
	 */
	@Test (expected = EppErrorException.class)
	public void eppException2ClauseTest() {
		EppErrorException error = new EppErrorException(EppErrorCode.NOT_LOGGED_IN,"Sie muessen sich zuerst einlogen!");
		throw(error);
	}
	
	/**
	 * Erzeugen einer Fehlermeldung EppErrorException. 
	 * Diese anschliesend werfen.
	 * Erwartetes Ergebnis: Die Exception mit zwei Paramter und einer throw clause
	 * Ergebnis: Die Exception mit zwei Parameter und einer throw clause
	 */
	@Test (expected = EppErrorException.class)
	public void eppException3ClauseTest() {
		EppErrorException error = new EppErrorException(EppErrorCode.PERMISSION_DENIED,"Falsches Passwort",new Throwable("Merkhilfe: Passwort"));
		throw(error);
	}
	
	/**
	 * Testet die Mehtode getCode
	 * Erwartetes Ergebnis: EppErrorCode.XML_ERROR
	 * Ergebnis: EppErrorCode.XML_ERROR
	 */
	@Test
	public void getCodeTest() {
		EppErrorException error = new EppErrorException(EppErrorCode.XML_ERROR);
		assertEquals(error.getCode(),EppErrorCode.XML_ERROR);
	}
	
}
