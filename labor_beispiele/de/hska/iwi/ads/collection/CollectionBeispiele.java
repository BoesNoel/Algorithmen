package de.hska.iwi.ads.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class CollectionBeispiele {
  
  public static void main(String[] args) {

    System.out.println("-----Set Beispiel----------------");
    Set<String> namen = new HashSet<>();
    addNamen(namen);
    for (String name : namen) {
      System.out.println(name);
    }
    System.out.println("-----List Beispiel----------------");
    List<String> list = new ArrayList<>();
    addNamen(list);

    for (String name : list) {
      System.out.println(name);
    }

    System.out.println( "Listenelement mit Index 2 (3. Element) ist: " + list.get(2) );

    System.out.println("-----Map Beispiel----------------");
    Map<Integer, String> rangliste = new HashMap<>();
    rangliste.put(1, "Freya");
    rangliste.put(2, "Eilhard");
    rangliste.put(3, "Deike");
    String alterName = rangliste.put(2, "Sonja");
    System.out.println(alterName + " ist nicht mehr in der Map enthalten.");
    
    for (Entry<Integer, String> entry : rangliste.entrySet()) {
      System.out.println( entry.getKey() + " " + entry.getValue());
    }
  }
  
  public static void addNamen(Collection<String> c) {
    c.add("Freya");
    c.add("Eilhard");
    c.add("Deike");
    c.add("Eilhard");
  }
}
