package de.hska.iwi.ads.junit;

/**
  Eine Person mit Name und positivem Alter, die
  verheiratet sein kann.
 */
public class Person {

	/**
	 darf nicht null sein
	 */
	private String name;

	/**
	 alter &gt; 0
	 */
	private int alter = 18;
	
	/**
	 optional
	 */
	private Person ehegatte;

    /**
     * Erzeugt eine Person mit einem Namen und
     * einen positivem Alter.
     * 
     * @param alter  muss &gt; 0 sein
     * @param name   darf nicht null sein
     * 
     * @throws IllegalArgumentException  falls das alter &le; 0 ist oder
     *                                   name null war
     */
    public Person(int alter, String name) {
    	if (alter <= 0) {
    		throw new IllegalArgumentException();
    	}
    	if (name == null) {
    		throw new IllegalArgumentException();
    	}
    	this.alter = alter;
    	this.name = name;
    }

    /**
     * Erzeugt wie {@link #Person(int, String)} ein
     * neue Person mit dem festen Alter 18.
     */
    public Person(String name) {
    	this(18, name);
    }


    
    /**
     * Heiratet eine andere unverheiratet volljährige Person.
     * Falls diese Person und ehegatte volljährig und unverheiratet sind,
     * dann sind nach dem Heiraten gegenseitig verheiratet und haben
     * ihren Namen zu einem Bindestrichnachnamen geändert.
     * Ansonsten macht die Methode nichts.
     * 
     * @param ehegatte darf nicht null, soll unverheiratet sein
     */
    public void heiraten(Person ehegatte) {
      if (ehegatte != null && this != ehegatte
    		  && ! this.isVerheiratet() && ! ehegatte.isVerheiratet()
    		  && this.alter >= 18 && ehegatte.alter >= 18) {
      	this.name = this.name + "-" + ehegatte.name;
      	ehegatte.name = this.name;
      	this.ehegatte = ehegatte;
      	ehegatte.ehegatte = this;
      }
	}
	
    /**
     * Scheidet dieser Person von seinem ehegatten, wenn beide
     * miteinander verheiratet sind. Beide sind danach ledig.
     * Macht nichts bei einer unverheirateten Person.
     */
	public void scheiden() {
		  if ( this.isVerheiratet() ) {
			  this.ehegatte.ehegatte = null;
			  this.ehegatte = null;
		  }		
		}
	
	/**
	 Siehe {@link #name}
	 */
    public String getName() {
    	return this.name;
    }
    
    /**
     * Gibt das positive Alter dieser Person zurück.
     */
    public int getAlter() {
    	return this.alter;
    }
    
    /**
     * Setzt das alter dieser Person auf den gegebenen Wert,
     * der größer als 0 sein muss.
     * Falls diese Person verheiratet ist, muss das alter mindestens
     * 18 sein.
     * @param alter größer 0 oder mindestens 18 bei einer verheirateten Person
     * @throws IllegalArgumentException  falls alter kleiner oder gleich 0
     *               oder kleiner 18, bei einer unverheirateten Person war
     */
    public void setAlter(int alter) {
    	if (alter <= 0) {
    		throw new IllegalArgumentException();
    	}
    	if ( isVerheiratet() & alter < 18) {
    		throw new IllegalArgumentException();    		
    	}
    	this.alter = alter;
    }
  
    /**
     * Gibt true genau dann, wenn diese Person verheiratet ist.
     */
    public boolean isVerheiratet() {
    	return this.ehegatte != null;
    }
    
    
    public Person getEhegatte() {
    	return this.ehegatte;
    }

    /**
     * Gibt genau dann true zurück, wenn
     * beide Personen volljährig und unverheiratet sind.
     * 
     * @param person  darf nicht null sein
     */
	public boolean darfHeiraten(Person person) {
		return ! this.isVerheiratet() && this.alter >= 18
	       && person != null && ! person.isVerheiratet()
	       && person.alter >= 18;
	}
    
}
