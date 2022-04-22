package org.howard.edu.lsp.finalExam;
import java.util.HashMap;

public class MapUtilities {
	public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2)
			throws NullMapException {
		
		if(map1 == null || map2 == null)
			throw new NullMapException("One or both maps are null!");
		
		int count = 0;
		
		for (String key1 : map1.keySet()) {
			
			if(map2.containsKey(key1) && map1.get(key1).equals(map2.get(key1)))
				count++;
			
		}
		
		return count;
		
	}
}
