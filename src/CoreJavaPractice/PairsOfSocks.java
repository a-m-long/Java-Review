package CoreJavaPractice;

import java.util.HashSet;


public class PairsOfSocks {
	
	
	public static void main (String[] args) {
		/*
		 * Finding pairs in an array. 
		 */
		
		//you want to read through n and an array that contains the value of n
		
		//find the pairs
		int pairs = 0;
		//array provided
		int[] colors = new int[] {1,1,2,3,2,1,2};
		
		//want to add or remove colors
		HashSet<Integer> col = new HashSet<>();
		
		for(int i: colors) {
			
			if(!col.contains(colors[i])) {
				col.add(colors[i]);
				
			}
			
			else {
				col.remove(colors[i]);
				pairs++;
				
			}	
		}
		
		
		System.out.println("These are the pairs you have afer: "+pairs);
		System.out.println("Colors that aren't paired: "+col);
		
		
		
		
		
		
	}


}
