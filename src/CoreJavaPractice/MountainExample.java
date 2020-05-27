package CoreJavaPractice;

public class MountainExample {
	
	
	public static void main(String[] args) {
		
		int n =0;
		String sequence = "UDDDUDUU";
		char[] value = sequence.toCharArray(); 
		int count =0;
		
		for(int i=0; i<value.length; i++) {


			  if (value[i]=='D'){
	               count+=1;
	           }
	           if(value[i]=='U'){
	               count = count -1;
	           }
	           if(count == 0) {
	        	   n=n+1;
	           }
				
			
			///what if there are only Ds? 
	 
			
			System.out.print(value[i] + " ");	
		}
		System.out.println(n);
		
	}

}
