package org.howard.edu.lsp.finalExam;

import org.junit.Before;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;


// Tester class
public class MapUtilTest {
	
	private HashMap<String, String> map1, map2, map3;
	
	// create maps for use of tests
	@Before
	public void setUp() {
		map1 = new HashMap<>();
		map2 = new HashMap<>();
		map3 = new HashMap<>();
		
		
		map1.put("a", "1");
		map1.put("b", "2");
		map1.put("c", "3");
		map1.put("d", "4");
		
		
		map2.put("a", "5");
		map2.put("c", "3");
		map2.put("d", "4");
		map2.put("e", "5");
		
	}
	

	@Test
	public void testNull() {
		
		// map 1 null
		try {
			MapUtilities.commonKeyValuePairs(null, map2);
			fail("Exception expected");
		} catch (NullMapException e) {
			assertEquals("One or both maps are null!", e.getMessage());
		} catch(Exception ex) {
			fail("Wrong type of exception");
		}
		
		
		// map 2 null
		try {
			MapUtilities.commonKeyValuePairs(map2, null);
			fail("Exception expected");
		} catch (NullMapException e) {
			assertEquals("One or both maps are null!", e.getMessage());
		} catch(Exception ex) {
			fail("Wrong type of exception");
		}
		
		
		// both maps null
		try {
			MapUtilities.commonKeyValuePairs(null, null);
			fail("Exception expected");
		} catch (NullMapException e) {
			assertEquals("One or both maps are null!", e.getMessage());
		} catch(Exception ex) {
			fail("Wrong type of exception");
		}
		
	}
	
	
	@Test
	public void testEmpty() throws NullMapException {
		// map 3 is empty, map 1and 2 are non empty
		assertEquals(0, MapUtilities.commonKeyValuePairs(map1, map3));
		assertEquals(0, MapUtilities.commonKeyValuePairs(map3, map2));
		assertEquals(0, MapUtilities.commonKeyValuePairs(map3, map3));
		
	}
	
	@Test
	public void testNonEmpty() throws NullMapException {
		
		assertEquals(4, MapUtilities.commonKeyValuePairs(map1, map1));
		assertEquals(4, MapUtilities.commonKeyValuePairs(map2, map2));
		assertEquals(2, MapUtilities.commonKeyValuePairs(map1, map2));
		assertEquals(2, MapUtilities.commonKeyValuePairs(map2, map1));
		
	}
	
}