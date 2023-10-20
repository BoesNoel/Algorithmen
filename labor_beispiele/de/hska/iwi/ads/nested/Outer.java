package de.hska.iwi.ads.nested;

public class Outer {

  private  int a;
  
  public Outer(int a) {
    this.a = a;
  }
  
  public Inner createInner() {
    return new Inner("Dinner"); // this.new Inner("Dinner");
  }
  
  private class Inner {
    
    private String name;
    
    public Inner(String name) {
      this.name = name + " for " + a;
    }
    
    public String getName() {
      return this.name;
    }
  } 
  
  public static void main(String [] s) {
    Outer outer = new Outer(1);
    Inner inner = outer.new Inner("Inner");
    System.out.println( inner.getName() );
    System.out.println( outer.createInner().getName() );
  }
}
