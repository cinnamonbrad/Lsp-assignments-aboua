package org.howard.edu.lsp.finalExam;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

public class MapUtilTest2 {

	    @Test
	    public void testCommonKeyValuePairsNull() {
	        HashMap<String, String> map1 = null;
	        HashMap<String, String> map2 = null;
	        HashMap<String, String> map3 = new HashMap<String, String>();
	        map3.put("A", "B");
	        try {
	            MapUtilities.commonKeyValuePairs(map1, map2);
	        } catch (NullMapException e) {
	            assertEquals("One or both maps are null!", e.getMessage());
	        }
	        try {
	            MapUtilities.commonKeyValuePairs(map1, map3);
	        } catch (NullMapException e) {
	            assertEquals("One or both maps are null!", e.getMessage());
	        }
	        try {
	            MapUtilities.commonKeyValuePairs(map3, map1);
	        } catch (NullMapException e) {
	            assertEquals("One or both maps are null!", e.getMessage());
	        }
	    }

	    @Test
	    public void testCommonKeyValuePairsEmpty() {
	        HashMap<String, String> map1 = new HashMap<String, String>();
	        HashMap<String, String> map2 = new HashMap<String, String>();
	        HashMap<String, String> map3 = new HashMap<String, String>();
	        map3.put("A", "B");
	        try {
	            assertEquals(0, MapUtilities.commonKeyValuePairs(map1, map2));
	        } catch (NullMapException e) {
	            e.printStackTrace();
	        }
	        try {
	            assertEquals(0, MapUtilities.commonKeyValuePairs(map1, map3));
	        } catch (NullMapException e) {
	            e.printStackTrace();
	        }
	        try {
	            assertEquals(0, MapUtilities.commonKeyValuePairs(map3, map2));
	        } catch (NullMapException e) {
	            e.printStackTrace();
	        }
	    }

	    @Test
	    public void testCommonKeyValuePairs() {
	        HashMap<String, String> map1 = new HashMap<String, String>();
	        HashMap<String, String> map2 = new HashMap<String, String>();
	        HashMap<String, String> map3 = new HashMap<String, String>();

	        map1.put("A", "B");
	        map1.put("C", "D");
	        map1.put("E", "F");

	        map2.put("A", "B");
	        map2.put("C", "D");

	        map3.put("A", "B");
	        map3.put("C", "D");
	        map3.put("E", "F");
	        try {
	            assertEquals(2, MapUtilities.commonKeyValuePairs(map1, map2));
	        } catch (NullMapException e) {
	            e.printStackTrace();
	        }
	        try {
	            assertEquals(3, MapUtilities.commonKeyValuePairs(map1, map3));
	        } catch (NullMapException e) {
	            e.printStackTrace();
	        }
	        try {
	            assertEquals(2, MapUtilities.commonKeyValuePairs(map3, map2));
	        } catch (NullMapException e) {
	            e.printStackTrace();
	        }
	    }

	    @Test
	    public void testCommonKeyValuePairs2() {
	        HashMap<String, String> map1 = new HashMap<String, String>();
	        HashMap<String, String> map2 = new HashMap<String, String>();

	        map1.put("Alice", "Healthy");
	        map1.put("Mary", "Ecstatic");
	        map1.put("Bob", "Happy");
	        map1.put("Chuck", "Fine");
	        map1.put("Felix", "Sick");

	        map2.put("Mary", "Ecstatic");
	        map2.put("Felix", "Healthy");
	        map2.put("Ricardo", "Superb");
	        map2.put("Tam", "Fine");
	        map2.put("Bob", "Happy");

	        try {
	            assertEquals(2, MapUtilities.commonKeyValuePairs(map1, map2));
	        } catch (NullMapException e) {
	            e.printStackTrace();
	        }
	    }

	    @Test
	    public void testCommonKeyValuePairs3() {
	        HashMap<String, String> map1 = new HashMap<String, String>();
	        HashMap<String, String> map2 = new HashMap<String, String>();

	        map1.put("Alice", "Healthy");
	        map1.put("Mary", "Ecstatic");
	        map1.put("Bob", "Happy");
	        map1.put("Chuck", "Fine");
	        map1.put("Felix", "Sick");

	        map2.put("alice", "Healthy");
	        map2.put("Mary", "Ecstatic");
	        map2.put("Bob", "Happy");
	        map2.put("Chuck", "Fine");
	        map2.put("Felix", "Sick");

	        try {
	            assertEquals(4, MapUtilities.commonKeyValuePairs(map1, map2));
	        } catch (NullMapException e) {
	            e.printStackTrace();
	        }
	    }

	}
