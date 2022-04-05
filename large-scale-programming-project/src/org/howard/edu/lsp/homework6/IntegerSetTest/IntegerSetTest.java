package org.howard.edu.lsp.homework6.IntegerSetTest;

import org.howard.edu.lsp.homework5.implementation.IntegerSet;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName; 
import org.junit.jupiter.*;

public class IntegerSetTest {
	
	@Test
	@DisplayName("IntegerSet.isEmpty test cases")
		public void testIsEmpty() {
		IntegerSet set1 = new IntegerSet(); 
		assertTrue(set1.isEmpty()); 
		
		set1.add(1);
		assertFalse(set1.isEmpty()); 
		
	}
	@Test
	@DisplayName("IntegerSet.union test cases")
		public void testUnion() {
		IntegerSet set1 = new IntegerSet(); 
		
		set1.add(1);
		set1.add(2);
		
		IntegerSet set2 = new IntegerSet(); 
		set2.add(3);
	}

}
