package org.howard.edu.lsp.homework5.implementation;

import java.util.ArrayList;
import java.util.List;


public class IntegerSet {

		private List<Integer> set = new ArrayList<Integer>();
		
		public IntegerSet() 
		{
		//	this.list = list; 
		}
		
		
		public void clear() {
			set.clear();
		}

		public int length() {
			return set.size(); 	
		}
		
		public boolean equals(IntegerSet b) {
			
			 ArrayList<Integer> list2=b.list;
			   
		     if(set.size()!=list2.size()) {
		         return false;
		     }
			 return true; 
		}
		
		public boolean contains(int value) {
		
			return true; 	
		}
		
		public int largest() throws IntegerSetException {
			      
		     if(set.size()==0) {
		    	 IntegerSetException e= new IntegerSetException();
		         throw e;
		     }
		     
		     int max=0;
		     
		     for(int i=0;i<set.size();i++) {
		         if(set.get(i)>max) {
		             max=set.get(i);
		         }
		     }
		     
		     return max;
			    
		}
		
		
		public int smallest() throws IntegerSetException {
			    
		     if(set.size()==0) {
		         IntegerSetException e= new IntegerSetException();
		         throw e;
		     }
		    
		     int min=Integer.MAX_VALUE;
		    
		     for(int i=0;i<set.size();i++) {
		         if(set.get(i)<min) {
		             min=set.get(i);
		         }
		     }
		    
		     return min;
			     
		}
		
		public void add(int item) {
			boolean t=false;
		    
		     for(int i=0;i<set.size();i++) {
		        
		         if(set.get(i)==item) {
		             t =true;
		         }
		     }
		    
		     if(t==false) {
		        set.add(item);
		     }
		}
		
		public void remove(int item) {
			 for(int i=0;i<set.size();i++) {
			        
		         if(set.get(i)==item) {
		             set.remove(i);
		         }
		     }
		    
		}
		
		public void union(IntegerSet intSetb) {
			  
		     ArrayList<Integer> temp=list2.getlist();
		    
		     List<Integer> set = new HashSet<>();
		     set.addAll(set);
		     set.addAll(temp);
		    
		     ArrayList<Integer> list3= new ArrayList<>(set);
		    
		     IntegerSet list4 = new IntegerSet();
		    
		 System.out.println("union complete"); 
		    
		}
		
		public void intersect(IntegerSet intSetb) {
		     ArrayList<Integer> temp= set.getlist();
		     
		     set.retainAll(temp);
		    
		IntegerSet list4= new IntegerSet();
		    
		}
		
		public void diff(IntegerSet intSetb) {
		}
		
		boolean isEmpty() {
			return true; 
		}
		
		public String toString() {
			return "help please"; 
		}
		public class IntegerSetTest{}
		
	}

	
	

