package topic1;

//import java.util.Scanner;

public class StringAndNumericManipulation {
	
	public static void main(String[] args) {
		
		
//		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
//        for(int i=0;i<3;i++){
            String s1= "Willam";
            int x= 12;
            //Complete this line

            System.out.printf("%-15s%03d%n", s1, x);
        
        System.out.println("================================");
        
        
        
        int y = 40;
        
        System.out.printf("%05d", y);
        System.out.println();
        System.out.println("---------------------------");
        //if you were just going to type "System.out.print", you're second print would be on the same line.
        if ( y < 100) {
        	System.out.println(y + "0");
        	System.out.println("---------------------------");
        }
        
        String bob = "Bobby";
        
        	if (bob.length() > 3) {
        		String smallbob = bob.substring(0, 3);
        		System.out.println(smallbob);
        		System.out.println("---------------------------");
        		
        	}
        	
	}
	
	

}
