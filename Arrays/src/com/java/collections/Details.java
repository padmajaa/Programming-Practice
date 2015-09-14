package com.java.collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Set;
class Details {
	 public static void main(String args[]) {

	      /* This is how to declare HashMap */
	      HashMap<Integer, String> hmap = new HashMap<Integer, String>();

	      /*Adding elements to HashMap*/
	      hmap.put(12, "Chandhu");
	      hmap.put(2, "Rama");
	      hmap.put(7, "Srikar");
	      hmap.put(49, "Anika");
	      hmap.put(3, "Teja");
	      /* Display content using Iterator*/
	      Set<Entry<Integer, String>> set = hmap.entrySet();
	      Iterator<Entry<Integer, String>> iterator = set.iterator();
	      while(iterator.hasNext()) {
	         @SuppressWarnings("rawtypes")
			Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
	      }

	      /* Get values based on key*/
	      String var= hmap.get(2);
	      System.out.println("Value at index 2 is: "+var);

	      /* Remove values based on key*/
	      hmap.remove(3);
	      System.out.println("Map key and values after removal:");
	      Set<Entry<Integer, String>> set2 = hmap.entrySet();
	      Iterator<Entry<Integer, String>> iterator2 = set2.iterator();
	      while(iterator2.hasNext()) {
	          @SuppressWarnings("rawtypes")
			Map.Entry mentry2 = (Map.Entry)iterator2.next();
	          System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
	          System.out.println(mentry2.getValue());
	       }

	   }
	}


