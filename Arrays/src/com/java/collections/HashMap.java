package com.java.collections;

import java.util.Iterator;
import java.util.Map;
public class HashMap {
	
	public static void main(String[] args) {
		try {

			@SuppressWarnings("unchecked")
			Map<String, String> mMap = (Map<String, String>) new HashMap();
			mMap.put("PostgreSQL", "Free Open Source Enterprise Database");
			mMap.put("DB2", "Enterprise Database , It's expensive");
			mMap.put("Oracle", "Enterprise Database , It's expensive");
			mMap.put("MySQL", "Free Open SourceDatabase");

			Iterator<?> iter = mMap.entrySet().iterator();

			while (iter.hasNext()) {
				@SuppressWarnings("rawtypes")
				Map.Entry mEntry = (Map.Entry) iter.next();
				System.out.println(mEntry.getKey() + " : " + mEntry.getValue());
			}

			mMap.put("Oracle", "Enterprise Database , It's free now ! (hope)");

			System.out.println("One day Oracle.. : " + mMap.get("Oracle"));

		} catch (Exception e) {
			System.out.println(e.toString());
	}
}		
}		
	   
    
