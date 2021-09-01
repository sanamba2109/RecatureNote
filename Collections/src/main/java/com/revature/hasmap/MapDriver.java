package com.revature.hasmap;

import java.util.HashMap;
import java.util.Map;

public class MapDriver {

	public static void main(String[] args) {
		
		Map< String, String> languajes=new HashMap<String, String>();
		languajes.put("java", "a compiled hiht leval");
		languajes.put("Pyton", "what is payton");
		languajes.put("javaScript", "a other languaje");
		
		System.out.println("i like the languaje"+languajes.get("java"));
		
		
		
		for (String key : languajes.keySet()) {
			System.out.println("the key is"+ key);
			
		}
		

	}

}
