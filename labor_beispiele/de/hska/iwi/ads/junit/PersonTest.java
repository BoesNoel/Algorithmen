package de.hska.iwi.ads.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PersonTest  {

  @Test
  void testHeiraten() {
    Person meier = new Person(27, "Meier");
    Person mueller = new Person(77, "Müller");

    meier.heiraten(mueller);

    assertTrue(meier.isVerheiratet());
    assertTrue(mueller.isVerheiratet());
    assertEquals("Meier-Müller", meier.getName());
    assertEquals("Meier-Müller", mueller.getName());
    assertEquals(meier, mueller.getEhegatte());
    assertEquals(mueller, meier.getEhegatte());
 }
  
  
  // Weitere Tests
  @Test
	public void testPersonIntString() {
		Person meier = new Person(22, "Meier");
		
		assertEquals(22, meier.getAlter());
		assertEquals("Meier", meier.getName());
		assertFalse( meier.isVerheiratet() );
	}
  
  @Test
	public void testPersonString() {
		Person meier = new Person("Mayer");
		
		assertEquals(18, meier.getAlter());
		assertEquals("Mayer", meier.getName());
		assertFalse( meier.isVerheiratet() );
	}


  @Test
	public void testHeiraten1() {
		Person schmidt = new Person(25, "Schmidt");
		Person mueller = new Person("Müller");
		
		schmidt.heiraten(mueller);

		assertEquals(18, mueller.getAlter());
		assertEquals(25, schmidt.getAlter());
		assertTrue( schmidt.isVerheiratet() );
		assertTrue( mueller.isVerheiratet() );
		assertEquals( mueller, schmidt.getEhegatte() );
		assertEquals( schmidt, mueller.getEhegatte() );
		assertEquals("Schmidt-Müller", schmidt.getName());
		assertEquals("Schmidt-Müller", mueller.getName());		
	}

  @Test
	public void testHeiraten2() {
		Person schmidt = new Person(15, "Schmidt");
		Person mueller = new Person(33, "Müller");
		
		schmidt.heiraten(mueller);
		
		assertEquals(15, schmidt.getAlter());
		assertEquals(33, mueller.getAlter());
		assertFalse( schmidt.isVerheiratet() );
		assertFalse( mueller.isVerheiratet() );
		assertEquals("Schmidt", schmidt.getName());
		assertEquals("Müller", mueller.getName());		
	}
  
  @Test
	public void testHeiraten3() {
		Person schmidt = new Person(25, "Schmidt");
		Person mueller = new Person(33, "Müller");
		Person mayer = new Person(55, "Mayer");
		schmidt.heiraten(mueller);
		
		mayer.heiraten(mueller);

		assertEquals(25, schmidt.getAlter());
		assertEquals(33, mueller.getAlter());
		assertEquals(55, mayer.getAlter());
		assertTrue( schmidt.isVerheiratet() );
		assertTrue( mueller.isVerheiratet() );
		assertFalse( mayer.isVerheiratet() );
	}
	
  @Test
	public void testIsVerheiratet() {
		Person person = new Person(25, "Meier");
		
		assertFalse( person.isVerheiratet() );
	}

	/*
  Es fehlen viele viele Tests:
  public void testScheiden() {
    fail("Not yet implemented");
  }

  public void testGetName() {
    fail("Not yet implemented");
  }

  public void testGetAlter() {
    fail("Not yet implemented");
  }

  public void testSetAlter() {
    fail("Not yet implemented");
  }
*/
}
